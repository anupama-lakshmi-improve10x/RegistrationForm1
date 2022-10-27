package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button identityNextBtn = findViewById(R.id.identitynext_btn);
        identityNextBtn.setOnClickListener(view -> {
            EditText panTxt = findViewById(R.id.pan_txt);
            String panNumber = panTxt.getText().toString();
            EditText aadharNumberTxt = findViewById(R.id.aadhar_txt);
            String aadharNumber = aadharNumberTxt.getText().toString();
            Intent identityIntent = new Intent(this, SuccessActivity.class);
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("panNumber", panNumber);
            identityIntent.putExtra("aadharNumber", aadharNumber);
            startActivity(identityIntent);
        });

        Button identityBackBtn = findViewById(R.id.identityback_btn);
        identityBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}