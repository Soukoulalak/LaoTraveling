package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderVtCap extends RecyclerView.ViewHolder {
    ImageView imgVtc;
    TextView tvnameVtc, tvdetailVtc;
    public HolderVtCap (@NonNull View itemView) {
        super(itemView);
        imgVtc =itemView.findViewById(R.id.img3);
        tvnameVtc =itemView.findViewById(R.id.tvname3);
        tvdetailVtc=itemView.findViewById(R.id.tvdetail3);
    }
}
