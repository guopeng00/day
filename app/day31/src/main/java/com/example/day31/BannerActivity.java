package com.example.day31;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.youth.banner.Banner;

public class BannerActivity extends AppCompatActivity {

    private Banner myBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        initView();
    }

    private void initView() {
        myBanner = (Banner) findViewById(R.id.my_banner);
    }
}