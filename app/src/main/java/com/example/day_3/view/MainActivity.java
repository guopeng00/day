package com.example.day_3.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day_3.R;
import com.youth.banner.Banner;

public class MainActivity extends AppCompatActivity {

    private Banner myBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        myBanner = (Banner) findViewById(R.id.my_banner);

    }
}