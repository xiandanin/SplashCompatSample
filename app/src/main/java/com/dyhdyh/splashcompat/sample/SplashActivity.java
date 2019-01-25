package com.dyhdyh.splashcompat.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }

    @Override
    public void setContentView(View view) {
        getWindow().setBackgroundDrawable(null);
        ((ViewGroup)getWindow().getDecorView()).addView(view);
    }
}
