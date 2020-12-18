package com.example.day_3.model;

import com.example.day_3.contract.MainContract;
import com.example.mvplibrary.utils.net.INteCallBack;
import com.example.mvplibrary.utils.net.RetrofitUtils;

public class MainModel implements MainContract.IMainModel {

    @Override
    public <T> void getMod(String url, INteCallBack<T> callBack) {
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }

}
