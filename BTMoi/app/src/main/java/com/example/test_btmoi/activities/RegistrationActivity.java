package com.example.test_btmoi.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.test_btmoi.R;

public class RegistrationActivity extends AppCompatActivity {

    Button signUp;
    EditText name, email, password;
    TextView signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        signUp = (Button)findViewById(R.id.reg_btn);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email_reg);
        password = (EditText)findViewById(R.id.password_reg);
        signIn = (TextView)findViewById(R.id.sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });






    }
}