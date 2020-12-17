package com.example.day_3.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day_3.R;
import com.example.day_3.base.BaseActivity;
import com.example.day_3.contract.MainContract;
import com.youth.banner.Banner;

public class MainActivity extends BaseActivity<MainContract.IMainView> {

    private Banner myBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void initData() {
        presenter.start();
    }

    public void initView() {
        myBanner = (Banner) findViewById(R.id.my_banner);

    }

    @Override
    protected int getLayoutID() {
        return 0;
    }

    @Override
    public MainContract.IMainView getPresenter() {
        return null;
    }
}