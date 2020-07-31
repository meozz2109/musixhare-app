package com.gamecodeschool.musixtracksapplication.activities;

import android.content.Intent;
import android.os.Handler;

import com.gamecodeschool.musixtracksapplication.R;

public class SplashAct extends BaseAct {

    @Override
    protected void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashAct.this, MainActivity.class));

                finish();
                // or in Manifest -> noHistory = true
            }
        }, 1200);
    }

    @Override
    protected int getLayoutId() {

        return R.layout.act_splash;
    }
}
