package com.sunshine.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        // six components using get
       // String email = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
       // String confirmPassword = intent.getStringExtra("confirmPassword");
       // String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        //String dateOfBirth = intent.getStringExtra("dateOfBirth");
        //String placeOfBirth = intent.getStringExtra("placeOfBirth");
        setContentView(R.layout.activity_professional_info);
        Button doneBtn = findViewById(R.id.done_btn);
        doneBtn.setOnClickListener(view -> {
            EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExpTxt = findViewById(R.id.totalexperience_txt);
            String totalExp = totalExpTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            //Toast.makeText(this, email + " " + password + " " + confirmPassword + " " + userName + " " + firstName + " "+ lastName + " " + currentCompany + " " + totalExp + " " + designation, Toast.LENGTH_SHORT).show();
            // 9 componets using put
            Intent professionalInfoIntent = new Intent(this, BankAccountActivity.class);
            professionalInfoIntent.putExtras(bundle);
            //professionalInfoIntent.putExtra("emailAddress",email);
            //professionalInfoIntent.putExtra("password",password);
            //professionalInfoIntent.putExtra("confirmPassword",confirmPassword);
            //professionalInfoIntent.putExtra("userName",userName);
            //professionalInfoIntent.putExtra("firstName", firstName);
            //professionalInfoIntent.putExtra("lastName", lastName);
            //professionalInfoIntent.putExtra("dateOfBirth",dateOfBirth);
            //professionalInfoIntent.putExtra("placeOfBirth",placeOfBirth);
            professionalInfoIntent.putExtra("currentCompany", currentCompany);
            professionalInfoIntent.putExtra("totalExp", totalExp);
            professionalInfoIntent.putExtra("designation", designation);
            startActivity(professionalInfoIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}