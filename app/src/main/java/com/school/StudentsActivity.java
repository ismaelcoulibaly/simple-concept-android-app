package com.school;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import com.school.adapters.StudentAdapter;
import com.school.models.Course;
import com.school.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        StudentAdapter studentAdapter = new StudentAdapter(getApplication());
        recyclerView = findViewById(R.id.fragment_main_students_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));

        studentAdapter.addCourse(loadStudents());
        recyclerView.setAdapter(studentAdapter);
    }

    private List<Student> loadStudents() {
        List<Student> studentsList= new ArrayList<>();
        studentsList.add(new Student("Ismaël Coulibaly","COUISM070790","07-07-1990",R.drawable.student1_icon ));
        studentsList.add(new Student("Soumaïla Coulibaly","COUSOU070890","07-08-1990",R.drawable.student2_icon ));
        studentsList.add(new Student("John Kayne","JOHKAY220598","22-05-19908",R.drawable.student3_icon ));
        studentsList.add(new Student("Iddris Sandu","SANIDD070597","07-05-1997",R.drawable.student4_icon ));
        studentsList.add(new Student("Kanye West","WESKAN081278","08-12-1978",R.drawable.student5_icon ));
        studentsList.add(new Student("Hamidou Diallo","DIAHAM121200","12-12-2000",R.drawable.student6_icon ));
        studentsList.add(new Student("Bouba Diop","DIOBOU040499","04-04-1999",R.drawable.android_course_icon ));
        studentsList.add(new Student("Modibo Diarra","DIAMOD060696","06-06-1996",R.drawable.android_course_icon ));
        studentsList.add(new Student("Mos Def","MOSDEF090970","09-09-1970",R.drawable.android_course_icon ));
        studentsList.add(new Student("Mark Newson","NEWMAR050790","05-07-1990",R.drawable.android_course_icon ));
        studentsList.add(new Student("Brandon Tory","TORBRA030398","03-03-1998",R.drawable.android_course_icon ));
        studentsList.add(new Student("Elon Musk","MUSELO010198","01-01-1998",R.drawable.android_course_icon ));

        return studentsList;
    }
}