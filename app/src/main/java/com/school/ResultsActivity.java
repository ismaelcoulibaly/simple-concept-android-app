package com.school;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.school.adapters.CourseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ResultsActivity extends AppCompatActivity{

    private Button calculateAverage;
    private EditText mathsGradeEditText;
    private EditText htmlGradeEditText;
    private EditText androidGradeEditText;
    private EditText javaGradeEditText;
    private TextView averageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        calculateAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}