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

public class Borikhamsai extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<HolderBka> adpt;
    String[] itmBks ={"ພະບາດໂພນສັນ","ຕາດວັງຟອງ","ດານຫີນໜອງສາມານ"};
    String[] Bksdetail={
            "\t\t\"ພະບາດໂພນສັນ\"  ທ່ານຈະໄດ້ພົບ ເຫັນຮອຍພະບາດ (ຮອຍຕີນ) ພະພຸດທະເຈົ້າ ຢຽບໄວ້ເທິງດານຫີນ, ທ່ຽວຊົມສະຖານທີ່ ສັນເຂົາຂອງພະພຸດທະອົງ ໃນກາລະຄັ້ງນັ້ນ, ມີແຄມຝັ່ງແມ່ນ້ຳຂອງ ແລະ ສິ່ງອື່ນໆອີກທີ່ເປັນໜ້າສົນໃຈ. ວັດພະບາດຂຶ້ນກັບ ເມືອງທ່າພະບາດ, ຕັ້ງຢູ່ ກິໂລແມັດ ທີ 83 ຈາກວຽງຈັນຕາມທາງເລກ ທີ 13 ໃຕ້, ວັດໂພສັນ ແມ່ນລ້ຽວແຍກທີ່ວັດພະບາດ ໄປທາງທິດຕາເວັນຕົກ 2 ກິໂລເມັດ (ແຄມແມ່ນ້ຳຂອງ). ເປັນວັດໜຶ່ງທີ່ເກົ່າແກ່ ຂອງຊາວເມືອງທ່າພະບາດ ແລະ ປະຊາຊົນຊາວ ພຸດທະສາສະໜາ ໄດ້ໃຫ້ເຄົາລົບນັບຖື ແລະ ສັກກະລະບູຊາ ມາເປັນເວລາເຫິງນານ",
            "\t\t\"ຕາດວັງຟອງ\" ເມືອງປາກກະດິງ ເປັນບ່ອນສ້າງຄວາມອຸດົມສົມບູນ ໃຫ້ແກ່ຊີວິດແນວຄິດສົດໃສ ເພາະມັນແມ່ນ ທຳມະຊາດລ້ວນໆ ອາກາດສົດໆ ຊື່ນຊົມກັບຄວາມງາມຂອງຜາຫີນ ຕາມສອງຟາກນ້ຳ, ນ້ຳຕົກຕາດ ແລະ ທຳມະຊາດ ທີ່ເປັນຮູບຊ້າງ. ຕາດວັງຟອງ ແມ່ນຕາດໜຶ່ງ ທີ່ຢູ່ຕາມສາຍນ້ຳກະດິງ ແລະ ນອນຢູ່ໃນໂຄງການ ຂອງລັດຖະບານ ເພື່ອສ້າງເຂື່ອນໄຟຟ້ານ້ຳຕົກ, ສະຖານທີ່ແຫ່ງນີ້ ຈະໄປຮອດດ້ວຍທາງເຮືອ ຕາມສາຍນ້ຳກະດິງ ປະມານ 40 ນາທີ ຈາກບ້ານໂພງາມ",
            "\t\t\"ດານຫີນໜອງສາມານ\" ແມ່ນອີກສະຖານທີ່ທ່ອງທ່ຽວໜຶ່ງ ທີ່ມີຄວາມສວຍສົດງົດງາມ ແລະ ໂດດເດັ່ນ, ຕັ້ງຢູ່ ເຂດບ້ານໜອງສາມານ, ເມືອງ ປາກຊັນ, ແຂວງບໍລິຄຳໄຊ ຫ່າງຈາກຕົວເມືອງໄປຕາມເສັ້ນທາງເລກທີ 13 ໃຕ້ ປະມານ 26 ກິໂລແມັດ ແລ້ວລ້ຽວຊ້າຍ ເຂົ້າປະມານ 4 ກິໂລແມັດ ກໍຈະເຫັນດານຫີນທີ່ກວ້າງ ແລະ ຍາວຢຽດໄປແຄມທາງເບື້ອງຊ້າຍມື"
    };
    int [] arrpicBks = {R.drawable.phabat,R.drawable.vungfong,R.drawable.sm};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bks);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<HolderBka>() {
            @NonNull
            @Override
            public HolderBka onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_bks,parent,false);
                return new HolderBka(v);
            }

            @Override
            public void onBindViewHolder(@NonNull HolderBka holder, int position) {
                holder.tvnameB.setText(itmBks[position]);
                holder.imgB.setImageResource(arrpicBks[position]);
                holder.tvdetailB.setText(Bksdetail[position]);
            }

            @Override
            public int getItemCount() {
                return itmBks.length;
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
