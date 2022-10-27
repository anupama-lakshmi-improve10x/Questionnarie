package com.sunshine.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button radioButtonBtn = findViewById(R.id.radiobtn_btn);
        radioButtonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });

        Button checkButtonBtn = findViewById(R.id.checkbtn_btn);
        checkButtonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxesActivity.class);
            startActivity(intent);
        });

        Button componentBtn = findViewById(R.id.component_btn);
        componentBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SetCalendarActivity.class);
            startActivity(intent);
        });
    }
}