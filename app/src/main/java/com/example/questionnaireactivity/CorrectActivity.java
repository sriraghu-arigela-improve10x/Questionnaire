package com.example.questionnaireactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class CorrectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            RadioButton radioButton1 = findViewById(R.id.radio_btn1);
            if (radioButton1.isChecked()){
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButton2 = findViewById(R.id.radio_btn2);
            if (radioButton2.isChecked()){
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButton3 = findViewById(R.id.radio_btn3);
            if(radioButton3.isChecked()){
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButton4 = findViewById(R.id.radio_btn4);
            if(radioButton4.isChecked()){
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }
        });
    }
}