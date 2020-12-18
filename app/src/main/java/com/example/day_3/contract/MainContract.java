package com.example.day_3.contract;


import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BaseView;
import com.example.mvplibrary.utils.net.INteCallBack;

public class MainContract {
    public interface IMainModel extends BaseModel {
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
