package com.example.svnitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Notice_Adapter extends RecyclerView.Adapter<Notice_Adapter.MyViewHolder> {

    Context context;
    ArrayList<Notice> noticeList;

    public Notice_Adapter(Context context, ArrayList<Notice> noticeList) {
        this.context = context;
        this.noticeList = noticeList;
    }

    @NonNull
    @Override
    public Notice_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.notice_board,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Notice_Adapter.MyViewHolder holder, int position) {
        Notice notice = noticeList.get(position);
        holder.notice.setText(notice.notice);
        holder.date.setText((CharSequence) notice.date);
        holder.pin_image.setImageResource(R.drawable.pin2);
    }

    @Override
    public int getItemCount() {
        return noticeList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView notice;
        TextView date;
        ImageView pin_image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            notice = itemView.findViewById(R.id.notice);
            date = itemView.findViewById(R.id.date);
            pin_image = itemView.findViewById(R.id.pin);
        }
    }
}
