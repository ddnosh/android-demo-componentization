package com.demo.componentization.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.demo.componentization.base.Constant;
import com.demo.componentization.base.service.ILoginModuleService;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

@Route(path = "/main/main")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_main);

        ARouter.getInstance().inject(this);

        ILoginModuleService loginModuleServiceImpl = (ILoginModuleService) ARouter.getInstance().build("/login/service").navigation();
        if (loginModuleServiceImpl.isLogin()) {
            Toast.makeText(this, "You are logon!", Toast.LENGTH_SHORT).show();
        } else {
            ARouter.getInstance().build("/login/main")
                    .withString(Constant.AROUTER_FROM, "main")
                    .navigation();
        }
    }
}
