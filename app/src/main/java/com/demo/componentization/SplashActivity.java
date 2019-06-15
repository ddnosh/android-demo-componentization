package com.demo.componentization;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.demo.componentization.base.Constant;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class SplashActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_splash);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ARouter.getInstance().build("/main/main")
                        .withString(Constant.AROUTER_FROM, "splash")
                        .navigation();
            }
        }, 2000);
    }
}
