package com.example.svnitapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.svnitapp.R;
import com.example.svnitapp.ResourceAdapter;
import com.example.svnitapp.Resources;

import java.util.ArrayList;


public class ResouceFragment extends Fragment {


    public ResouceFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    ArrayList<Resources> resourceArrayList;
    ResourceAdapter resource_adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_resouce, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.resource_recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager( getContext(), 2, GridLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(gridLayoutManager);
        resourceArrayList = new ArrayList<Resources>();
        resource_adapter = new ResourceAdapter( getContext(), resourceArrayList);
        recyclerView.setAdapter(resource_adapter);
        resourceArrayList.add(new Resources(R.drawable.settings,"Computer science"));
        resourceArrayList.add(new Resources(R.drawable.engineering,"Civil"));
        resourceArrayList.add(new Resources(R.drawable.chemical,"Chemical"));
        resourceArrayList.add(new Resources(R.drawable.electricity,"Electrical"));
        resourceArrayList.add(new Resources(R.drawable.cpu,"Electronics"));
        resourceArrayList.add(new Resources(R.drawable.mechanism,"Mechanical"));
        resourceArrayList.add(new Resources(R.drawable.chemistry1,"Chemistry"));
        resourceArrayList.add(new Resources(R.drawable.physics1,"Physics"));
        resourceArrayList.add(new Resources(R.drawable.study1,"Appl. Math & Hum\n"));

        resource_adapter.notifyDataSetChanged();


         return  view;


    }
}