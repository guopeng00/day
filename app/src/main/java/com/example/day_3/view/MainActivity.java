package com.example.day_3.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day_3.R;
import com.example.day_3.base.BaseActivity;
import com.example.day_3.contract.MainContract;
import com.example.day_3.presenter.MainPresenter;
import com.youth.banner.Banner;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView{

    private Banner myBanner;

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
        return new MainPresenter(this);
    }

    @Override
    public void onShow(Object object) {

    }

    @Override
    public void onHide(String str) {

    }
}