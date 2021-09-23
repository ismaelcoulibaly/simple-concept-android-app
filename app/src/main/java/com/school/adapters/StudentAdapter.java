package com.school.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.school.R;
import com.school.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{

    private List<Student> students = new ArrayList<>();
    private Context context;

    public StudentAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_item,parent,false);

        return new StudentAdapter.StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = students.get(position);
        holder.fullName.setText(student.getFullName());
        holder.studentId.setText(student.getStudentId());
        holder.birthDate.setText(student.getBirthDate());
        holder.picture.setImageResource(student.getPicture());
    }

    public void addCourse(List<Student> anotherList){
        students = anotherList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.students.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{

        private TextView fullName;
        private TextView studentId;
        private TextView birthDate;
        private ImageView picture;
        private CardView cardView;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            fullName = itemView.findViewById(R.id.student_fullname);
            studentId = itemView.findViewById(R.id.student_id_number);
            birthDate = itemView.findViewById(R.id.student_birthdate);
            picture = itemView.findViewById(R.id.student_picture);
            cardView = itemView.findViewById(R.id.student_cardview);
        }
    }
}
