package com.sj.laotraveling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderLuangprabang extends RecyclerView.ViewHolder {
    ImageView imgL;
    TextView tvnameL,tvdetailL;
    public HolderLuangprabang(@NonNull View itemView) {
        super(itemView);
        imgL =itemView.findViewById(R.id.img2);
        tvnameL =itemView.findViewById(R.id.tvname2);
        tvdetailL=itemView.findViewById(R.id.tvdetail2);
    }
}
