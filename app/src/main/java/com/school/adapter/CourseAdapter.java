package com.school.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.school.R;
import com.school.model.Course;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>{

    private List<Course> coursesList;
    private Context context;

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
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        Course course = coursesList.get(position);
        holder.title.setText(course.getTitle());
        holder.icon.setImageResource(course.getIcon());
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
