package com.example.svnitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResourceAdapter extends RecyclerView.Adapter<ResourceAdapter.MyViewHolder> {
    Context context;
    ArrayList<Resources> resourceList;

    public ResourceAdapter(Context context, ArrayList<Resources> resourceList) {
        this.context = context;
        this.resourceList = resourceList;
    }

    @NonNull
    @Override
    public ResourceAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.resource_item,parent, false);
        return new ResourceAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ResourceAdapter.MyViewHolder holder, int position) {
        Resources resources = resourceList.get(position);
        holder.resource_image.setImageResource(resources.source);
        holder.branch_Name.setText(resources.BranchName);
    }

    @Override
    public int getItemCount() {
        return resourceList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
         ImageView resource_image;
         TextView branch_Name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            resource_image = itemView.findViewById(R.id.resourceButton);
            branch_Name = itemView.findViewById(R.id.branchName);
        }
    }
}
