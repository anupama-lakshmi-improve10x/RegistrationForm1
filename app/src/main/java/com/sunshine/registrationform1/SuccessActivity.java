package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String email = intent.getStringExtra("emailAddress");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String houseNo = intent.getStringExtra("houseNo");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String country = intent.getStringExtra("country");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String currentCompany = intent.getStringExtra("currentCompany");
        String totalExp = intent.getStringExtra("totalExp");
        String designation = intent.getStringExtra("designation");
        String backName = intent.getStringExtra("bankName");
        String accountHolderName = intent.getStringExtra("accountHolderName");
        String accountNumber = intent.getStringExtra("accountNumber");
        String cardNumber = intent.getStringExtra("cardNo");
        String cardHolder = intent.getStringExtra("cardholder");
        String expiry = intent.getStringExtra("expiry");
        String cvv = intent.getStringExtra("cvv");
        String ifscCode = intent.getStringExtra("ifscCode");
        String panNumber = intent.getStringExtra("panNumber");
        String aadharNumber = intent.getStringExtra("aadharNumber");
        TextView emailTxt = findViewById(R.id.emailtxt_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.user_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.first_user_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.last_user_txt);
        lastNameTxt.setText(lastName);
        TextView houseNoTxt = findViewById(R.id.appartmrnt_txt);
        houseNoTxt.setText(houseNo);
        TextView streetTxt = findViewById(R.id.streetname_txt);
        streetTxt.setText(street);
        TextView cityTxt = findViewById(R.id.cityname_txt);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.statetxt_txt);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.countrytxt_txt);
        countryTxt.setText(country);
        TextView dateOfBirthTxt = findViewById(R.id.dob_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.pob_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView companyTxt = findViewById(R.id.company_txt);
        companyTxt.setText(currentCompany);
        TextView totalExpTxt = findViewById(R.id.experience_txt);
        totalExpTxt.setText(totalExp);
        TextView designationTxt = findViewById(R.id.designationofuser_txt);
        designationTxt.setText(designation);
        TextView backNameTxt = findViewById(R.id.bank_txt);
        backNameTxt.setText(backName);
        TextView accountHolderTxt = findViewById(R.id.accountholder_txt);
        accountHolderTxt.setText(accountHolderName);
        TextView accountNumberTxt = findViewById(R.id.account_txt);
        accountNumberTxt.setText(accountNumber);
        TextView cardNoTxt = findViewById(R.id.cardnumber_txt);
        cardNoTxt.setText(cardNumber);
        TextView cardHolderTxt = findViewById(R.id.cardholder_txt);
        cardHolderTxt.setText(cardHolder);
        TextView expiryTxt = findViewById(R.id.expirytxt_txt);
        expiryTxt.setText(expiry);
        TextView cvvTxt = findViewById(R.id.cvvtxt_txt);
        cvvTxt.setText(cvv);
        TextView ifscCodeTxt = findViewById(R.id.ifsctxt_txt);
        ifscCodeTxt.setText(ifscCode);
        TextView panNumberTxt = findViewById(R.id.panNumber_txt);
        panNumberTxt.setText(panNumber);
        TextView aadharNumberTxt = findViewById(R.id.aadharNumber_txt);
        aadharNumberTxt.setText(aadharNumber);
    }
}