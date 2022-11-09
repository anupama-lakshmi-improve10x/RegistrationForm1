package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        getSupportActionBar().setTitle("Birth Details");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
       // String email = intent.getStringExtra("emailAddress");
       // String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        Button nxtBtn = findViewById(R.id.next_btn);
        nxtBtn.setOnClickListener(view -> {
            EditText dobTxt = findViewById(R.id.date_of_birth_txt);
            String dob = dobTxt.getText().toString();
            EditText pobTxt = findViewById(R.id.place_of_birth_txt);
            String pob = pobTxt.getText().toString();
            Intent dateOfBirthIntent = new Intent(this, ProfessionalInfoActivity.class);
            dateOfBirthIntent.putExtras(bundle);
            //dateOfBirthIntent.putExtra("emailAddress",email);
            //dateOfBirthIntent.putExtra("password",password);
            //dateOfBirthIntent.putExtra("confirmPassword",confirmPassword);
            //dateOfBirthIntent.putExtra("userName",userName);
            //dateOfBirthIntent.putExtra("firstName", firstName);
            //dateOfBirthIntent.putExtra("lastName",lastName);
            dateOfBirthIntent.putExtra("dateOfBirth", dob);
            dateOfBirthIntent.putExtra("placeOfBirth", pob);
            startActivity(dateOfBirthIntent);
        });

        Button bckBtn = findViewById(R.id.back_btn);
        bckBtn.setOnClickListener(view -> {
           finish();
        });
    }
}