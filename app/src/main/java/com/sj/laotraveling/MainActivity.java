package com.sj.laotraveling;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<myViewHolder> adpt;
    String[] itm ={"ຫຼວງພະບາງ","ນະຄອນຫຼວງວຽງຈັນ","ຈຳປາສັກ",
            "ສະຫວັນນະເຂດ","ບໍລິຄຳໄຊ","ວຽງຈັນ"};
    int [] arrpic = {R.drawable.siengthong,R.drawable.patuxay,R.drawable.wutpu,
            R.drawable.inghung,R.drawable.phabat,R.drawable.thamchung};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<myViewHolder>() {
            @NonNull
            @Override
            public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_main,parent,false);
                return new myViewHolder(v);
            }

            @Override
            public void onBindViewHolder(@NonNull final myViewHolder holder, final int position) {
                holder.tvname1.setText(itm[position]);
                holder.img1.setImageResource(arrpic[position]);
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(position==0){
                            Intent i = new Intent(v.getContext(), ActivityShowData.class);
                            v.getContext().startActivity(i);
                        } else if (position==1){
                            Intent i = new Intent(v.getContext(), vientianecap.class);
                            v.getContext().startActivity(i);
                        }else if (position==2){
                            Intent i = new Intent(v.getContext(), Champasak.class);
                            v.getContext().startActivity(i);
                        }
                        else if (position==3){
                            Intent i = new Intent(v.getContext(), Savannakhet.class);
                            v.getContext().startActivity(i);
                        }
                        else if (position==4){
                            Intent i = new Intent(v.getContext(), Borikhamsai.class);
                            v.getContext().startActivity(i);
                        }
                        else if (position==5){
                            Intent i = new Intent(v.getContext(), Vientiane.class);
                            v.getContext().startActivity(i);
                        }

                    }
                });
            }

            @Override
            public int getItemCount() {
                return itm.length;
            }
        };
        crv.setAdapter(adpt);
        setContentView(crv);
    }
}