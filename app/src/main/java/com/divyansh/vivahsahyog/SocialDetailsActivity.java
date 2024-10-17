package com.divyansh.vivahsahyog;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;
import java.util.Locale;

public class SocialDetailsActivity extends AppCompatActivity {

    Button buttonRegister;
    AutoCompleteTextView e1,e2 ,e3,e4,e5,e6, e7;
    public static String e1a,e2a ,e3a,e4a,e5a,e6a, e7a;
    TextInputEditText e8, e9,e10;
    TextInputEditText g1,g2 ,g3,g4,g5,g6,g7;
    TextInputLayout sdet1,sdet2 ,sdet3,sdet4,sdet5,sdet6,sdet7 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialdet);
        setTitle("Social Details");

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);
        e7 = findViewById(R.id.e7);
        e8 = findViewById(R.id.e8);
        e9 = findViewById(R.id.e9);
        e10 = findViewById(R.id.e10);
        sdet1 = findViewById(R.id.sdet1);
        sdet2 = findViewById(R.id.sdet2);
        sdet3= findViewById(R.id.sdet3);
        sdet4 = findViewById(R.id.sdet4);
        sdet5 = findViewById(R.id.sdet5);
        sdet6 = findViewById(R.id.sdet6);
        sdet7 = findViewById(R.id.sdet7);
        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);
        g7 = findViewById(R.id.g7);

        String[] c1 = getResources().getStringArray((R.array.marital_status));
        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, R.layout.dropdown_item, c1);
        e1.setAdapter(a1);
        e1.setOnItemClickListener((parent, view, position, id) -> {
            e1a = (String) parent.getItemAtPosition(position);
            if(e1a.contains("Other")){
                sdet1.setVisibility(View.VISIBLE);
                e1a = g1.getText().toString().trim();
            }
            else{
                sdet1.setVisibility(View.GONE);
                e1a = (String) parent.getItemAtPosition(position);
            }
        });

        String[] c2 = getResources().getStringArray((R.array.mother_tongue));
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, R.layout.dropdown_item, c2);
        e2.setAdapter(a2);
        e2.setOnItemClickListener((parent, view, position, id) -> {
            e2a = (String) parent.getItemAtPosition(position);
            if(e2a.contains("Other")){
                sdet2.setVisibility(View.VISIBLE);
                e2a = g2.getText().toString().trim();
            }
            else{
                sdet2.setVisibility(View.GONE);
                e2a = (String) parent.getItemAtPosition(position);
            }
        });

        String[] c3 = getResources().getStringArray((R.array.religion));
        ArrayAdapter<String> a3 = new ArrayAdapter<>(this, R.layout.dropdown_item, c3);
        e3.setAdapter(a3);
        e3.setOnItemClickListener((parent, view, position, id) -> {
            e3a = (String) parent.getItemAtPosition(position);
            if(e3a.contains("Other")){
                sdet3.setVisibility(View.VISIBLE);
                e3a = g3.getText().toString().trim();
            }
            else{
                sdet3.setVisibility(View.GONE);
                e3a = (String) parent.getItemAtPosition(position);
            }
        });


        String[] c4 = getResources().getStringArray((R.array.caste));
        ArrayAdapter<String> a4 = new ArrayAdapter<>(this, R.layout.dropdown_item, c4);
        e4.setAdapter(a4);
        e4.setOnItemClickListener((parent, view, position, id) -> {
            e4a = (String) parent.getItemAtPosition(position);
            if(e4a.contains("Other")){
                sdet4.setVisibility(View.VISIBLE);
                e4a = g4.getText().toString().trim();
            }
            else{
                sdet4.setVisibility(View.GONE);
                e4a = (String) parent.getItemAtPosition(position);
            }
        });


        String[] c5 = getResources().getStringArray((R.array.sub_caste));
        ArrayAdapter<String> a5 = new ArrayAdapter<>(this, R.layout.dropdown_item, c5);
        e5.setAdapter(a5);
        e5.setOnItemClickListener((parent, view, position, id) -> {
            e5a = (String) parent.getItemAtPosition(position);
            if(e5a.contains("Other")){
                sdet5.setVisibility(View.VISIBLE);
                e5a = g5.getText().toString().trim();
            }
            else{
                sdet5.setVisibility(View.GONE);
                e5a = (String) parent.getItemAtPosition(position);
            }
        });


        String[] c6 = getResources().getStringArray((R.array.gotra));
        ArrayAdapter<String> a6 = new ArrayAdapter<>(this, R.layout.dropdown_item, c6);
        e6.setAdapter(a6);
        e6.setOnItemClickListener((parent, view, position, id) -> {
            e6a = (String) parent.getItemAtPosition(position);
            if(e6a.contains("Other")){
                sdet6.setVisibility(View.VISIBLE);
                e6a = g6.getText().toString().trim();
            }
            else{
                sdet6.setVisibility(View.GONE);
                e6a = (String) parent.getItemAtPosition(position);
            }
        });

        String[] c7 = getResources().getStringArray((R.array.manglik));
        ArrayAdapter<String> a7 = new ArrayAdapter<>(this, R.layout.dropdown_item, c7);
        e7.setAdapter(a7);
        e7.setOnItemClickListener((parent, view, position, id) -> {
            e7a = (String) parent.getItemAtPosition(position);
            if(e7a.contains("Other")){
                sdet7.setVisibility(View.VISIBLE);
                e7a = g7.getText().toString().trim();
            }
            else{
                sdet7.setVisibility(View.GONE);
                e7a = (String) parent.getItemAtPosition(position);
            }
        });

        Intent intent_life_to_social = getIntent();
        String full_name = intent_life_to_social.getStringExtra("full_name");
        String age = intent_life_to_social.getStringExtra("age");
        String date_of_birth = intent_life_to_social.getStringExtra("date_of_birth");
        String city = intent_life_to_social.getStringExtra("city");
        String district = intent_life_to_social.getStringExtra("district");
        String address = intent_life_to_social.getStringExtra("address");
        String gender = intent_life_to_social.getStringExtra("gender");
        String height = intent_life_to_social.getStringExtra("height");
        String weight = intent_life_to_social.getStringExtra("weight");
        String face_color = intent_life_to_social.getStringExtra("face_color");
        String country = intent_life_to_social.getStringExtra("country");
        String state = intent_life_to_social.getStringExtra("state");
        String username = intent_life_to_social.getStringExtra("username");
        String password = intent_life_to_social.getStringExtra("password");
        String email = intent_life_to_social.getStringExtra("email");
        String phonenumber = intent_life_to_social.getStringExtra("phonenumber");
        String createfor = intent_life_to_social.getStringExtra("createfor");
        String food_style = intent_life_to_social.getStringExtra("food_style");
        String hobbies = intent_life_to_social.getStringExtra("hobbies");
        String drinking_habit = intent_life_to_social.getStringExtra("drinking_habit");


        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are getting
                // the instance of our calendar.
                Locale locale = getResources().getConfiguration().locale;
                Locale.setDefault(locale.ENGLISH);
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // on below line we are creating a variable for date picker dialog.
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        SocialDetailsActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our text view.
//                                e9.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                                e9.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);

                            }
                        },
                        // on below line we are passing year,
                        // month and day for selected date in our date picker.
                        year, month, day);
                // at last we are calling show to
                // display our date picker dialog.
                datePickerDialog.show();
            }
        });

        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are getting the
                // instance of our calendar.
                Locale locale = getResources().getConfiguration().locale;
                Locale.setDefault(locale.ENGLISH);
                final Calendar c = Calendar.getInstance();

                // on below line we are getting our hour, minute.
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);

                // on below line we are initializing our Time Picker Dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(SocialDetailsActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {
                                // on below line we are setting selected time
                                // in our text view.
                                e10.setText(hourOfDay + ":" + minute);
                            }
                        }, hour, minute, false);
                // at last we are calling show to
                // display our time picker dialog.
                timePickerDialog.show();
            }
        });



        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String e1a = e1.getText().toString().trim();
//                if(e1a.contains("Other")){e1a = g1.getText().toString().trim();}
//                if(e2a.contains("Other")){e2a = g2.getText().toString().trim();}
//                if(e3a.contains("Other")){e3a = g3.getText().toString().trim();}
//                if(e4a.contains("Other")){e4a = g4.getText().toString().trim();}
//                if(e5a.contains("Other")){e5a = g5.getText().toString().trim();}
//                if(e6a.contains("Other")){e6a = g6.getText().toString().trim();}
//                if(e7a.contains("Other")){e7a = g7.getText().toString().trim();}
//                String e2a = e2.getText().toString().trim();
//                String e3a = e3.getText().toString().trim();
//                String e4a = e4.getText().toString().trim();
//                String e5a = e5.getText().toString().trim();
//                String e6a = e6.getText().toString().trim();
//                String e7a = e7.getText().toString().trim();
                String e8a = e8.getText().toString().trim();
                String e9a = e9.getText().toString().trim();
                String e10a = e10.getText().toString().trim();

                Intent intent_social_to_carr = new Intent(SocialDetailsActivity.this, CarrerDetailsActivity.class);

                intent_social_to_carr.putExtra("full_name", full_name);
                intent_social_to_carr.putExtra("age", age);
                intent_social_to_carr.putExtra("date_of_birth", date_of_birth);
                intent_social_to_carr.putExtra("city", city);
                intent_social_to_carr.putExtra("district", district);
                intent_social_to_carr.putExtra("address", address);
                intent_social_to_carr.putExtra("gender", gender);
                intent_social_to_carr.putExtra("height", height);
                intent_social_to_carr.putExtra("weight", weight);
                intent_social_to_carr.putExtra("face_color", face_color);
                intent_social_to_carr.putExtra("country", country);
                intent_social_to_carr.putExtra("state", state);
                intent_social_to_carr.putExtra("username", username);
                intent_social_to_carr.putExtra("password", password);
                intent_social_to_carr.putExtra("email", email);
                intent_social_to_carr.putExtra("phonenumber", phonenumber);
                intent_social_to_carr.putExtra("createfor", createfor);
                intent_social_to_carr.putExtra("food_style", food_style);
                intent_social_to_carr.putExtra("hobbies", hobbies);
                intent_social_to_carr.putExtra("drinking_habit", drinking_habit);

                intent_social_to_carr.putExtra("marital_status", e1a);
                intent_social_to_carr.putExtra("mother_tongue", e2a);
                intent_social_to_carr.putExtra("religion", e3a);
                intent_social_to_carr.putExtra("caste", e4a);
                intent_social_to_carr.putExtra("sub_caste", e5a);
                intent_social_to_carr.putExtra("gotra", e6a);

                intent_social_to_carr.putExtra("manglik", e7a);
                intent_social_to_carr.putExtra("birth_location", e8a);
                intent_social_to_carr.putExtra("birth_date", e9a);
                intent_social_to_carr.putExtra("birth_time", e10a);







                startActivity(intent_social_to_carr);

//                Intent b = new Intent(SocialDetailsActivity.this, CarrerDetailsActivity.class);
//                startActivity(b);

            }

        });


    }
}
