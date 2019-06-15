package com.demo.componentization.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.demo.componentization.base.Constant;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

@Route(path = "/login/main")
public class LoginActivity extends Activity {

    @Autowired(name = Constant.AROUTER_FROM)
    String from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        ARouter.getInstance().inject(this);

        Toast.makeText(this, from, Toast.LENGTH_SHORT).show();
    }
}
