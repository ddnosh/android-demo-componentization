package com.demo.componentization.base.service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface ILoginModuleService extends IProvider {

    boolean isLogin();

    void setLogin(boolean login);
}
