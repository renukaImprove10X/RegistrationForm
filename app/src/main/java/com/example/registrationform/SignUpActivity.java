package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent personalIntent = new Intent(this, PersonalActivity.class);
            personalIntent.putExtra("email", ((TextInputEditText)(findViewById(R.id.email_address_txt))).getText().toString());
            personalIntent.putExtra("password", ((TextInputEditText)(findViewById(R.id.password_txt))).getText().toString());
            personalIntent.putExtra("confirmPassword", ((TextInputEditText)(findViewById(R.id.confirm_password_txt))).getText().toString());
            startActivity(personalIntent);
        });
    }
}