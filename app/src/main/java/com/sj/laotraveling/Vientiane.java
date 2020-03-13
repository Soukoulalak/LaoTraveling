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

public class Vientiane extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<HolderVt> adpt;
    String[] itmVt ={"ຖ້ຳຈັງ","ຖໍ້າປູຄຳ","ຖ້ຳນາງນອນ"};
    String[] Vtdetail={
            "\t\t\"ຖ້ຳຈັງ\" ຕັ້ງຢູ່ຫ່າງຈາກຕົວເມືອງວັງວຽງ ປະມານ 1 - 2 ກິໂລແມັດ ທາງທີ່ຈະເດິນທາງໄປຍັງຖ້ຳຈັງ ນັກທ່ອງທ່ຽວຈະຕ້ອງຍ່າງຜ່ານຂົວຂ້າມແມ່ນ້ຳຊອງ ເຊິ່ງເປັນເອກະລັກ ອີກແຫ່ງໜຶ່ງຂອງເມືອງວັງວຽງ ເນື່ອງຈາກຂົວຂ້າມຈະມີສີສົ້ມສະດຸດຕາ ສ່ວນການເດິນທາງຂຶ້ນໄປຖ້ຳຈັງນັ້ນ ຈະຕ້ອງຍ່າງຂຶ້ນບັນໄດປະມານ 150 ຂັ້ນ ເປັນທາງລາດຊັນ ເມື່ອຍ່າງຂຶ້ນໄປເຖິງກໍ່ຈະພົບກັບຖ້ຳຈັງ ເຊິ່ງແບ່ງເປັນ 2 ທາງແຍກນຳກັນຄື ຖ້ຳຝັ່ງຊ້າຍມື ເມື່ອຍ່າງເຂົ້າໄປກໍ່ຈະໄປເຖິງຈຸດຊົມວິວ ຈາກຈຸດນີ້ສາມາດເບິ່ງເຫັນວິວແມ່ນ້ຳຊອງ ກັບທົ່ງນາສີຂຽວ ກັບ ທຳມະຊາດທີ່ສົມບູນ ຂອງເມືອງວັງວຽງ ໂດຍຈະສາມາດເບິ່ງເຫັນໄດ້ທັງ ເມືອງ ສ່ວນໂຊນຂວາມື ນັກທ່ອງທ່ຽວຈະໄດ້ສຳຜັດກັບ ຫີນງອກຫີນຍ້ອຍໃນຮູບລັກສະນະຕ່າງໆ ພາຍໃນຖ້ຳອາກາດເຢັນສະບາຍ ແລະ ຈະມີນ້ຳໄຫລອອກຈາກປາກຖ້ຳ ສູ່ແມ່ນ້ຳດ້ານລຸ່ມ",
            "\t\t\"ຖໍ້າປູຄຳ\" ຕັ້ງຢູ່ບ້ານນາທອງ ເມືອງວັງວຽງ ແຂວງວຽງຈັນ ຫ່າງຈາກເທດສະບານເມືອງ 3.5 ກິໂລແມັດ. ການເດີນທາງຫາຖໍ້າ ແມ່ນດ້ວຍລົດ ຫຼື ຍ່າງ.  ປາກຖ້ຳນີ້ ຈະຫ່າງຈາກໜ້າດິນ ປະມານ 100 ແມັດ. ຈະມີຮູເຂົ້ານ້ອຍ, ເຂົ້າໄປທາງໃນ ເປັນຜົ້ງກວ້າງຂວາງ, ມີພະນອນ 1 ອົງ, ກ່າວກັນວ່າ ມີປູຄຳ 1 ຄູ່ ຢູ່ໃນຖ້ຳ, ຖ້າໃຜໂຊກດີ ໄປຈະເຫັນປູຄຳນັ້ນ ແລະ ຢູ່ຕີນຜາທາງລຸ້ມ ມີຫ້ວຍນ້ຳໃສເຢັນ ທີ່ໄຫຼອອກມາຈາກຮູຜາ",
            "\t\t\"ຖ້ຳນາງນອນ\" ຕັ້ງຢູ່ບ້ານຜາຕໍ່ ເມືອງກາສີ ແຂວງວຽງຈັນ ຫ່າງຈາກເທດສະບານ ເມືອງກາສີ ປະມານ 23 ກິໂລແມັດ. ແຕ່ກອ່ນ ຖ້ຳນີ້ມີຮູບປັ້ນຜູ້ຍິງນອນ, ມີຄວາມຍາວປະມານ 17 ແມັດ. ຖໍ້ານາງນອນ ປະຈຸບັນ ຍັງມີຫຼາຍສິ່ງຫຼາຍຢ່າງ ທີ່ໂດດເດັ່ນເປັນທີ່ໜ້າສົນໃຈ, ໃນຖ້ຳ ຈະມີທິວທັດທີ່ສວຍງາມ ເປັນເອກະລັກສະເພາະຕົວຂອງຖ້ຳ, ມີນ້ຳໄຫຼລອດຖ້ຳ ແລະ ມີແສງສະຫ່ວາງ ສອດສ່ອງລົງມາ. ນອກນັ້ນ ຍັງມີຊໍ່ຫີນນ້ອຍໆທີ່ສວຍງາມ"
    };
    int [] arrpicVt = {R.drawable.thamchung,R.drawable.poukham,R.drawable.narngnrn};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<HolderVt>() {
            @NonNull
            @Override
            public HolderVt onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_vt,parent,false);
                return new HolderVt(v);
            }

            @Override
            public void onBindViewHolder(@NonNull HolderVt holder, int position) {
                holder.tvnameVt.setText(itmVt[position]);
                holder.imgVt.setImageResource(arrpicVt[position]);
                holder.tvdetailVt.setText(Vtdetail[position]);
            }

            @Override
            public int getItemCount() {
                return itmVt.length;
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
