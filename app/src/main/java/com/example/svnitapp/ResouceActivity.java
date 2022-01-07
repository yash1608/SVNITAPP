package com.example.svnitapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

import java.util.ArrayList;

public class ResouceActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Resources> resourceArrayList;
    ResourceAdapter resource_adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resource_activity);
        RecyclerView recyclerView = findViewById(R.id.resource_recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        resourceArrayList = new ArrayList<Resources>();
        resource_adapter = new ResourceAdapter(this, resourceArrayList);
        recyclerView.setAdapter(resource_adapter);
        resourceArrayList.add(new Resources(R.drawable.comps));
        resourceArrayList.add(new Resources(R.drawable.civil));
        resourceArrayList.add(new Resources(R.drawable.chemical));
        resourceArrayList.add(new Resources(R.drawable.electrical));
        resourceArrayList.add(new Resources(R.drawable.electronics));
        resourceArrayList.add(new Resources(R.drawable.mechanical));
        resourceArrayList.add(new Resources(R.drawable.chemistry));
        resourceArrayList.add(new Resources(R.drawable.physics));
        resourceArrayList.add(new Resources(R.drawable.maths));

        resource_adapter.notifyDataSetChanged();


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {

                        case R.id.resource_menu_item:
                            break;
                        case R.id.notice_menu_item:
                            Intent intent2 = new Intent(ResouceActivity.this, NoticeActivity.class);
                            startActivity(intent2);
                            break;
                        case R.id.event_menu_item:
                            Intent intent3 = new Intent(ResouceActivity.this, EventActivity.class);
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
