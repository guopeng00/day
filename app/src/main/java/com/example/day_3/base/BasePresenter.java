package com.example.day_3.base;

import android.util.Log;

public class BasePresenter<V extends BaseView> {
    public V iView;
    public void attachView(V v){
        iView=v;
        Log.e("TAG", "attachView: "+v.toString() );
    }
}
