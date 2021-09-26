package com.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button resultsBtn;
    private Button studentsBtn;
    private TextView mainText;
    int average = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultsBtn = findViewById(R.id.results_btn);
        studentsBtn = findViewById(R.id.students_btn);
        mainText = findViewById(R.id.main_text);
        resultsBtn.setOnClickListener(this);
        studentsBtn.setOnClickListener(this);

        Intent resultIntent = getIntent();//intent provenant de le l'activité de la moyenne
        average = resultIntent.getIntExtra(ResultsActivity.RESULT_HOLDER,0);

        if (average != 0){
            mainText.setText("Votre moyenne est de :" + average);
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.results_btn:

                Intent resultsIntent = new Intent(this, ResultsActivity.class);
                startActivity(resultsIntent);

                break;

            case R.id.students_btn:

                Intent studentsIntent = new Intent(this, StudentsActivity.class);
                startActivity(studentsIntent);

                break;


            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }
}