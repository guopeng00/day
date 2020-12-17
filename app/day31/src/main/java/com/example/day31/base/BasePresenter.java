package com.example.day31.base;

public class BasePresenter<V> {
    public V iView;
    public void attachView(V v){
        iView=v;
    }
}
