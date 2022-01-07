package com.example.svnitapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

import java.util.ArrayList;


public class EventActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Events> eventArrayList;
    Event_Adapter event_adapter;
    String [] events;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);
        RecyclerView recyclerView = findViewById(R.id.event_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        eventArrayList = new ArrayList<Events>();
        event_adapter = new Event_Adapter(this, eventArrayList);
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

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {

                        case R.id.resource_menu_item:
                            Intent intent1 = new Intent(EventActivity.this, ResouceActivity.class);
                            startActivity(intent1);
                            break;
                        case R.id.notice_menu_item:
                            Intent intent3 = new Intent(EventActivity.this, NoticeActivity.class);
                            startActivity(intent3);
                            break;
                        case R.id.event_menu_item:
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
