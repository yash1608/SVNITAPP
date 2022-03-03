package com.example.svnitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SubjectItem extends AppCompatActivity {

    TextView StudyMaterial,PreviousPaper;
    String ExtraName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_item);

        StudyMaterial = findViewById(R.id.StudyMaterial);
        PreviousPaper =findViewById(R.id.PreviousPaper);

        Intent i = getIntent();
        ExtraName = i.getStringExtra("ExtraName");


        StudyMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubjectItem.this, StudyMaterialActivity.class);
                startActivity(i);
             }
        });
        PreviousPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i = new Intent(SubjectItem.this,PreviosPeparActivity.class);
                 startActivity(i);
            }
        });
    }
}