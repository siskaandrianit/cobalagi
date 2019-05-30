package com.example.homeslide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InfoKue extends AppCompatActivity {
    List<Info> productList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_info_kue);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager (this));
        productList = new ArrayList<> ();
    productList.add(
            new Info(
                    1,
                    getResources().getString(R.string.judul_info1)
                    ,
                    getResources().getString(R.string.isi_info1),
                    R.drawable.bikaambon));
        productList.add(
                new Info(
                        2,
                        getResources().getString(R.string.judul_info2),
                        getResources().getString(R.string.isi_info2),
                        R.drawable.bakpia));
        productList.add(
                new Info(

                        3,
                        getResources().getString(R.string.judul_info3),
                        getResources().getString(R.string.isi_info3),
                        R.drawable.bolugulung));
        productList.add(
                new Info(
                        4,
                        getResources().getString(R.string.judul_info4),
                        getResources().getString(R.string.isi_info4),
                        R.drawable.lemang));
        productList.add(
                new Info(
                        5,
                        getResources().getString(R.string.judul_info5),
                        getResources().getString(R.string.isi_info5),
                        R.drawable.pinyaram));
        productList.add(
                new Info(
                        6,
                        getResources().getString(R.string.judul_info6),
                        getResources().getString(R.string.isi_info6),
                        R.drawable.putri_selat));
        productList.add(
                new Info(
                        7,
                        getResources().getString(R.string.judul_info7),
                        getResources().getString(R.string.isi_info7),
                        R.drawable.pinende));
        productList.add(
                new Info(
                        8,
                        getResources().getString(R.string.judul_info8),
                        getResources().getString(R.string.isi_info8),
                        R.drawable.kuemanco));
        productList.add(
                new Info(
                        9,
                        getResources().getString(R.string.judul_info9),
                        getResources().getString(R.string.isi_info9),
                        R.drawable.piesusu));
        productList.add(
                new Info(
                        10,
                        getResources().getString(R.string.judul_info10),
                        getResources().getString(R.string.isi_info10),
                        R.drawable.lapistals));
InfoAdapter adapter = new InfoAdapter (this,productList);
        recyclerView.setAdapter(adapter);


    }
}
