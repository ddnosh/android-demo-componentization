package com.demo.componentization.login.impl;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.demo.componentization.base.service.ILoginModuleService;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

@Route(path = "/login/service")
public class LoginModuleServiceImpl implements ILoginModuleService {

    private Context mContext;

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public void setLogin(boolean login) {

    }

    @Override
    public void init(Context context) {
        mContext = context;
    }
}
