package com.example.svnitapp.Adpter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svnitapp.R;
import com.example.svnitapp.SubjectItem;

import java.util.ArrayList;

public class Subject_Adpter extends RecyclerView.Adapter<Subject_Adpter.subjectUttem> {

    ArrayList<String> list;
    Context context;
    String name;

    public Subject_Adpter(ArrayList<String> list, Context context , String name) {
        this.list = list;
        this.context = context;
        this.name = name;
    }

    @NonNull
    @Override
    public subjectUttem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_subject_list,parent, false);
        return new subjectUttem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull subjectUttem holder, @SuppressLint("RecyclerView") int position) {

        holder.subject_name.setText(list.get(position));
        holder.subject_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context , SubjectItem.class);
                i.putExtra("ExtraName",name+holder.subject_name.getText().toString());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
        if(list.size()-1 == position){
            holder.line.setVisibility(View.GONE);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class subjectUttem extends RecyclerView.ViewHolder{

        TextView subject_name;
        View  line;
        public subjectUttem(@NonNull View itemView) {
            super(itemView);
            subject_name = itemView.findViewById(R.id.SubjectName);
            line= itemView.findViewById(R.id.line);
        }
    }
}
