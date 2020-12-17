package com.example.day_3.contract;


import com.example.day_3.utils.net.INteCallBack;

public class MainContract {
    public interface MainModel {
        <T> void getMod(String url, INteCallBack<T> callBack);
    }
    public interface IMainView extends BaseView {
        void onShow(Object object);
        void onHide(String str);
    }
}
