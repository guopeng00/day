package com.example.day31.model;

import com.example.day31.contract.MainContract;
import com.example.day31.utils.net.INteCallBack;
import com.example.day31.utils.net.RetrofitUtils;

public class MainModel implements MainContract.IMainModel {
    @Override
    public <T> void getMod(String url, INteCallBack<T> callBack) {
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }
}
