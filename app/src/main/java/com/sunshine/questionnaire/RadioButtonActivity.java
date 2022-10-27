package com.sunshine.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        Button verifyButtonBtn = findViewById(R.id.verify_btn);
        verifyButtonBtn.setOnClickListener(view -> {
           /* RadioButton radioButtonBtn1 = findViewById(R.id.option1_btn);
            if(radioButtonBtn1.isChecked()){
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButtonBtn2 = findViewById(R.id.option2_btn);
            if(radioButtonBtn2.isChecked()){
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButtonBtn3 = findViewById(R.id.option3_btn);
            if(radioButtonBtn3.isChecked()){
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButtonBtn4 = findViewById(R.id.option4_btn);
            if(radioButtonBtn4.isChecked()){
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }*/

            RadioGroup numberRg = findViewById(R.id.number_rg);
            int selectedButtonId = numberRg.getCheckedRadioButtonId();
            if(selectedButtonId == R.id.option1_btn) {
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.option2_btn) {
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.option3_btn){
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.option4_btn){
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            }
        });
    }

}