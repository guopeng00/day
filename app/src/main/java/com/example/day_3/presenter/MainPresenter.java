package com.example.day_3.presenter;

import com.example.day_3.base.BasePresenter;
import com.example.day_3.bean.BannerBean;
import com.example.day_3.contract.MainContract;
import com.example.day_3.model.MainModel;
import com.example.day_3.utils.net.INteCallBack;
import com.example.day_3.utils.net.URlConstant;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IPresenter{
    private MainModel model;

    public MainPresenter(MainContract.IMainView view) {
        this.model = new MainModel();
    }

    @Override
    public void start() {
        model.getMod(URlConstant.BANNER, new INteCallBack<BannerBean>() {

            @Override
            public void onSuccess(BannerBean bannerBean) {
                iView.onShow(bannerBean);
            }

            @Override
            public void onFail(String err) {
                iView.onHide(err);
            }
        });
    }
}
