package com.example.medamoniaravind.findhostel;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView spl_image1,spl_image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        spl_image1=findViewById(R.id.sp_hstlimg);
        spl_image2=findViewById(R.id.sp_ldimg);
        AnimationDrawable animationDrawable=(AnimationDrawable)spl_image2.getDrawable();
        animationDrawable.setCallback(spl_image2);
        animationDrawable.setVisible(true,true);
        animationDrawable.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,LoginScreen.class));
                finish();
            }
        },4*1000);
    }
}
