package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        getSupportActionBar().setTitle("Credit Card Details");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button ccNextBtn = findViewById(R.id.next_btn);
        ccNextBtn.setOnClickListener(view -> {
            EditText cardNoTxt = findViewById(R.id.card_number_txt);
            String cardNo = cardNoTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryTxt = findViewById(R.id.expiry_txt);
            String expiry = expiryTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            Intent creditCardAccount = new Intent(this, IdentityActivity.class);
            creditCardAccount.putExtras(bundle);
            creditCardAccount.putExtra("cardNo",cardNo);
            creditCardAccount.putExtra("cardholder", cardHolder);
            creditCardAccount.putExtra("expiry",expiry);
            creditCardAccount.putExtra("cvv",cvv);
            startActivity(creditCardAccount);
        });

        Button ccBackbtn = findViewById(R.id.back_btn);
        ccBackbtn.setOnClickListener(view -> {
            finish();
        });


    }
}