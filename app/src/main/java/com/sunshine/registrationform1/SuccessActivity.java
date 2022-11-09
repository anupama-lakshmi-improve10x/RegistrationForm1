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
        getSupportActionBar().setTitle("Success");
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
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.user_name_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.first_name_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.last_name_txt);
        lastNameTxt.setText(lastName);
        TextView houseNoTxt = findViewById(R.id.apartment_txt);
        houseNoTxt.setText(houseNo);
        TextView streetTxt = findViewById(R.id.street_name_txt);
        streetTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText(country);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView companyTxt = findViewById(R.id.current_company_txt);
        companyTxt.setText(currentCompany);
        TextView totalExpTxt = findViewById(R.id.total_experience_txt);
        totalExpTxt.setText(totalExp);
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        TextView backNameTxt = findViewById(R.id.bank_name_txt);
        backNameTxt.setText(backName);
        TextView accountHolderTxt = findViewById(R.id.account_holder_txt);
        accountHolderTxt.setText(accountHolderName);
        TextView accountNumberTxt = findViewById(R.id.account_number_txt);
        accountNumberTxt.setText(accountNumber);
        TextView cardNoTxt = findViewById(R.id.card_number_txt);
        cardNoTxt.setText(cardNumber);
        TextView cardHolderTxt = findViewById(R.id.card_holder_txt);
        cardHolderTxt.setText(cardHolder);
        TextView expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText(expiry);
        TextView cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText(cvv);
        TextView ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
        ifscCodeTxt.setText(ifscCode);
        TextView panNumberTxt = findViewById(R.id.pan_number_txt);
        panNumberTxt.setText(panNumber);
        TextView aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
        aadharNumberTxt.setText(aadharNumber);
    }
}