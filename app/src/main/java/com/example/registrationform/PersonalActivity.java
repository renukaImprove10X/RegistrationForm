package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        Intent intent = getIntent();
        Toast.makeText(this, intent.getStringExtra("email") +
                ":" +
                        intent.getStringExtra("password") +
                ":" +
                        intent.getStringExtra("confirmPassword"), Toast.LENGTH_SHORT).show();
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent professionalIntent = new Intent(this, ProfessionalActivity.class);
            professionalIntent.putExtras(getIntent().getExtras());
            professionalIntent.putExtra("username", ((TextInputEditText)(findViewById(R.id.username_txt))).getText().toString());
            professionalIntent.putExtra("firstName", ((TextInputEditText)(findViewById(R.id.firstname_txt))).getText().toString());
            professionalIntent.putExtra("lastName", ((TextInputEditText)(findViewById(R.id.lastname_txt))).getText().toString());
            startActivity(professionalIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}