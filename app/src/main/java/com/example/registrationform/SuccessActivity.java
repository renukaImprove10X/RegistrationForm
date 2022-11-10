package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Intent intent = getIntent();
        Toast.makeText(this,
                intent.getStringExtra("email") +
                        ":" +
                        intent.getStringExtra("password") +
                        ":" +
                        intent.getStringExtra("confirmPassword") +
                        ":" +
                        intent.getStringExtra("username") +
                        ":" +
                        intent.getStringExtra("firstName") +
                        ":" +
                        intent.getStringExtra("lastName") +
                        intent.getStringExtra("company") +
                        ":" +
                        intent.getStringExtra("experience") +
                        ":" +
                        intent.getStringExtra("designation"), Toast.LENGTH_SHORT).show();

        ((TextView) (findViewById(R.id.email_address_txt))).setText(intent.getStringExtra("email"));
        ((TextView) (findViewById(R.id.username_txt))).setText(intent.getStringExtra("username"));
        ((TextView) (findViewById(R.id.firstname_txt))).setText(intent.getStringExtra("firstName"));
        ((TextView) (findViewById(R.id.lastname_txt))).setText(intent.getStringExtra("lastName"));
        ((TextView) (findViewById(R.id.current_company_txt))).setText(intent.getStringExtra("company"));
        ((TextView) (findViewById(R.id.total_experience_txt))).setText(intent.getStringExtra("experience"));
        ((TextView) (findViewById(R.id.designation))).setText(intent.getStringExtra("designation"));
    }
}