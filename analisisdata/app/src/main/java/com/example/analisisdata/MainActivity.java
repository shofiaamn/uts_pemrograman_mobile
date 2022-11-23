package com.example.analisisdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_tujuan = findViewById(R.id.tujuan);
        Button btn_pemantik = findViewById(R.id.pemantik);
        Button btn_konsep = findViewById(R.id.konsep);
        Button btn_apersepsi = findViewById(R.id.apersepsi);
        Button btn_kunci = findViewById(R.id.kunci);
        Button btn_materi = findViewById(R.id.materi);
        Button btn_tentang = findViewById(R.id.tentang);

        btn_tujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_apersepsi = new Intent(MainActivity.this, tujuanpembelajaran.class);
                startActivity(intent_apersepsi);
            }
        });
        btn_pemantik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_katakunci = new Intent(MainActivity.this, pemantik.class);
                startActivity(intent_katakunci);
            }
        });
        btn_konsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_materi = new Intent(MainActivity.this, petakonsep.class);
                startActivity(intent_materi);
            }
        });
        btn_apersepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_pemantik = new Intent(MainActivity.this, apersepsi.class);
                startActivity(intent_pemantik);
            }
        });
        btn_kunci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_petakonsep = new Intent(MainActivity.this, katakunci.class);
                startActivity(intent_petakonsep);
            }
        });
        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent_tentangaplikasi = new Intent(MainActivity.this, materi.class);
                startActivity(intent_tentangaplikasi);
            }
        });
        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_tujuanpembelajaran = new Intent(MainActivity.this, tentangaplikasi.class);
                startActivity(intent_tujuanpembelajaran);
            }
        });
    }
}