package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderBka extends RecyclerView.ViewHolder {
    ImageView imgB;
    TextView tvnameB,tvdetailB;
    public HolderBka(@NonNull View itemView) {
        super(itemView);
        imgB =itemView.findViewById(R.id.img6);
        tvnameB =itemView.findViewById(R.id.tvname6);
        tvdetailB=itemView.findViewById(R.id.tvdetail6);
    }
}
