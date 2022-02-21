package com.example.svnitapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.svnitapp.Event_Adapter;
import com.example.svnitapp.Events;
import com.example.svnitapp.R;

import java.util.ArrayList;


public class EventFragment extends Fragment {



    public EventFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    ArrayList<Events> eventArrayList;
    Event_Adapter event_adapter;
    String [] events;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_event, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.event_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager( getContext()));
        eventArrayList = new ArrayList<Events>();
        event_adapter = new Event_Adapter( getContext(), eventArrayList);
        recyclerView.setAdapter(event_adapter);

        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Drishti", "Nov 21, 2021"));


        event_adapter.notifyDataSetChanged();


        return  view;
    }
}