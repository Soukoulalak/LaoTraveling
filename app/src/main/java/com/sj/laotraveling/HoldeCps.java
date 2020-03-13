package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HoldeCps extends RecyclerView.ViewHolder {
    ImageView imgC;
    TextView tvnameC,tvdetailC;
    public HoldeCps(@NonNull View itemView) {
        super(itemView);
        imgC =itemView.findViewById(R.id.img4);
        tvnameC =itemView.findViewById(R.id.tvname4);
        tvdetailC=itemView.findViewById(R.id.tvdetail4);
    }
}
