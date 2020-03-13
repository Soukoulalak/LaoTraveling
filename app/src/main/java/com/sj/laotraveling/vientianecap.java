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

public class vientianecap extends AppCompatActivity {
    RecyclerView crv;
    RecyclerView.Adapter<HolderVtCap> adpt;
    String[] itmVtc ={"ປະຕູໄຊ","ຫໍພະແກ້ວ","ທາດຫຼວງ"};
    String[] Vtcdetail={
            "\t\t\"ປະຕູໄຊ\" ຫຼື ອານຸສາວະລີ ແມ່ນສິ່ງກໍສ້າງເພື່ອເປັນອານຸສອນ ແກ່ການປະກາດເອກກະລາດ ຈາກການປົກຄອງຂອງປະເທດຝຣັ່ງ. ຮູບຊົງແມ່ນຮຽນແບບ ປະຕູໄຊເມືອງປາຣີ (Arc de Triomphe) ແຕ່ຕົບແຕ່ງໂດຍ ສິລະປະພື້ນເມືອງລາວ. ຖືກສ້າງຂຶ້ນເມື່ອປີ 1962 ທີ່ໃຈກາງເມືອງວຽງຈັນ ແລະ ລະຫວ່າງກາງຖະໜົນລ້ານຊ້າງ, ແຕ່ຍ້ອນໄພສົງຄາມກາງເມືອງ ການກໍ່ສ້າງຈຶ່ງບໍ່ສໍາເລັດສົມບູນ ແລະ ຖືກປະໄວຈົນເຖິງປັດຈຸບັນ",
            "\t\t\"ຫໍພະແກ້ວ\" ຕັ້ງຢູ່ກົງກັນຂ້າມກັບ ວັດສີສະເກດ ເຊິ່ງແຕ່ກ່ອນເຄີຍເປັນວັດທີ່ສຳຄັນ ໃຊ້ໃນການປະຕິບັດພິທີກຳຕ່າງໆ ຂອງບ້ານເມືອງໃນອາດີດຕະການ. ວັດນີ້ ສ້າງຂື້ນໃນປີ ຄ.ສ 1565 ສຳຫຼັບເປັນບ່ອນປະດິດສະຖານ ຂອງພະແກ້ວມໍຣະກົດ, ໂດຍພະເຈົ້າໄຊເຊດຖາທິຣາດ ໃນເວລາທີ່ໄດ້ຕັດສິນໃຈ ຍົກຍ້າຍນະຄອນຫຼວງເດີມຂອງປະເທດ ແມ່ນຢູ່ຫຼວງພະບາງ ມາຕັ້ງຢູ່ວຽງຈັນ, ພາຍຫຼັງການສິ້ນພະຊົນຂອງ ພະເຈົ້າໂພທິຊາຣາດ ຜູ້ເປັນບິດາ. ປະຈຸບັນວັດນີ້ກາຍເປັນຫໍພິທິຕະພັນ. ສ່ວນອົງພະແກ້ວມໍຣະກົດ ປະຈຸບັນແມ່ນຖືກເອົາໄປປະດິດສະຖານ ຢູ່ທີ່ວັດພະສີຣັດຕະນະສາດສາສະດາຣາມ ຫຼື ວັດພະແກ້ວ ທີ່ ບາງກອກ ປະເທດໄທ",
            "\t\t\"ທາດຫຼວງ\" ຕັ້ງຢູ່ສົ້ນສຸດທາງທິດຕາເວັນອອກ ຂອງຖະໜົນທາດຫຼວງ ບ້ານ ທາດຫຼວງ ເມືອງໄຊເຊດຖາ ນະຄອນຫຼວງວຽງຈັນ ເປັນປູຊະນິຍະສະຖານບູຮານ ອັນເປັນສັນຍະລັກຂອງປະເທດລາວ ແລະ ເປັນມິ່ງຂວັນຂອງປະຊາຊົນລາວຊາວພຸດ ທັງສອງຟາກຝັ່ງແມ່ນ້ຳຂອງ ທາດຫຼວງສູງ 45 ແມັດ ມີໃບສີມາອ້ອມ 228 ໃບ ມີບໍຣິວານ(ທາດນ້ອຍ) 30ອົງ ອ້ອມຮອບ ເອິ້ນວ່າປາຣະມີສາມສິບທັດ ຕີນທາດແຕ່ດ້ານຕາເວັນອອກຫາດ້ານຕາເວັນ ຕົກຍາວ 69 ແມັດ ແຕ່ດ້ານເໜືອເຖິງດ້ານໃຕ້ຍາວ 68 ແມັດ ແລະ ກົມມະລຽນດ້ານນອກອ້ອມທາດຫຼວງແຕ່ລະດ້ານຍາວ 91.75 ແມັດ."
    };
    int [] arrpicVtc = {R.drawable.patuxay,R.drawable.hpk,R.drawable.tl};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vientianecap);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        crv=new RecyclerView(this);
        crv.setLayoutManager(new LinearLayoutManager(this));
        adpt=new RecyclerView.Adapter<HolderVtCap>() {
            @NonNull
            @Override
            public HolderVtCap onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v= LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_vientianecap,parent,false);
                return new HolderVtCap(v);
            }

            @Override
            public void onBindViewHolder(@NonNull HolderVtCap holder, int position) {
                holder.tvnameVtc.setText(itmVtc[position]);
                holder.imgVtc.setImageResource(arrpicVtc[position]);
                holder.tvdetailVtc.setText(Vtcdetail[position]);
            }

            @Override
            public int getItemCount() {
                return itmVtc.length;
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
