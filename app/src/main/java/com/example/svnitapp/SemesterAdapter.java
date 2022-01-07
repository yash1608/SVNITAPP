package com.example.svnitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SemesterAdapter extends RecyclerView.Adapter<SemesterAdapter.MyViewHolder> {
    Context context;
    ArrayList<Semesters> semesterList;

    public SemesterAdapter(Context context, ArrayList<Semesters> semesterList) {
        this.context = context;
        this.semesterList = semesterList;
    }

    @NonNull
    @Override
    public SemesterAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.semester_item,parent, false);
        return new SemesterAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SemesterAdapter.MyViewHolder holder, int position) {
        Semesters semester = semesterList.get(position);
        holder.semester_image.setImageResource(semester.source);
    }

    @Override
    public int getItemCount() {
        return semesterList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageButton semester_image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            semester_image = itemView.findViewById(R.id.semesterButton);
        }
    }
}
