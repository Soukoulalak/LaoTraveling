package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
    ImageView img1;
    TextView tvname1;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        img1 =itemView.findViewById(R.id.img);
        tvname1 =itemView.findViewById(R.id.tvname);

    }
}

