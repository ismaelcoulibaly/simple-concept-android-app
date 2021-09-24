package com.school;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import com.school.adapters.CourseAdapter;
import com.school.models.Course;

import java.util.ArrayList;
import java.util.List;

public class ResultsActivity extends AppCompatActivity{

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        CourseAdapter courseAdapter = new CourseAdapter(getApplication());
        recyclerView = findViewById(R.id.fragment_main_courses_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));

        courseAdapter.addCourse(loadCourses());
        recyclerView.setAdapter(courseAdapter);
    }

    private List<Course> loadCourses() {
        List<Course> coursesList= new ArrayList<>();
        coursesList.add(new Course("Mathématiques","Entrez une nouvelle note: ",R.drawable.maths_course_icon ));
        coursesList.add(new Course("Android","Entrez une nouvelle note: ",R.drawable.android_course_icon ));
        coursesList.add(new Course("HTML","Entrez une nouvelle note: ",R.drawable.html_course_icon ));
        coursesList.add(new Course("JAVA","Entrez une nouvelle note: ",R.drawable.java_course_icon ));

        return coursesList;
    }

}