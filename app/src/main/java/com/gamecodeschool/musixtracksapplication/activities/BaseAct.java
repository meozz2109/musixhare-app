package com.gamecodeschool.musixtracksapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class BaseAct extends AppCompatActivity {
    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
    }

    protected final <T extends View> T findViewById(int id,
                                                    View.OnClickListener event) {
        T view = super.findViewById(id);
        if (event != null) {
            view.setOnClickListener(event);
        }
        return view;
    }

    protected abstract void initView();

    protected abstract int getLayoutId();

}
