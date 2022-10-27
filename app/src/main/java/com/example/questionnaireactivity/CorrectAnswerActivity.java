package com.example.questionnaireactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CorrectAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            CheckBox mercuryCheck = findViewById(R.id.mercury_check);
            CheckBox sunCheck = findViewById(R.id.sun_check);
            CheckBox moonCheck = findViewById(R.id.moon_check);
            CheckBox jupiterCheck = findViewById(R.id.jupiter_check);
            CheckBox saturnCheck = findViewById(R.id.saturn_check);
            CheckBox plutoCheck = findViewById(R.id.pluto_check);
            if (mercuryCheck.isChecked() && jupiterCheck.isChecked() && saturnCheck.isChecked() &&
                    !sunCheck.isChecked() && !moonCheck.isChecked() && !plutoCheck.isChecked()) {
                Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
            }


            /*if (sunCheck.isChecked()) {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }

            if (moonCheck.isChecked()) {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }

            if (jupiterCheck.isChecked()) {
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            }

            if (saturnCheck.isChecked()) {
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            }

            if (plutoCheck.isChecked()) {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            } else {

            }*/
        });
    }
}