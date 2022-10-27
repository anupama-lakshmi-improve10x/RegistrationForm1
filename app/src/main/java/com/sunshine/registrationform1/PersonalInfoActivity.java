package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        //Instead of calling getStringExtras from before screen we are using Bundle
        Bundle bundle = intent.getExtras();
        // 3 components get
       //String email = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        Button nextButtonBtn = findViewById(R.id.nextbutton_btn);
        nextButtonBtn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.username_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.firstname_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.lastname_txt);
            String lastName = lastNameTxt.getText().toString();
          //  Toast.makeText(this, email + " " + password + " " + confirmPassword + " " + userName + " " + firstName + " " +lastName, Toast.LENGTH_SHORT).show();
            // 6 components using put
            Intent personalInfoIntent = new Intent(this, AddressActivity.class);
            personalInfoIntent.putExtras(bundle);
           //personalInfoIntent.putExtra("emailAddress",email);
            //personalInfoIntent.putExtra("password",password);
            //personalInfoIntent.putExtra("confirmPassword",confirmPassword);
            personalInfoIntent.putExtra("userName", userName);
            personalInfoIntent.putExtra("firstName", firstName);
            personalInfoIntent.putExtra("lastName", lastName);
            startActivity(personalInfoIntent);
        });

        Button backBtn = findViewById(R.id.backbutton_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}