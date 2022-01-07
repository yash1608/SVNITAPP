package com.example.svnitapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

import java.util.ArrayList;

public class NoticeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Notice> noticeArrayList;
    Notice_Adapter notice_adapter;
    String [] notices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_activity);


        recyclerView = findViewById(R.id.recycler_view);
//        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        noticeArrayList = new ArrayList<>();
        notice_adapter = new Notice_Adapter(this, noticeArrayList);
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

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.resource_menu_item:
                                Intent intent1 = new Intent(NoticeActivity.this, ResouceActivity.class);
                                startActivity(intent1);
                                break;
                            case R.id.notice_menu_item:
                                break;
                            case R.id.event_menu_item:
                                Intent intent3 = new Intent(NoticeActivity.this, EventActivity.class);
                                startActivity(intent3);
                                break;
                            case R.id.drawer_menu_item:
                                break;
                        }
                        return false;
                    }
                }
        );
    }
}