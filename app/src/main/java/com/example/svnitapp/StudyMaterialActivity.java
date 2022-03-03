package com.example.svnitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.svnitapp.Adpter.PreviosPeparAdpter;
import com.example.svnitapp.Adpter.StudyMaterilAdpter;
import com.example.svnitapp.Modal.Material;

import java.util.ArrayList;

public class StudyMaterialActivity extends AppCompatActivity {

    RecyclerView StudyRecycleView;
    StudyMaterilAdpter studyMaterilAdpter;
    ArrayList<Material> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material2);

        StudyRecycleView = findViewById(R.id.StudyMaterialRecycleview);
        list = new ArrayList<>();
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
        list.add(new Material("Engineering mathematics - 1"  , "128 MB"));
         studyMaterilAdpter = new StudyMaterilAdpter(list , getApplicationContext());
        StudyRecycleView.setLayoutManager(new LinearLayoutManager(  StudyMaterialActivity.this));
         StudyRecycleView.setAdapter(studyMaterilAdpter);
    }
}