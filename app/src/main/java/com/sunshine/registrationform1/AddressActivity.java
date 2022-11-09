package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        getSupportActionBar().setTitle("Address");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button addressNextBtn = findViewById(R.id.next_btn);
        addressNextBtn.setOnClickListener(view -> {
            EditText hNoTxt = findViewById(R.id.h_no_txt);
            String houseNo = hNoTxt.getText().toString();
            EditText streetTxt = findViewById(R.id.street_txt);
            String street = streetTxt.getText().toString();
            EditText cityTxt = findViewById(R.id.city_txt);
            String city = cityTxt.getText().toString();
            EditText stateTxt = findViewById(R.id.state_txt);
            String state = stateTxt.getText().toString();
            EditText countryTxt = findViewById(R.id.country_txt);
            String country = countryTxt.getText().toString();

            Intent addressIntent = new Intent(this, BirthDetailsActivity.class);
            addressIntent.putExtras(bundle);
            addressIntent.putExtra("houseNo", houseNo);
            addressIntent.putExtra("street", street);
            addressIntent.putExtra("city",city);
            addressIntent.putExtra("state",state);
            addressIntent.putExtra("country",country);
            startActivity(addressIntent);
        });

        Button addressBackBtn = findViewById(R.id.back_btn);
        addressBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}