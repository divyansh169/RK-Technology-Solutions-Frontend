package com.divyansh.vivahsahyog;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateforActivity extends AppCompatActivity {

    private Button buttonRegister, but, but2, but3, but4, but5, but6, but7, but8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createfor);
        setTitle("Create Profile For");

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        but = (Button) findViewById(R.id.but);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but.setBackgroundColor(R.drawable.btncrim);
                but2.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);

            }

        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but2.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but2.setTextColor(Color.WHITE);
                but.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);
            }

        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but3.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but2.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but3.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);
            }

        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but4.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but2.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but4.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);
            }

        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but5.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but2.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but5.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);
            }

        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but6.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but2.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but6.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);
            }

        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but7.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but2.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but8.setBackgroundColor(Color.WHITE);
                but7.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but.setTextColor(Color.GRAY);
                but8.setTextColor(Color.GRAY);
            }

        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                but8.setBackgroundColor(R.drawable.btncrim);
                but.setBackgroundColor(Color.WHITE);
                but2.setBackgroundColor(Color.WHITE);
                but3.setBackgroundColor(Color.WHITE);
                but4.setBackgroundColor(Color.WHITE);
                but5.setBackgroundColor(Color.WHITE);
                but6.setBackgroundColor(Color.WHITE);
                but7.setBackgroundColor(Color.WHITE);
                but8.setTextColor(Color.WHITE);
                but2.setTextColor(Color.GRAY);
                but3.setTextColor(Color.GRAY);
                but4.setTextColor(Color.GRAY);
                but5.setTextColor(Color.GRAY);
                but6.setTextColor(Color.GRAY);
                but7.setTextColor(Color.GRAY);
                but.setTextColor(Color.GRAY);
            }

        });


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent b = new Intent(CreateforActivity.this, MainActivity.class);
                startActivity(b);

            }

        });


    }

}
