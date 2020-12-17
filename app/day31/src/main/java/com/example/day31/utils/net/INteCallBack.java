package com.example.day31.utils.net;

public interface INteCallBack<T> {
    void onOk(T t);
    void onNo(String err);
}
