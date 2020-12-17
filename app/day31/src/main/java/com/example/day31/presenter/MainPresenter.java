package com.example.day31.presenter;

import com.example.day31.base.BasePresenter;
import com.example.day31.bean.BannerBean;
import com.example.day31.contract.MainContract;
import com.example.day31.model.MainModel;
import com.example.day31.utils.net.INteCallBack;
import com.example.day31.utils.net.URLConstant;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IPresenter {
    private MainModel model;

    public MainPresenter(MainContract.IMainView mainView) {
        model=new MainModel();
    }

    @Override
    public void start() {
        model.getMod(URLConstant.Banner, new INteCallBack<BannerBean>() {

            @Override
            public void onOk(BannerBean bannerBean) {
                iView.onShow(bannerBean);
            }

            @Override
            public void onNo(String err) {
                iView.onHide(err);
            }
        });
    }
}
