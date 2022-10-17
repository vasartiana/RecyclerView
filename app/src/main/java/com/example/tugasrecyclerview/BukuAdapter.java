package com.example.tugasrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.ViewHolder> {

    private final ArrayList<Buku> values;
    private final LayoutInflater inflater;

    public BukuAdapter(Context context, ArrayList<Buku> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_buku, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Buku buku = values.get(position);
        holder.txtJudul.setText(buku.judul);
        holder.txtPenulis.setText(buku.penulis);
        holder.txtHarga.setText(buku.harga);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailBukuActivity.class);
                intent.putExtra("judul", buku.judul);
                intent.putExtra("penulis", buku.penulis);
                intent.putExtra("harga", buku.harga);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtJudul, txtPenulis, txtHarga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtJudul = itemView.findViewById(R.id.txt_judul);
            txtPenulis = itemView.findViewById(R.id.txt_penulis);
            txtHarga = itemView.findViewById(R.id.txt_harga);
        }
    }
}
