package com.divyansh.vivahsahyog;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
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

public class LifeStyleActivity extends AppCompatActivity {

    Button buttonRegister;
    AutoCompleteTextView e1,e3;
    MultiAutoCompleteTextView e2;
    public static String e1a,e2a ,e3a;
    TextInputEditText g1,g2 ,g3;
    TextInputLayout sdet1,sdet2 ,sdet3;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle);
        setTitle("Life Style");

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        sdet1 = findViewById(R.id.sdet1);
        sdet2 = findViewById(R.id.sdet2);
        sdet3= findViewById(R.id.sdet3);
        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);

        String[] c1 = getResources().getStringArray((R.array.food_style));
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

        String[] c2 = getResources().getStringArray((R.array.hobbies));
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, R.layout.dropdown_item, c2);
//        AutoCompleteTextView d2 = findViewById(R.id.e2);
        e2.setAdapter(a2);
        e2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

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

        String[] c3 = getResources().getStringArray((R.array.drinking_habit));
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

//        progressDialog = new ProgressDialog(this);

        Intent intent_main_to_life = getIntent();
        final String full_name = intent_main_to_life.getStringExtra("full_name");
        final String age = intent_main_to_life.getStringExtra("age");
        final String date_of_birth = intent_main_to_life.getStringExtra("date_of_birth");
        final String city = intent_main_to_life.getStringExtra("city");
        final String district = intent_main_to_life.getStringExtra("district");
        final String address = intent_main_to_life.getStringExtra("address");
        final String gender = intent_main_to_life.getStringExtra("gender");
        final String height = intent_main_to_life.getStringExtra("height");
        final String weight = intent_main_to_life.getStringExtra("weight");
        final String face_color = intent_main_to_life.getStringExtra("face_color");
        final String country = intent_main_to_life.getStringExtra("country");
        final String state = intent_main_to_life.getStringExtra("state");
        final String username = intent_main_to_life.getStringExtra("username");
        final String password = intent_main_to_life.getStringExtra("password");
        final String email = intent_main_to_life.getStringExtra("email");
        final String phonenumber = intent_main_to_life.getStringExtra("phonenumber");
        final String createfor = intent_main_to_life.getStringExtra("createfor");


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(e1a.contains("Other")){e1a = g1.getText().toString().trim();}
//                if(e2a.contains("Other")){e2a = e2a + ", " + (g2.getText().toString().trim());}
//                if(e3a.contains("Other")){e3a = g3.getText().toString().trim();}


//                final String e1a = e1.getText().toString().trim();
//                final String e2a = e2.getText().toString().trim();
//                final String e3a = e3.getText().toString().trim();

                //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

//                progressDialog.setMessage("Registering user...");
//                progressDialog.show();
//
//                StringRequest stringRequest = new StringRequest(Request.Method.POST,
//                        Constants.URL_REGISTER,
//                        new Response.Listener<String>() {
//                            @Override
//                            public void onResponse(String response) {
//                                progressDialog.dismiss();
//
//                                try {
//                                    JSONObject jsonObject = new JSONObject(response);
//
//                                    Toast.makeText(getApplicationContext(), jsonObject.getString("message"), Toast.LENGTH_LONG).show();
//
//                                } catch (JSONException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                        },
//                        new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//                                progressDialog.hide();
//                                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
//                            }
//                        }) {
//                    @Override
//                    protected Map<String, String> getParams() throws AuthFailureError {
//                        Map<String, String> params = new HashMap<>();
//
//                        params.put("username", username);
//                        params.put("password", password);
//                        params.put("email", email);
//                        params.put("phonenumber", phonenumber);
//                        params.put("createfor", createfor);
//                        params.put("full_name", full_name);
//                        params.put("age", age);
//                        params.put("date_of_birth", date_of_birth);
//                        params.put("city", city);
//                        params.put("district", district);
//                        params.put("address", address);
//                        params.put("gender", gender);
//                        params.put("height", height);
//                        params.put("weight", weight);
//                        params.put("face_color", face_color);
//                        params.put("country", country);
//                        params.put("state", state);
//                        params.put("food_style", e1a);
//                        params.put("hobbies", e2a);
//                        params.put("drinking_habit", e3a);
//                        return params;
//                    }
//                };
//
//
//                RequestHandler.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);


                //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

                Intent intent_life_to_social = new Intent(LifeStyleActivity.this, SocialDetailsActivity.class);

                intent_life_to_social.putExtra("full_name", full_name);
                intent_life_to_social.putExtra("age", age);
                intent_life_to_social.putExtra("date_of_birth", date_of_birth);
                intent_life_to_social.putExtra("city", city);
                intent_life_to_social.putExtra("district", district);
                intent_life_to_social.putExtra("address", address);
                intent_life_to_social.putExtra("gender", gender);
                intent_life_to_social.putExtra("height", height);
                intent_life_to_social.putExtra("weight", weight);
                intent_life_to_social.putExtra("face_color", face_color);
                intent_life_to_social.putExtra("country", country);
                intent_life_to_social.putExtra("state", state);
                intent_life_to_social.putExtra("username", username);
                intent_life_to_social.putExtra("password", password);
                intent_life_to_social.putExtra("email", email);
                intent_life_to_social.putExtra("phonenumber", phonenumber);
                intent_life_to_social.putExtra("createfor", createfor);

                intent_life_to_social.putExtra("food_style", e1a);
                intent_life_to_social.putExtra("hobbies", e2a);
                intent_life_to_social.putExtra("drinking_habit", e3a);



                startActivity(intent_life_to_social);

                //888888888888888888888888888888888888888888888888888888888888888888888888888

//                Intent b = new Intent(LifeStyleActivity.this, SocialDetailsActivity.class);
//                startActivity(b);

            }

        });


    }


}
