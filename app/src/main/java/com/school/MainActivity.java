package com.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button resultsBtn;
    private Button studentsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultsBtn = findViewById(R.id.results_btn);
        studentsBtn = findViewById(R.id.students_btn);

        resultsBtn.setOnClickListener(this);
        studentsBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.results_btn:

                Intent resultsIntent = new Intent(this, ResultsActivity.class);

                /*int v1 = Integer.parseInt(edtext1.getText().toString().trim());
                int v2 = Integer.parseInt(edtext2.getText().toString().trim());
                intent.putExtra(VALUE_HOLDER1, v1);
                intent.putExtra(VALUE_HOLDER2, v2);*/
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