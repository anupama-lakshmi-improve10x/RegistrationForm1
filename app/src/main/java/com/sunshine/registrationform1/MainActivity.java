package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.next_btn);
        button.setOnClickListener(view -> {
            EditText emailAddressTxt = findViewById(R.id.emailaddress_txt);
            String emailAddress = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirmpassword_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            Toast.makeText(this, emailAddress + "\t" + password + "\t" + confirmPassword, Toast.LENGTH_SHORT).show();
            // 3 components using put
            Intent signUpIntent = new Intent(this, PersonalInfoActivity.class);
            signUpIntent.putExtra("emailAddress", emailAddress);
            signUpIntent.putExtra("password", password);
            signUpIntent.putExtra("confirmPassword", confirmPassword);
            startActivity(signUpIntent);
        });
    }
}