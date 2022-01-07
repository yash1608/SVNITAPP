package com.example.svnitapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SemesterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Semesters> semesterArrayList;
    SemesterAdapter semester_adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_activity);
        RecyclerView recyclerView = findViewById(R.id.semester_recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        semesterArrayList = new ArrayList<Semesters>();
        semester_adapter = new SemesterAdapter(this, semesterArrayList);
        recyclerView.setAdapter(semester_adapter);
        semesterArrayList.add(new Semesters(R.drawable.star));
        semesterArrayList.add(new Semesters(R.drawable.star));
        semesterArrayList.add(new Semesters(R.drawable.star));
        semesterArrayList.add(new Semesters(R.drawable.star));
        semesterArrayList.add(new Semesters(R.drawable.star));
        semester_adapter.notifyDataSetChanged();
    }
}
