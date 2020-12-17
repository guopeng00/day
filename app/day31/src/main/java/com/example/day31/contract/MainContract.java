package com.example.day31.contract;

import com.example.day31.base.BaseView;
import com.example.day31.utils.net.INteCallBack;

public class MainContract {
    public  interface IMainModel{
        <T> void getMod(String url, INteCallBack<T> callBack);
    }
    public interface IMainView extends BaseView {
        void onShow(Object object);
        void onHide(String str);
    }
    public interface IPresenter{
        void start();
    }
}
