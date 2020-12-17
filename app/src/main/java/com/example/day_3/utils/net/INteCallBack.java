package com.example.day_3.utils.net;

public interface INteCallBack<T> {
    void onSuccess(T t);
    void onFail(String err);
}
