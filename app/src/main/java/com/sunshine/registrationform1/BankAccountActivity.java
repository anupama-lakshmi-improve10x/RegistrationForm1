package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        getSupportActionBar().setTitle("Bank Account");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        //String dateOfBirth = intent.getStringExtra("dateOfBirth");
        //String placeOfBirth = intent.getStringExtra("placeOfBirth");
        //String currentCompany = intent.getStringExtra("currentCompany");
        //String totalExp = intent.getStringExtra("totalExp");
        //String designation = intent.getStringExtra("designation");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText bankNameTxt = findViewById(R.id.bank_name_txt);
            String bankName = bankNameTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
            String accountHolderName = accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.account_number_txt);
            String accountNumber = accountNumberTxt.getText().toString();
            EditText ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
            String ifscCode = ifscCodeTxt.getText().toString();
            Intent bankAccountIntent = new Intent(this, CreditCardDetailsActivity.class);
            bankAccountIntent.putExtras(bundle);
            //bankAccountIntent.putExtra("emailAddress",email);
            //bankAccountIntent.putExtra("password",password);
            //bankAccountIntent.putExtra("confirmPassword",confirmPassword);
            //bankAccountIntent.putExtra("userName",userName);
            //bankAccountIntent.putExtra("firstName", firstName);
            //bankAccountIntent.putExtra("lastName", lastName);
            //bankAccountIntent.putExtra("dateOfBirth",dateOfBirth);
            //bankAccountIntent.putExtra("placeOfBirth",placeOfBirth);
            //bankAccountIntent.putExtra("currentCompany", currentCompany);
            //bankAccountIntent.putExtra("totalExp",totalExp);
            //bankAccountIntent.putExtra("designation", designation);
            bankAccountIntent.putExtra("bankName", bankName);
            bankAccountIntent.putExtra("accountHolderName", accountHolderName);
            bankAccountIntent.putExtra("accountNumber", accountNumber);
            bankAccountIntent.putExtra("ifscCode", ifscCode);
            startActivity(bankAccountIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}