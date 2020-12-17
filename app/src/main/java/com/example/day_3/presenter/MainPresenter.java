package com.example.day_3.presenter;

import com.example.day_3.base.BasePresenter;
import com.example.day_3.contract.MainContract;
import com.example.day_3.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.IMainView> implements MainContract.IPresenter{
    private MainModel model;

    public MainPresenter(MainContract.IMainView view) {
        this.model = new MainModel();
    }

    @Override
    public void start() {
        
    }
}
