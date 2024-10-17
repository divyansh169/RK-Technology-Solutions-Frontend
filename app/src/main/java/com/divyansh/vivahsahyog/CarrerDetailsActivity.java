package com.divyansh.vivahsahyog;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CarrerDetailsActivity extends AppCompatActivity {

    private Button buttonRegister;
    AutoCompleteTextView e1,e2 ,e3,e4,e5,e6,e9;
    public static String e1a,e2a ,e3a,e4a,e5a,e6a,e9a;
    TextInputEditText e7, e8;
    TextInputEditText g1,g2 ,g3,g4,g5,g6,g9;
    TextView testtext;
    TextInputLayout sdet1,sdet2 ,sdet3,sdet4,sdet5,sdet6,sdet9 ;
    //...........................................
//    AutoCompleteTextView autoCompleteTextView = findViewById(R.id.e9);
//
//    // Create an ArrayAdapter using the string array and a default spinner layout
//    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//            this,
//            R.array.weight,  // Replace "weight" with the actual array name
//            android.R.layout.simple_dropdown_item_1line
//    );
//
//    // Set the adapter for the AutoCompleteTextView
//        autoCompleteTextView.setAdapter(adapter);

    // Optional: Set an item click listener if you want to perform an action when an item is selected
//        autoCompleteTextView.setOnItemClickListener((parent, view, position, id) -> {
//        // Handle the selected item here
//        String selectedWeight = (String) parent.getItemAtPosition(position);
//        // Do something with the selectedWeight
//    });
    //.........................................
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrerdet);
        setTitle("Carrer Details");

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
        testtext = findViewById(R.id.testtext);
        sdet1 = findViewById(R.id.sdet1);
        sdet2 = findViewById(R.id.sdet2);
        sdet3= findViewById(R.id.sdet3);
        sdet4 = findViewById(R.id.sdet4);
        sdet5 = findViewById(R.id.sdet5);
        sdet6 = findViewById(R.id.sdet6);
        sdet9 = findViewById(R.id.sdet9);
        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);
        g9 = findViewById(R.id.g9);


        progressDialog = new ProgressDialog(this);



        String[] c1 = getResources().getStringArray((R.array.clg));
        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, R.layout.dropdown_item, c1);
//        AutoCompleteTextView d1 = findViewById(R.id.e1);
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


        String[] c2 = getResources().getStringArray((R.array.highest_education));
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, R.layout.dropdown_item, c2);
//        AutoCompleteTextView d2 = findViewById(R.id.e2);
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

        String[] c3 = getResources().getStringArray((R.array.working_status));
        ArrayAdapter<String> a3 = new ArrayAdapter<>(this, R.layout.dropdown_item, c3);
//        AutoCompleteTextView d3 = findViewById(R.id.e3);
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


        String[] c4 = getResources().getStringArray((R.array.employed_in));
        ArrayAdapter<String> a4 = new ArrayAdapter<>(this, R.layout.dropdown_item, c4);
//        AutoCompleteTextView d4 = findViewById(R.id.e4);
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

        String[] c5 = getResources().getStringArray((R.array.occupation));
        ArrayAdapter<String> a5 = new ArrayAdapter<>(this, R.layout.dropdown_item, c5);
//        AutoCompleteTextView d5 = findViewById(R.id.e5);
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

        String[] c6 = getResources().getStringArray((R.array.annual_income));
        ArrayAdapter<String> a6 = new ArrayAdapter<>(this, R.layout.dropdown_item, c6);
//        AutoCompleteTextView d6 = findViewById(R.id.e6);
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

        String[] c9 = getResources().getStringArray((R.array.highest_education));
        ArrayAdapter<String> a9 = new ArrayAdapter<>(this, R.layout.dropdown_item, c9);
//        AutoCompleteTextView d9 = findViewById(R.id.e9);
        e9.setAdapter(a9);
        e9.setOnItemClickListener((parent, view, position, id) -> {
            e9a = (String) parent.getItemAtPosition(position);
            if(e9a.contains("Other")){
                sdet9.setVisibility(View.VISIBLE);
                e9a = g9.getText().toString().trim();
            }
            else{
                sdet9.setVisibility(View.GONE);
                e9a = (String) parent.getItemAtPosition(position);
            }
        });



        Intent intent_social_to_carr = getIntent();
        final String full_name = intent_social_to_carr.getStringExtra("full_name");
        final String age = intent_social_to_carr.getStringExtra("age");
        final String date_of_birth = intent_social_to_carr.getStringExtra("date_of_birth");
        final String city = intent_social_to_carr.getStringExtra("city");
        final String district = intent_social_to_carr.getStringExtra("district");
        final String address = intent_social_to_carr.getStringExtra("address");
        final String gender = intent_social_to_carr.getStringExtra("gender");
        final String height = intent_social_to_carr.getStringExtra("height");
        final String weight = intent_social_to_carr.getStringExtra("weight");
        final String face_color = intent_social_to_carr.getStringExtra("face_color");
        final String country = intent_social_to_carr.getStringExtra("country");
        final String state = intent_social_to_carr.getStringExtra("state");
        final String username = intent_social_to_carr.getStringExtra("username");
        final String password = intent_social_to_carr.getStringExtra("password");
        final String email = intent_social_to_carr.getStringExtra("email");
        final String phonenumber = intent_social_to_carr.getStringExtra("phonenumber");
        final String createfor = intent_social_to_carr.getStringExtra("createfor");
        final String food_style = intent_social_to_carr.getStringExtra("food_style");
        final String hobbies = intent_social_to_carr.getStringExtra("hobbies");
        final String drinking_habit = intent_social_to_carr.getStringExtra("drinking_habit");
        final String marital_status = intent_social_to_carr.getStringExtra("marital_status");
        final String mother_tongue = intent_social_to_carr.getStringExtra("mother_tongue");
        final String religion = intent_social_to_carr.getStringExtra("religion");
        final String caste = intent_social_to_carr.getStringExtra("caste");
        final String sub_caste = intent_social_to_carr.getStringExtra("sub_caste");
        final String gotra = intent_social_to_carr.getStringExtra("gotra");
        final String manglik = intent_social_to_carr.getStringExtra("manglik");
        final String birth_location = intent_social_to_carr.getStringExtra("birth_location");
        final String birth_date = intent_social_to_carr.getStringExtra("birth_date");
        final String birth_time = intent_social_to_carr.getStringExtra("birth_time");


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                final String e1a = e1.getText().toString().trim();
//                if(e1a.contains("Other")){e1a = g1.getText().toString().trim();}
//                if(e2a.contains("Other")){e2a = g2.getText().toString().trim();}
//                if(e3a.contains("Other")){e3a = g3.getText().toString().trim();}
//                if(e4a.contains("Other")){e4a = g4.getText().toString().trim();}
//                if(e5a.contains("Other")){e5a = g5.getText().toString().trim();}
//                if(e6a.contains("Other")){e6a = g6.getText().toString().trim();}
//                if(e9a.contains("Other")){e9a = g9.getText().toString().trim();}
//                final String e2a = e2.getText().toString().trim();
//                final String e3a = e3.getText().toString().trim();
//                final String e4a = e4.getText().toString().trim();
//                final String e5a = e5.getText().toString().trim();
//                final String e6a = e6.getText().toString().trim();
                final String e7a = e7.getText().toString().trim();
                final String e8a = e8.getText().toString().trim();
//                final String e9a = e9.getText().toString().trim();


//                registerUser();
                progressDialog.setMessage("Registering user...");
                progressDialog.show();

                StringRequest stringRequest = new StringRequest(Request.Method.POST,
                        Constants.URL_REGISTER,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                progressDialog.dismiss();
                                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();


                                try {


                                    JSONObject jsonObject = new JSONObject(response);

                                    Toast.makeText(getApplicationContext(), jsonObject.getString("message"), Toast.LENGTH_LONG).show();

//                                            String show= jsonObject.getString("message");
//                                    Log.d("YourTag", "Message: " + jsonObject.getString("message"));
//                                    testtext.setText(jsonObject.getString("message"));


                                } catch (JSONException e) {
                                    e.printStackTrace();
//                                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                progressDialog.hide();
                                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                                testtext.setText(error.getMessage());
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<>();

                        params.put("username", username);
                        params.put("password", password);
                        params.put("email", email);
                        params.put("phonenumber", phonenumber);
                        params.put("createfor", createfor);
                        params.put("full_name", full_name);
                        params.put("age", age);
                        params.put("date_of_birth", date_of_birth);
                        params.put("city", city);
                        params.put("district", district);
                        params.put("address", address);
                        params.put("gender", gender);
                        params.put("height", height);
                        params.put("weight", weight);
                        params.put("face_color", face_color);
                        params.put("country", country);
                        params.put("state", state);
                        params.put("food_style", food_style);
                        params.put("hobbies", hobbies);
                        params.put("drinking_habit", drinking_habit);
                        params.put("marital_status", marital_status);
                        params.put("mother_tongue", mother_tongue);
                        params.put("religion", religion);
                        params.put("caste", caste);
                        params.put("sub_caste", sub_caste);
                        params.put("gotra", gotra);
                        params.put("manglik", manglik);
                        params.put("birth_location", birth_location);
                        params.put("birth_date", birth_date);
                        params.put("birth_time", birth_time);
                        params.put("highest_education", e2a);
                        params.put("college_name", e1a);
                        params.put("other_education", e9a);
                        params.put("working_status", e3a);
                        params.put("employed_in", e4a);
                        params.put("occupation", e5a);
                        params.put("income", e6a);
                        params.put("current_company", e7a);
                        params.put("company_location", e8a);


//                        params.put("username", "frdsaswedfvfd");
//                        params.put("password", "123456");
//                        params.put("email", "sidczzzzzzzzdffds@gmail.com");
//                        params.put("phonenumber", "frds");
//                        params.put("createfor", "frds");
//                        params.put("full_name", "frds");
//                        params.put("age", "frds");
//                        params.put("date_of_birth", "frds");
//                        params.put("city", "frds");
//                        params.put("district", "frds");
//                        params.put("address", "frds");
//                        params.put("gender", "frds");
//                        params.put("height", "frds");
//                        params.put("weight", "frds");
//                        params.put("face_color", "frds");
//                        params.put("country", "frds");
//                        params.put("state", "frds");
//                        params.put("food_style", "frds");
//                        params.put("hobbies", "frds");
//                        params.put("drinking_habit", "frds");
//                        params.put("marital_status", "frds");
//                        params.put("mother_tongue", "frds");
//                        params.put("religion", "frds");
//                        params.put("caste", "frds");
//                        params.put("sub_caste", "frds");
//                        params.put("gotra", "frds");
//                        params.put("manglik", "frds");
//                        params.put("birth_location", "frds");
//                        params.put("birth_date", "frds");
//                        params.put("birth_time", "frds");
//                        params.put("highest_education", "frds");
//                        params.put("college_name", "frds");
//                        params.put("other_education", "frds");
//                        params.put("working_status", "frds");
//                        params.put("employed_in", "frds");
//                        params.put("occupation", "frds");
//                        params.put("income", "frds");
//                        params.put("current_company", "frds");
//                        params.put("company_location", "frds");


                        return params;
                    }
                };


                RequestHandler.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);

//                Intent b = new Intent(CarrerDetailsActivity.this, LoginActivity.class);
//                startActivity(b);

            }

        });

//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                registerUser();
//            }
//        });


    }
    private void registerUser() {
//        final String email = editTextEmail.getText().toString().trim();
//        final String username = editTextUsername.getText().toString().trim();
//        final String password = editTextPassword.getText().toString().trim();

        progressDialog.setMessage("Registering user...");
        progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                Constants.URL_REGISTER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressDialog.dismiss();

                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            Toast.makeText(getApplicationContext(), jsonObject.getString("message"), Toast.LENGTH_LONG).show();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.hide();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", "frfrefewdds");
                params.put("password", "123456");
                params.put("email", "swecdcbtjthis@gmail.com");
                params.put("phonenumber", "frds");
                params.put("createfor", "frds");
                params.put("full_name", "frds");
                params.put("age", "frds");
                params.put("date_of_birth", "frds");
                params.put("city", "frds");
                params.put("district", "frds");
                params.put("address", "frds");
                params.put("gender", "frds");
                params.put("height", "frds");
                params.put("weight", "frds");
                params.put("face_color", "frds");
                params.put("country", "frds");
                params.put("state", "frds");
                params.put("food_style", "frds");
                params.put("hobbies", "frds");
                params.put("drinking_habit", "frds");
                params.put("marital_status", "frds");
                params.put("mother_tongue", "frds");
                params.put("religion", "frds");
                params.put("caste", "frds");
                params.put("sub_caste", "frds");
                params.put("gotra", "frds");
                params.put("manglik", "frds");
                params.put("birth_location", "frds");
                params.put("birth_date", "frds");
                params.put("birth_time", "frds");
                params.put("highest_education", "frds");
                params.put("college_name", "frds");
                params.put("other_education", "frds");
                params.put("working_status", "frds");
                params.put("employed_in", "frds");
                params.put("occupation", "frds");
                params.put("income", "frds");
                params.put("current_company", "frds");
                params.put("company_location", "frds");
                return params;
            }
        };


        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);


    }
}
