package com.school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ResultsActivity extends AppCompatActivity{

    private Button calculateAverage;
    private EditText mathsGradeEditText;
    private EditText htmlGradeEditText;
    private EditText androidGradeEditText;
    private EditText javaGradeEditText;
    private TextView averageTextView;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        calculateAverage = findViewById(R.id.calculate_average_btn);
        mathsGradeEditText = findViewById(R.id.maths_grade);
        htmlGradeEditText = findViewById(R.id.html_grade);
        androidGradeEditText = findViewById(R.id.android_grade);
        javaGradeEditText = findViewById(R.id.java_grade);
        averageTextView = findViewById(R.id.average_id);

        mathsGradeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {//si le champ est laissé vide, on remplace la valeur par 0
                if(s.toString().isEmpty()){s.replace(0,0,"0");}
            }
        });

        htmlGradeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {//si le champ est laissé vide, on remplace la valeur par 0
                if(s.toString().isEmpty()){s.replace(0,0,"0");}
            }
        });

        androidGradeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {//si le champ est laissé vide, on remplace la valeur par 0
                if(s.toString().isEmpty()){s.replace(0,0,"0");}
            }
        });

        javaGradeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {//si le champ est laissé vide, on remplace la valeur par 0
                if(s.toString().isEmpty()){s.replace(0,0,"0");}
            }
        });



        calculateAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = Integer.parseInt(mathsGradeEditText.getText().toString())
                        + Integer.parseInt(htmlGradeEditText.getText().toString())
                        + Integer.parseInt(androidGradeEditText.getText().toString())
                    + Integer.parseInt(javaGradeEditText.getText().toString());

                int average = total / 4 ;
                averageTextView.setText("Moyenne: "+ average);
            }
        });
    }


}