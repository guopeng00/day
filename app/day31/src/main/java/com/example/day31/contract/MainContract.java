package com.example.day31.contract;

import com.example.day31.utils.net.INteCallBack;

public class MainContract {
    public  interface IMainModel{
        <T> void getMod(String url, INteCallBack<T> callBack);
    }
    public interface IMainView{
        void onShow(Object object);
        void onHide(String str);
    }
}
