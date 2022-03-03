package com.example.svnitapp.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svnitapp.Modal.Material;
import com.example.svnitapp.R;

import java.util.ArrayList;

public class StudyMaterilAdpter extends RecyclerView.Adapter<StudyMaterilAdpter.StudyMaterilHolder>{

    ArrayList<Material> list;
    Context context;

    public  StudyMaterilAdpter(ArrayList<Material> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public  StudyMaterilAdpter.StudyMaterilHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.material_item,parent,false);
        return  new   StudyMaterilHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  StudyMaterilAdpter.StudyMaterilHolder holder, int position) {
        Material m = list.get(position);
        holder.fileName.setText(m.getFileName());
        holder.fileSize.setText(m.getFileSize());
        holder.imageView.setImageResource(R.drawable.pdf);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StudyMaterilHolder  extends RecyclerView.ViewHolder{

        TextView fileName,fileSize;
        ImageView imageView;

        public  StudyMaterilHolder(@NonNull View itemView) {
            super(itemView);
            fileName = itemView.findViewById(R.id.filename);
            fileSize= itemView.findViewById(R.id.filesize);
            imageView= itemView.findViewById(R.id. fileicon);
        }
    }
}
