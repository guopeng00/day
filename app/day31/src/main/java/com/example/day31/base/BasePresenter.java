package com.example.day31.base;

public class BasePresenter<V extends BaseView> {
    public V iView;
    public void attachView(V v){
        iView=v;
    }
}
