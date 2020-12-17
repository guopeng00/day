package com.example.day31.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day31.R;
import com.example.day31.base.BaseActivity;
import com.example.day31.contract.MainContract;
import com.example.day31.presenter.MainPresenter;
import com.youth.banner.Banner;

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
        return new MainPresenter();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_banner;
    }

    @Override
    public void onShow(Object object) {

    }

    @Override
    public void onHide(String str) {

    }
}