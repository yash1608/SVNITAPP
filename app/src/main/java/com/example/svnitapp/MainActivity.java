package com.example.svnitapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.svnitapp.fragment.EventFragment;
import com.example.svnitapp.fragment.NoticeFragment;
import com.example.svnitapp.fragment.ResouceFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView ImageView_Home, ImageView_Event, ImageView_Notice, ImageView_About;
    static View View_Home;
    static View View_Event;
    static View View_Notice;
    static View View_About;
    static TextView TextView_indicator1;
    static TextView TextView_indicator2;
    static TextView TextView_indicator3;
    static TextView TextView_indicator4;
    static LottieAnimationView animationView_Home;
    static LottieAnimationView animationView_Event;
    static LottieAnimationView animationView_Notice;
    static LottieAnimationView animationView_About;

    static Animation animation1;
    static int indicator_Number = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.indicator_animation);

        Idinitialize();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());
        fragmentTransaction.commit();

//        ImageView_Home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View_Home.setVisibility(View.VISIBLE);
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());
//                fragmentTransaction.commit();
//                View_Home.startAnimation(animation1);
//                indicator_remove(1);
//                TextView_indicator1.setTypeface(Typeface.DEFAULT_BOLD);
//
//            }
//        });
        animationView_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());
                fragmentTransaction.commit();
                indicator_remove(1);


            }
        });

        animationView_Event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainfragment, new EventFragment());
                fragmentTransaction.commit();
                indicator_remove(2);


            }
        });

        animationView_Notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainfragment, new NoticeFragment());
                fragmentTransaction.commit();
                indicator_remove(3);


            }
        });


        animationView_About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                indicator_remove(4);


            }
        });


    }

    public static void indicator_remove(int i) {

        for (int k = 1; k <= 4; k++) {


            if (k == i) {
                indicator_Number = i;
                switch (k) {
                    case 1:
                        View_Home.setVisibility(View.VISIBLE);
                        animationView_Home.playAnimation();
                        View_Home.startAnimation(animation1);
                        TextView_indicator1.setTypeface(Typeface.DEFAULT_BOLD);
                        break;
                    case 2:
                        View_Event.setVisibility(View.VISIBLE);
                        animationView_Event.playAnimation();
                        View_Event.startAnimation(animation1);
                        TextView_indicator2.setTypeface(Typeface.DEFAULT_BOLD);
                        break;
                    case 3:
                        View_Notice.setVisibility(View.VISIBLE);
                        animationView_Notice.playAnimation();
                        View_Notice.startAnimation(animation1);
                        TextView_indicator3.setTypeface(Typeface.DEFAULT_BOLD);
                        break;
                    case 4:
                        View_About.setVisibility(View.VISIBLE);
                        animationView_About.playAnimation();
                        View_About.startAnimation(animation1);
                        TextView_indicator4.setTypeface(Typeface.DEFAULT_BOLD);
                        break;
                }
            } else {
                switch (k) {
                    case 1:
                        View_Home.setVisibility(View.GONE);
                        TextView_indicator1.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                        break;
                    case 2:
                        View_Event.setVisibility(View.GONE);
                        TextView_indicator2.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                        break;
                    case 3:
                        View_Notice.setVisibility(View.GONE);
                        TextView_indicator3.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                        break;
                    case 4:
                        View_About.setVisibility(View.GONE);
                        TextView_indicator4.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                        break;
                }
            }
        }

    }


    private void Idinitialize() {
//        ImageView_About = findViewById(R.id.BottomAvatar);
////        ImageView_Home = findViewById(R.id.BottomHome);
//        ImageView_Event = findViewById(R.id.BottmEvent);
//        ImageView_Notice = findViewById(R.id.BottomNotice);

        View_Home = findViewById(R.id.indicator1);
        View_Event = findViewById(R.id.indicator2);
        View_Notice = findViewById(R.id.indicator3);
        View_About = findViewById(R.id.indicator4);

        TextView_indicator1 = findViewById(R.id.indicator1Text);
        TextView_indicator2 = findViewById(R.id.indicator2Text);
        TextView_indicator3 = findViewById(R.id.indicator3Text);
        TextView_indicator4 = findViewById(R.id.indicator4Text);


        animationView_About = findViewById(R.id.animationView4);
        animationView_Home = findViewById(R.id.animationView1);
        animationView_Notice = findViewById(R.id.animationView3);
        animationView_Event = findViewById(R.id.animationView2);
    }


    @Override
    public void onBackPressed() {


        if (indicator_Number != 1) {
            View_Home.setVisibility(View.VISIBLE);
            animationView_Home.playAnimation();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.mainfragment, new ResouceFragment());
            fragmentTransaction.commit();
            View_Home.startAnimation(animation1);
            indicator_remove(1);
            TextView_indicator1.setTypeface(Typeface.DEFAULT_BOLD);

        } else {
            super.onBackPressed();
        }

    }
}