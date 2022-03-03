package com.example.svnitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StudyMaterial extends AppCompatActivity {

    TextView   Semester1 ,Semester2,Semester3,Semester4,Semester5,Semester6,Semester7,Semester8 , BranchName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);
         id();
         Intent i = getIntent();
         BranchName.setText(i.getStringExtra("BranchName"));

         Semester1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                 i.putExtra("semester",Semester1.getText().toString());
                 i.putExtra("BranchName",BranchName.getText().toString());
                 startActivity(i);

             }
         });

        Semester2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("BranchName", BranchName.getText().toString());
                i.putExtra("semester",Semester2.getText().toString());
                startActivity(i);

            }
        });

        Semester3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester3.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });

        Semester3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester3.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });

        Semester4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester4.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });

        Semester5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester5.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });

        Semester6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester6.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });

        Semester7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester7.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });

        Semester8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudyMaterial.this,SubjectName.class);
                i.putExtra("semester",Semester8.getText().toString());
                i.putExtra("BranchName", BranchName.getText().toString());
                startActivity(i);

            }
        });



    }

    private void id() {
        Semester1 =findViewById(R.id.Semester1);
        Semester2 =findViewById(R.id.Semester2);
        Semester3 =findViewById(R.id.Semester3);
        Semester4 =findViewById(R.id.Semester4);
        Semester5 =findViewById(R.id.Semester5);
        Semester6 =findViewById(R.id.Semester6);
        Semester7 =findViewById(R.id.Semester7);
        Semester8 =findViewById(R.id.Semester8);
        BranchName=findViewById(R.id.BranchName);
    }
}