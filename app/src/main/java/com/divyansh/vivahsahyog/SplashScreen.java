package com.divyansh.vivahsahyog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity{

    ImageView imageVieww;

//    public static int UPDATE_CODE = 22;
//    AppUpdateManager appUpdateManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        getSupportActionBar().hide();

//        loadingutensils.setVisibility(View.VISIBLE);

//        inAppUp();
//        FirebaseMessaging.getInstance().subscribeToTopic("Centralnews");

        imageVieww=(ImageView)findViewById(R.id.imageView);
        imageVieww.animate().alpha(0f).setDuration(0);
        imageVieww.animate().alpha(1f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
//                textView.animate().alpha(1f).setDuration(800);
            }
        });

//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run(){
//
//            }
//        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(SplashScreen.this, IntroActivity.class);
                    startActivity(intent);
                    finish();
            }
        }, 2000);
    }
}

