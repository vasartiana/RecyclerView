package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Buku> bukus = new ArrayList<>();
    private BukuAdapter bukuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        bukuAdapter = new BukuAdapter(this, bukus);
        recyclerView = findViewById(R.id.rv_buku);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(bukuAdapter);
    }

    private void addData(){
        bukus.add(new Buku("Hujan", "Tere Liye", "Rp89.000"));
        bukus.add(new Buku("Rapijali 2", "Dee Lestari", "Rp118.500"));
        bukus.add(new Buku("Jika Kita Tak Pernah Jadi Apa-Apa", "Alvin Syahrin", "Rp83.700"));
        bukus.add(new Buku("Your Name", "Shinkai Makoto", "Rp79.920"));
        bukus.add(new Buku("Komik Jujutsu Kaisen", "Gege Akutami", "Rp32.000"));
        bukus.add(new Buku("Filosofi Teras", "Henry Manampiring", "Rp78.400"));
        bukus.add(new Buku("The Psychology of Money", "Morgan Housel", "Rp75.000"));
        bukus.add(new Buku("Sebuah Seni Untuk Bersikap Bodo Amat", "Mark Manson", "Rp66.300"));
        bukus.add(new Buku("Bicara Itu Ada Seninya", "Oh Su Hyang", "Rp72.000"));
        bukus.add(new Buku("How to Win Friends & Influence People", "Dale Carnegie", "Rp98.000"));
    }
}