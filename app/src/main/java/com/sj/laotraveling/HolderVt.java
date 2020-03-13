package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderVt extends RecyclerView.ViewHolder {
    ImageView imgVt;
    TextView tvnameVt,tvdetailVt;
    public HolderVt(@NonNull View itemView) {
        super(itemView);
        imgVt =itemView.findViewById(R.id.img7);
        tvnameVt =itemView.findViewById(R.id.tvname7);
        tvdetailVt=itemView.findViewById(R.id.tvdetail7);
    }
}
