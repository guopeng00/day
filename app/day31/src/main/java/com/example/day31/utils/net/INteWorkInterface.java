package com.example.day31.utils.net;

import java.util.HashMap;

public interface INteWorkInterface {
    <T> void get(String url,INteCallBack<T> callBack);
    <T> void post(String url,INteCallBack<T> callBack);
    <T> void post(String url, HashMap<String,String> map, INteCallBack<T> callBack);
}
