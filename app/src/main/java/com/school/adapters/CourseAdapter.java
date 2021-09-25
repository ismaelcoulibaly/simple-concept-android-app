package com.school.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import androidx.recyclerview.widget.RecyclerView;

import com.school.R;
import com.school.models.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>{

    private List<Course> coursesList;
    private Context context;
    boolean isOnTextChanged = false;
    Map gradesMap=new HashMap();
    int gradesTotal = 0;

    public CourseAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_course_item,parent,false);

        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Course course = coursesList.get(position);
        holder.title.setText(course.getTitle());
        EditText gradeEditText = holder.grade;
        holder.icon.setImageResource(course.getIcon());

        //on écoute sur le champ gradeEditText (nous permettant d'entrer une note)
        gradeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                isOnTextChanged = true;
                Toast.makeText(context, "total: " + gradesTotal, Toast.LENGTH_LONG);
            }

            @Override
            public void afterTextChanged(Editable s) {

                if(isOnTextChanged){
//                    int gradeEntered =  StringUtils.isNotBlank(s.toString()) ? Integer.parseInt(s.toString()) : 0;
//                    if(s !=null)
//                        coursesList.get(position).setGrade(gradeEntered);
//                    else
//                        coursesList.get(position).setGrade(0);
//                    for(int i = 0; i<coursesList.size();i++){
//                        if(i == position)
//                            gradesMap.put(i,gradeEntered);
//                    }
                }

                Toast.makeText(context, "total", Toast.LENGTH_SHORT);
            }
        });



    }
    public void addCourse(List<Course> anotherList){
        coursesList = anotherList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.coursesList.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private EditText grade;//champ pour entrer une nouvelle note
        private ImageView icon;
        private CardView cardView;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.course_title);
            grade = itemView.findViewById(R.id.course_grade);
            icon = itemView.findViewById(R.id.course_icon);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
