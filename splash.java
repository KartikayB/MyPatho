package com.example.kuldeepvashist.mypatho;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler= new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(splash.this,login.class);
                startActivity(intent);
            }
        },2500);
    }
}







