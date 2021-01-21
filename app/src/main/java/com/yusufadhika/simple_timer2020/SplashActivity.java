package com.yusufadhika.simple_timer2020;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DELAYED = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent moveMain = new Intent(SplashActivity.this, TimerActivity.class);
                startActivity(moveMain);
                finish();
            }
        }, SPLASH_DELAYED);
    }
}
