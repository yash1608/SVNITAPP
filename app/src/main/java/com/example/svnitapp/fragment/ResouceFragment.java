package com.example.svnitapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.svnitapp.Adpter.Event_Adapter;
import com.example.svnitapp.Modal.Events;
import com.example.svnitapp.MainActivity;
import com.example.svnitapp.Modal.Notice;
import com.example.svnitapp.Adpter.Notice_Adapter;
import com.example.svnitapp.R;
import com.example.svnitapp.Adpter.ResourceAdapter;
import com.example.svnitapp.Modal.Resources;

import java.util.ArrayList;


public class ResouceFragment extends Fragment {


    public ResouceFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView, recycleNotice, recycleEvent;
    ArrayList<Resources> resourceArrayList;
    ResourceAdapter resource_adapter;
    private ArrayList<Notice> noticeArrayList;
    private Notice_Adapter notice_adapter;
    private ArrayList<Events> eventArrayList;
    private Event_Adapter event_adapter;
    TextView View_All_Notices, View_All_Events;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resouce, container, false);

        recyclerView = view.findViewById(R.id.resource_recyclerView);
        recycleNotice = view.findViewById(R.id.RecycleviewNoticeHome);
        recycleEvent = view.findViewById(R.id.RecycleviewEventHome);
        View_All_Events = view.findViewById(R.id.ViewAllEvent);
        View_All_Notices = view.findViewById(R.id.ViewAllNotice);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1, GridLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(gridLayoutManager);
        resourceArrayList = new ArrayList<Resources>();
        resource_adapter = new ResourceAdapter(getContext(), resourceArrayList);
        recyclerView.setAdapter(resource_adapter);
        resourceArrayList.add(new Resources(R.drawable.comp3, "Computer"));
        resourceArrayList.add(new Resources(R.drawable.civil3, "Civil"));
        resourceArrayList.add(new Resources(R.drawable.chenical3, "Chemical"));
        resourceArrayList.add(new Resources(R.drawable.eee3, "Electrical"));
        resourceArrayList.add(new Resources(R.drawable.eee3, "Electronics"));
        resourceArrayList.add(new Resources(R.drawable.group_31, "Mechanical"));
        resourceArrayList.add(new Resources(R.drawable.mech3, "Chemistry"));
        resourceArrayList.add(new Resources(R.drawable.physics1, "Physics"));
        resourceArrayList.add(new Resources(R.drawable.study1, "Appl. Math & Hum"));

        resource_adapter.notifyDataSetChanged();


        recycleNotice.setLayoutManager(new LinearLayoutManager(getContext()));
        noticeArrayList = new ArrayList<>();
        notice_adapter = new Notice_Adapter(getContext(), noticeArrayList);
        recycleNotice.setAdapter(notice_adapter);
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.", "Today"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.", "yesterday"));
        notice_adapter.notifyDataSetChanged();


        recycleEvent.setLayoutManager(new LinearLayoutManager(getContext()));
        eventArrayList = new ArrayList<Events>();
        event_adapter = new Event_Adapter(getContext(), eventArrayList);
        recycleEvent.setAdapter(event_adapter);

        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.", "Drishti", "Nov 21, 2021"));
        eventArrayList.add(new Events("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.", "Drishti", "Nov 21, 2021"));
        event_adapter.notifyDataSetChanged();


        View_All_Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =  getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainfragment, new EventFragment());
                fragmentTransaction.commit();
                MainActivity.indicator_remove(2);


            }
        });

        View_All_Notices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =  getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainfragment, new NoticeFragment());
                fragmentTransaction.commit();
                MainActivity.indicator_remove(3);

            }
        });

        return view;


    }
}