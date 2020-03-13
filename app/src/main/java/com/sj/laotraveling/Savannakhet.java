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

public class Savannakhet extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<HolderSvk> adpt;
    String[] itmSvk ={"ພະທາດອີງຮັງ","ຫໍໄຕປີດົກ","ຜາສາດເຮືອນຫີນ"};
    String[] Svkdetail={
            "\t\t\"ພະທາດອີງຮັງ\"  ຫຼື ຄົນທົ່ວໄປມັກຮ້ອງວ່າ ອິນຮັງ ເປັນປູຊະນິຍະສະຖານ ເກົ່າແກ່ທີ່ສັກສິດ ແລະ ສຳຄັນ ເປັນທີ່ເຊີດໜ້າຊູຕາ ທາງວັດທະນະທຳ ຂອງແຂວງສະຫວັນນະເຂດ ພຣະທາດໜ່ວຍນີ້ ຖືກສະຫຼັກດ້ວຍລວດລາຍ ສິລະປະກຳສະໄໝບູຮານ ແລະ ຮັກສາໄວ້ ໂດຍບໍ່ຖືກທຳລາຍຈາກອຳນາດ ຫຼື ອິດທິພົນໃດຈັກເທື່ອ ນອກຈາກການເວລາເທົ່ານັ້ນ ແຕ່ກໍຖືກປະຕິສັງຂອນມາແລ້ວຫຼາຍຄັ້ງ",
            "\t\t\"ຫໍໄຕປີດົກ\" ຫຼັງນີ້ໄດ້ກໍ່ສ້າງມາແຕ່ສັດຕະວັດທີ 17 ເປັນຕົ້ນມາ ເຊິ່ງແມ່ນຍາທ່ານ ຫຼັກຄຳພາ ເປັນຜູູ້ນຳພາສ້າງ ຕໍ່ມາກໍ່ໄດ້ປະຕິສັງຂອນຄືນໃໝ່ ໃນສັດຕະວັດທີ 19 ນັບແຕ່ເວລານັ້ນເປັນຕົ້ນມາ ກໍ່ໄດ້ມີຍາທ່ານຂຽວ, ຍາທ່ານພຸ່ນ, ຍາທ່ານຈວງ, ຍາທ່ານນວນ, ຍາທ່ານພົມມາ ໄດ້ເປັນຜູ້ອຸປະຖຳປົກປັກຮັກສາສືບຕໍ່ກັນມາຕາມລຳດັບມາໃນປີ ຄ.ສ 1990 - 2001. ໂຄງການປົກປັກຮັກສາໜັງສືຜູກໃບລານລາວ ກະຊວງຖະແຫຼງຂ່າວ ແລະ ວັດທະນະທຳ ໂດຍໄດ້ຮັບການສະໜັບສະໜູນ ຈາກມູນນິຖິ ໂຕໂຍຕ້າ ຂອງປະເທດຍີ່ປຸ່ນ ແລະ ລັດຖະບານສະຫະພັນເຢຍລະມັນ ຮ່ວມກັບພະແນກຖະແຫຼງຂ່າວ - ວັດທະນະທຳ ແຂວງສະຫວັນນະເຂດ ແລະ ຫ້ອງການຖະແຫຼງຂ່າວ - ວັດທະນະທໍາເມືອງຈຳພອນ ໄດ້ລົງສໍາຫຼວດຂຶ້ນບັນຊີຕົວຈິງ ເຊິ່ງສາມາດແຍກ ແລະ ຈັດລຳດັບໄດ້ດັ່ງນີ້: ໜັງສືຜູກໃບລານທັງໝັດມີ 219 ເລື່ອງ, ມີ 326 ມັດ, ມີ 2,391 ຜູກ",
            "\t\t\"ຜາສາດເຮືອນຫີນ\" ຕັ້ງຢູ່ ບ້ານເຮືອນຫີນ, ເມືອງໄຊພູທອງ, ໄລຍະຫ່າງຈາກຕົວເມືອງ ປະມານ 10 ກິໂລແມັດ. ເຮືອນຫີນ ແມ່ນຮ່ອງຮອຍທາງດ້ານປະຫວັດສາດ ເຊິ່ງສ້າງຂຶ້ນໃນສະໄໝອານາຈັກສີໂຄດຕະບູນ ເຊິ່ງເປັນອານາຈັກທີ່ໜ້າເກງຂາມຂອງອານາຈັກໃກ້ຄຽງ. ໃນປີ ຄ.ສ 557 ນັ້ນ ໄດ້ມີຂຸນອັງຄະຣາດ ແລະ ອົມມະຣາດ ສອງອ້າຍນ້ອງ ນໍາພາສ້າງປະສາດຫີນ ຂຶ້ນເພື່ອເປັນທີ່ເຄົາລົບ ກາບໄຫວ້ຂອງສາສະໜາພາມ"
    };
    int [] arrpicSvk = {R.drawable.inghung,R.drawable.htpd,R.drawable.pshh};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_svk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<HolderSvk>() {
            @NonNull
            @Override
            public HolderSvk onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_svk,parent,false);
                return new HolderSvk(v);
            }

            @Override
            public void onBindViewHolder(@NonNull HolderSvk holder, int position) {
                holder.tvnameS.setText(itmSvk[position]);
                holder.imgS.setImageResource(arrpicSvk[position]);
                holder.tvdetailS.setText(Svkdetail[position]);
            }

            @Override
            public int getItemCount() {
                return itmSvk.length;
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
