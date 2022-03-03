package com.example.svnitapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.svnitapp.Modal.Notice;
import com.example.svnitapp.Adpter.Notice_Adapter;
import com.example.svnitapp.R;

import java.util.ArrayList;


public class NoticeFragment extends Fragment {



    public NoticeFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
   private ArrayList<Notice> noticeArrayList;
   private Notice_Adapter notice_adapter;
    String [] notices;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_notice, container, false);

        recyclerView = view.findViewById(R.id.notice_recyclerView);
//        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager( getContext()));
        noticeArrayList = new ArrayList<>();
        notice_adapter = new Notice_Adapter( getContext(), noticeArrayList);
        recyclerView.setAdapter(notice_adapter);
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));
        noticeArrayList.add(new Notice("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lectus nisl ligula pretium in arcu.","Nov 21, 2021"));

        notice_adapter.notifyDataSetChanged();

         return view;
    }
}