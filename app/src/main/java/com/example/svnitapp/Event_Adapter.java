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

public class Event_Adapter extends RecyclerView.Adapter<Event_Adapter.MyViewHolder> {
    Context context;
    ArrayList<Events> eventList;

    public Event_Adapter(Context context, ArrayList<Events> eventList) {
        this.context = context;
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public Event_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.event,parent, false);
        return new Event_Adapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Event_Adapter.MyViewHolder holder, int position) {
        Events event = eventList.get(position);
        holder.eventTitle.setText(event.eventTitle);
        holder.event_date.setText(event.event_date);
        holder.star_image.setImageResource(R.drawable.star);
        holder.clubName.setText(event.clubName);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView eventTitle;
        TextView event_date;
        TextView clubName;
        TextView register;
        ImageView star_image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            eventTitle = itemView.findViewById(R.id.event);
            event_date = itemView.findViewById(R.id.event_date);
            star_image = itemView.findViewById(R.id.star);
            clubName  = itemView.findViewById(R.id.clubName);
            register = itemView.findViewById(R.id.register);
        }
    }
}
