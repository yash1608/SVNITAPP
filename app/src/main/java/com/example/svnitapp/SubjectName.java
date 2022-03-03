package com.example.svnitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.svnitapp.Adpter.Subject_Adpter;

import java.util.ArrayList;

public class SubjectName extends AppCompatActivity {

    TextView SemesterName;
    RecyclerView semesterSubject;
    Subject_Adpter subject_adpter;
    ArrayList<String> list;
    SubjectList s = new SubjectList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_name);
        SemesterName = findViewById(R.id.SemesterName);
        semesterSubject = findViewById(R.id.semesterSubject);
        Intent i = getIntent();
        SemesterName.setText(i.getStringExtra("semester"));
        list = new ArrayList<>();
        String k = i.getStringExtra("semester");
        String name =  i.getStringExtra("BranchName")+"Semester"+k.charAt(k.length()-1);
//        Log.d("frfrf", "onCreate: "+ name);
        subject_adpter = new Subject_Adpter(s.getlist(name),getApplicationContext(),name);
        semesterSubject.setLayoutManager(new LinearLayoutManager(SubjectName.this));
        semesterSubject.setAdapter(subject_adpter);


    }
}