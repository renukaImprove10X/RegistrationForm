package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        getSupportActionBar().setTitle("Professional Info");
        Intent intent = getIntent();
        Toast.makeText(this, intent.getStringExtra("username") +
                ":" +
                intent.getStringExtra("firstName") +
                ":" +
                intent.getStringExtra("lastName"), Toast.LENGTH_SHORT).show();
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent successIntent = new Intent(this, SuccessActivity.class);
            successIntent.putExtras(getIntent().getExtras());
            successIntent.putExtra("company", ((TextInputEditText)(findViewById(R.id.current_company_txt))).getText().toString());
            successIntent.putExtra("experience", ((TextInputEditText)(findViewById(R.id.total_experience_txt))).getText().toString());
            successIntent.putExtra("designation", ((TextInputEditText)(findViewById(R.id.designation))).getText().toString());
            startActivity(successIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}