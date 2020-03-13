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

public class Champasak extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<HoldeCps> adpt;
    String[] itmCps ={"ວັດພູຈຳປາສັກ","ນ້ຳຕົກຕາດຄອນພະເພັງ","ນ້ຳຕົກຕາດຟານ"};
    String[] Cpsdetail={
            "\t\t\"ວັດພູຈຳປາສັກ\" ເປັນສະຖານທີ່ສຳຄັນ, ຖືກສ້າງຂຶ້ນໃນລະຫວ່າງສັດຕະວັດທີ 6 ແລະ ຫຼັງຈາກນັ້ນ ກໍໄດ້ມີການເຕີມຕໍ່ຕາມຍຸກສະໄໝ ຈົນມາເຖິງສັດຕະວັດທີ 15. ວັດພູ ເປັນບູຮານສະຖານ ທີ່ຖືກສ້າງຂຶ້ນດ້ວຍການໄດ້ຮັບອິດທິພົນ ທາງດ້ານວັດທະນະທຳ ຈາກຫຼາຍແຫ່ງ ອັນລວມມີທັງສິລະປະຂອມ, ຮິນດູ ແລະ ພຸດ ທີ່ສະແດງອອກເຖິງຮີດຄອງ ແລະ ການເຊື່ອຖືຂອງແຕ່ລະວັດທະນະທຳນັ້ນ. ວັດພູ ເປັນສະຖາປັຕຍະກໍາ ພິເສດແຫ່ງໜຶ່ງ ທີ່ເກົ່າແກ່ ຖືກປ່ອຍປະລະເລີຍໃຫ້ຊຸດໂຊມ ຢູ່ໃນປ່າຮົກເຮື້ອ ມາໄດ້ຫຼາຍຮ້ອຍປີ ຈົນມາເຖິງປີ 1914 ທ່ານ ອອງຣີ ປາກມອງຈີເອ ຈຶ່ງໄດ້ມາຄົ້ນພົບຄືນອີກ. ແຕ່ຫລັງຈາກ ໄດ້ຖ່າຍຮູບເອົາສະຖານທີ່ຕ່າງໆ ຂອງວັດພູໄປແລ້ວ ກໍມິດງຽບໄປ",
            "\t\t\"ນ້ຳຕົກຕາດຄອນພະເພັງ\" ນໍ້າຕົກຕາດຄອນພະເພັງ ແມ່ນໜຶ່ງໃນບັນດາ ນໍ້າຕົກຕາດທີ່ກວ້າງໃຫຍ່ທີ່ສຸດ ແລະ ມີແມ່ນໍ້າຂອງໄຫຼຜ່ານ ເປັນບໍລິເວນກວ້າງເຖິງ 14 ກິໂລແມັດ. ມີນໍ້າຕົກທີ່ສູງ ແລະ ແຮງ ໂດຍສະເພາະໃນລະດູຝົນ ກະແສນໍ້າຈະໄຫຼຄົດລ້ຽວ ແລະ ໂຫດຮ້າຍ. ນໍ້າຕົກຕາດແຫ່ງນີ້ ແມ່ນໄດ້ຖືກສະຖາປະນາໃຫ້ເປັນ ນໍ້າຕົກຕາດທີ່ໃຫຍ່ທີ່ສຸດ ທາງດ້ານບໍລິມາດ ຢູ່ໃນອາຊີຕາເວັນອອກສຽງໃຕ້",
            "\t\t\"ນ້ຳຕົກຕາດຟານ\" ຫຼື ເອີ້ນອີກຊື່ໜຶ່ງວ່າ ນ້ຳຕົກຕາດດົງຫົວສາວ ເປັນນ້ຳຕົກຕາດ ທີ່ສູງທີ່ສຸດຂອງປະເທດລາວ ຊຶ່ງເປັນນ້ຳຕົກຕາດທີ່ມີຄວາມສູງ ປະມານ 200 ແມັດ ບັນຍາກາດໂດຍຮອບ ຂອບນ້ຳຕົກຕາດຟານ ເປັນສະພາບອາກາດຊຸ່ມຊື່ນ ໜາວເຢັນຕະຫລອດປີ ເປັນເສັ້ນທາງສູ່ ເມືອງປາກຊ່ອງ ເມືອງແຫ່ງຂຸນເຂົາ ແລະ ສວນກາເຟ ເປັນພືດເສດຖະກິດ ທີ່ສົ່ງອອກຂອງປະເທດ ນ້ຳຕົກຕາດຟານເປັນນ້ຳຕົກຕາດທີ່ເກີດຈາກການໄຫລມາລວມກັນ ຂອງສາຍນ້ຳ ຂອງ ພູເຂົາ 2 ໜ່ວຍ ຊຶ່ງໄຫຼຕະຫລອດໝົດປີ ອ້ອມຮອບນ້ຳຕົກຕາດຟານ ຈະເຕັມໄປດ້ວຍປ່າໄມ້ ນານາພັນ ອັນສົມບູນ ຂຽວຂະຈີ ອັນສວຍສົດງົດງາມ ຂອງທຳມະຊາດ"
    };
    int [] arrpicCps = {R.drawable.wutpu,R.drawable.kpp,R.drawable.tardfarn};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cps);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<HoldeCps>() {
            @NonNull
            @Override
            public HoldeCps onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_cps,parent,false);
                return new HoldeCps(v);
            }

            @Override
            public void onBindViewHolder(@NonNull HoldeCps holder, int position) {
                holder.tvnameC.setText(itmCps[position]);
                holder.imgC.setImageResource(arrpicCps[position]);
                holder.tvdetailC.setText(Cpsdetail[position]);
            }

            @Override
            public int getItemCount() {
                return itmCps.length;
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
