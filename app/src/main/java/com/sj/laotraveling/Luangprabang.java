package com.sj.laotraveling;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class Luangprabang extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<HolderLuangprabang> adpt;
    String [] itmL ={"ວັດຊຽງທອງ","ນ້ຳຕົກຕາດກວງຊີ","ວັດພູສີ"};
    String [] ldetail={
            "\t\t\"ວັດຊຽງທອງ\" ເຊິ່ງເປັນວັດທີ່ສຳຄັນ ແລະ ມີຄວາມງົດງາມທີ່ສຸດ ຈົນໄດ້ຮັບການຍ້ອງຍໍຈາກນັກບູຮານຄະດີ ວ່າເປັນດັ່ງອັນຍະມະນີແຫ່ງສະຖາປັດຕະຍະກຳລາວ ວັດຊຽງທອງຖືກສ້າງຂຶ້ນ ໃນລາຊະສະໄໝພຣະເຈົ້າໄຊເຊດຖາທິລາດ ປີ ຄ.ສ 1560",
            "\t\t\"ນ້ຳຕົກຕາດກວງຊີ\" ແມ່ນນ້ຳຕົກຕາດໜຶ່ງ ທີ່ສວຍງາມທີ່ສຸດ ໃນແຂວງຫຼວງພະບາງ ຢູ່ຫ່າງຈາກຕົວເມືອງ ໄປທາງທິດຕະເວັນຕົກສຽງໃຕ້ປະມານ 32 ກິໂລແມັດ ເມື່ອເຖິງບ່ອນຈອດລົດຕ້ອງຍ່າງຂຶ້ນໄປອີກປະມານ 300 ແມັດຈະເຖິງຕົວນ້ຳຕົກຕາດ",
            "\t\t\"ວັດພູສີ\" ຕັ້ງຢູ່ກາງເມືອງ ຫຼວງພະບາງ ແລະ ມີພະທາດ ສູງ 20 ແມັດ ຕັ້ງຢູ່ເທິງຈອມ. ເປັນສະຖານທີ່ຊົມວິວທິທັດ ຂອງເມືອງໄດ້ເຖິງ 360 ອົງສາ ເຫັນຄວາມສວຍງາມໄດ້ທຸກມຸມ ຂອງຫຼວງພະບາງ, ນອກນັ້ນຍັງສາມາດເຫັນ ທິວທັດທຳມະຊາດ ຈຸດໄຫຼ ພົບຂອງສາຍນ້ຳຂອງ ແລະ ສາຍນ້ຳຄານ"
    };
    int [] arrpicL = {R.drawable.siengthong,R.drawable.kuangzy,R.drawable.phousy};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutshowdata);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<HolderLuangprabang>() {
            @NonNull
            @Override
            public HolderLuangprabang onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layoutshowdata,parent,false);
                return new HolderLuangprabang(v);
            }

            @Override
            public void onBindViewHolder(@NonNull HolderLuangprabang holder, int position) {
                holder.tvnameL.setText(itmL[position]);
                holder.imgL.setImageResource(arrpicL[position]);
                holder.tvdetailL.setText(ldetail[position]);
            }

            @Override
            public int getItemCount() {
                return itmL.length;
            }
        };
        crv.setAdapter(adpt);
        setContentView(crv);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
