package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailBukuActivity extends AppCompatActivity {

    TextView txtJudul, txtPenulis, txtHarga;
    String judul, penulis, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);
        txtJudul = findViewById(R.id.txt_judul);
        txtPenulis = findViewById(R.id.txt_penulis);
        txtHarga = findViewById(R.id.txt_harga);

        Intent intent = getIntent();

        judul = intent.getStringExtra("judul");
        penulis = intent.getStringExtra("penulis");
        harga = intent.getStringExtra("harga");

        txtJudul.setText(judul);
        txtPenulis.setText(penulis);
        txtHarga.setText(harga);
    }
}