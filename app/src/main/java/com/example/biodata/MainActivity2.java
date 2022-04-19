package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity";
//    TextView name_a, surname_a, mobile_a, email_a, birthdata_a, address_a, city_a, country_a, Qualification_a, socicl_a;
    TextView name_t, surname_t,hobby_a, mobile_t, email_t, birthdata_t, address_t, city_t, country_t, Qualification_t, socicl_t;
    Button bake_t, call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        name_a = findViewById(R.id.name_a);
//        surname_a = findViewById(R.id.surname);
//        mobile_a = findViewById(R.id.mobile);
//        email_a = findViewById(R.id.email);
//        birthdata_a = findViewById(R.id.birthdata);
//        address_a = findViewById(R.id.adderss);
//        city_a = findViewById(R.id.city);
//        country_a = findViewById(R.id.country);
//        Qualification_a = findViewById(R.id.Qualification);
//        socicl_a = findViewById(R.id.socicl);
//        call = findViewById(R.id.call);
//        bake_t = findViewById(R.id.bake_t);

        name_t = findViewById(R.id.name_a);
        surname_t = findViewById(R.id.surname_a);
        mobile_t = findViewById(R.id.mobile_n);
        email_t = findViewById(R.id.email_a);
        birthdata_t = findViewById(R.id.birthdata_a);
        address_t = findViewById(R.id.address_a);
        city_t = findViewById(R.id.city_a);
        country_t = findViewById(R.id.country_a);
        Qualification_t = findViewById(R.id.Qualification_a);
        socicl_t = findViewById(R.id.social_a);
        call = findViewById(R.id.call);
        bake_t = findViewById(R.id.bake_t);
        hobby_a = findViewById(R.id.hobby_a);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String mobile = getIntent().getStringExtra("mobileno");
        String hobby = getIntent().getStringExtra("hobby");
        String email = getIntent().getStringExtra("email");
        String birthdata = getIntent().getStringExtra("birthdata");
        String address = getIntent().getStringExtra("address");
        String city = getIntent().getStringExtra("city");
        String country = getIntent().getStringExtra("country");
        String Qualification = getIntent().getStringExtra("Qualification");
        String socicl = getIntent().getStringExtra("socicl");

        bake_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + mobile_t.getText().toString()));
                Log.e(TAG, "onclick: call");
                startActivity(intent);

            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + mobile_t.getText().toString()));
                Log.e(TAG, "onclick: call");
                startActivity(intent);
            }
        });
//        private void Bidinge ()

            name_t.setText("" + name);
            surname_t.setText("" + surname );
            hobby_a.setText(""+hobby);
            mobile_t.setText("" + mobile);
            email_t.setText("" + email);
            birthdata_t.setText("" + birthdata);
            address_t.setText("" + address);
            city_t.setText("" + city);
            country_t.setText("" + country);
            Qualification_t.setText("" + Qualification);
            socicl_t.setText("" + socicl);

    }
}