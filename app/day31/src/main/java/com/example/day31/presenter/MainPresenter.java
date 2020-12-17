package com.example.day31.presenter;

import com.example.day31.base.BasePresenter;
import com.example.day31.contract.MainContract;
import com.example.day31.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IPresenter {
    private MainModel model;

    @Override
    public void start() {
        
    }
}
