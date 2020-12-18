package com.example.day_3.view;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.day_3.R;
import com.example.day_3.bean.BannerBean;
import com.example.day_3.contract.MainContract;
import com.example.day_3.presenter.MainPresenter;
import com.example.mvplibrary.base.BaseActivity;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.List;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView{

    private Banner myBanner;
//了减肥了开始父类就时空裂缝讲课视减肥了开始
    @Override
    protected void initData() {
        presenter.start();
    }

    public void initView() {
        myBanner = (Banner) findViewById(R.id.my_banner);

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter getPresenter() {
        return new MainPresenter();
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
                    Glide.with(MainActivity.this).load(image.getImageurl()).into(imageView);
                }
            }).start();
        }
    }

    @Override
    public void onHide(String str) {
        Log.e("TAG", "onHide: "+str );
    }
}