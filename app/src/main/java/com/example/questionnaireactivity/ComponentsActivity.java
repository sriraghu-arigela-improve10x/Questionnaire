package com.example.questionnaireactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        Button radioBtn = findViewById(R.id.radio_btn);
        radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CorrectActivity.class);
            startActivity(intent);
        });

        Button checkBoxBtn = findViewById(R.id.checkbox_btn);
        checkBoxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CorrectAnswerActivity.class);
            startActivity(intent);
        });

        Button componentsBtn = findViewById(R.id.components_btn);
        componentsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SetDateAndCalenderActivity.class);
            startActivity(intent);
        });
    }
}