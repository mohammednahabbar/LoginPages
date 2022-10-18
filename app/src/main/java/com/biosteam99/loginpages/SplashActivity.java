package com.biosteam99.loginpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler;
        handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                intent=new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


    }
}