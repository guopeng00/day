package com.example.day_3.presenter;

import com.example.day_3.bean.BannerBean;
import com.example.day_3.contract.MainContract;
import com.example.day_3.model.MainModel;
import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.utils.net.INteCallBack;
import com.example.mvplibrary.utils.net.URlConstant;

public class MainPresenter extends BasePresenter<MainContract.IMainView,MainContract.IMainModel> implements MainContract.IPresenter{

    @Override
    public void start() {
        iModel.getMod(URlConstant.BANNER, new INteCallBack<BannerBean>() {

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


    @Override
    protected MainContract.IMainModel getModel() {
        return new MainModel();
    }
}
