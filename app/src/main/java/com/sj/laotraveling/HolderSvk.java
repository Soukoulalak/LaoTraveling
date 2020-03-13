package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderSvk extends RecyclerView.ViewHolder {
    ImageView imgS;
    TextView tvnameS,tvdetailS;
    public HolderSvk(@NonNull View itemView) {
        super(itemView);
        imgS =itemView.findViewById(R.id.img5);
        tvnameS =itemView.findViewById(R.id.tvname5);
        tvdetailS=itemView.findViewById(R.id.tvdetail5);
    }
}
