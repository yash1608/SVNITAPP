package com.example.svnitapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.svnitapp.fragment.EventFragment;
import com.example.svnitapp.fragment.NoticeFragment;
import com.example.svnitapp.fragment.ResouceFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavigationView1);
        bottomNavigationView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());
        fragmentTransaction.commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        switch (item.getItemId()) {

                            case R.id.resource_menu_item:
                                fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());

                                break;
                            case R.id.notice_menu_item:
                                fragmentTransaction.replace(R.id.mainfragment, new NoticeFragment());

                                break;
                            case R.id.event_menu_item:
                                fragmentTransaction.replace(R.id.mainfragment, new EventFragment());
                                break;
                            case R.id.drawer_menu_item:
                                break;
                        }
                        fragmentTransaction.commit();

                        return true;
                    }
                }
        );

    }



    @Override
    public void onBackPressed() {

        if (bottomNavigationView.getSelectedItemId()!=R.id.resource_menu_item){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());
            fragmentTransaction.commit();
             bottomNavigationView.getMenu().getItem(0).setChecked(true);
        }else {
            super.onBackPressed();
        }

    }
}