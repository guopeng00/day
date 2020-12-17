package com.example.day31.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.day31.R;
import com.example.day31.base.BaseActivity;
import com.example.day31.bean.BannerBean;
import com.example.day31.contract.MainContract;
import com.example.day31.presenter.MainPresenter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.List;

public class BannerActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView {

    private Banner myBanner;

    @Override
    protected void initData() {
        presenter.start();
    }

    public void initView() {
        myBanner = (Banner) findViewById(R.id.my_banner);
    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_banner;
    }

    @Override
    public void onShow(Object object) {
        if(object instanceof BannerBean){
            BannerBean bannerBean= (BannerBean) object;
            List<BannerBean.BannerlistBean> bannerlist = bannerBean.getBannerlist();
            myBanner.setImages(bannerlist).setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    BannerBean.BannerlistBean image= (BannerBean.BannerlistBean) path;
                    Glide.with(BannerActivity.this).load(image.getImageurl()).into(imageView);
                }
            }).start();
        }
    }

    @Override
    public void onHide(String str) {
        Log.e("TAG", "onHide: " + str);
    }
}