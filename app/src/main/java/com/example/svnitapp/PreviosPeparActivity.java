package com.example.svnitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.svnitapp.Adpter.PreviosPeparAdpter;
import com.example.svnitapp.Modal.Material;

import java.util.ArrayList;

public class PreviosPeparActivity extends AppCompatActivity {

    RecyclerView PreviosRecycleView;
    PreviosPeparAdpter previosPeparAdpter;
    ArrayList<Material> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previos_pepar);

        list = new ArrayList<>();
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        list.add(new Material("Engineering mathematics"  , "128 MB"));
        PreviosRecycleView = findViewById(R.id.PreviosPeparRecycleview);
        previosPeparAdpter = new PreviosPeparAdpter(list , getApplicationContext());
        PreviosRecycleView.setLayoutManager(new LinearLayoutManager(PreviosPeparActivity.this));
        PreviosRecycleView.setAdapter(previosPeparAdpter);
    }
}