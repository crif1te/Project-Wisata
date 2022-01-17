package com.example.projectwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pembayaran extends AppCompatActivity {

    EditText etNamaPelanggan, etNamaPaket, etJmlPemesanan, etHarga, etJmlUang;
    TextView tvNamaPembeli, tvNamaPaket, tvJmlPemesanan, tvHarga, tvUangBayar,
            tvTotal, tvKembalian, tvBonus, tvKeterangan;
    Button btnProses, btnHapus, btnKeluar;

    String namaPelanggan, namaPaket, jumlahPemesanan, hargaPaket, uangBayar;
    double jmlPemesanan, hrgPaket, uangByr, total, kembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        getSupportActionBar().setTitle("Aplikasi Penjualan");

        //EditText
        etNamaPelanggan = findViewById(R.id.etNamaPelanggan);
        etNamaPaket = findViewById(R.id.etNamaPaket);
        etJmlPemesanan = findViewById(R.id.etJmlPemesanan);
        etHarga = findViewById(R.id.etHarga);
        etJmlUang = findViewById(R.id.etJmlUang);

        //TextView
        tvNamaPembeli = findViewById(R.id.tvNamaPembeli);
        tvNamaPaket = findViewById(R.id.tvNamaPaket);
        tvJmlPemesanan = findViewById(R.id.tvJmlPemesanan);
        tvHarga = findViewById(R.id.tvHarga);
        tvUangBayar = findViewById(R.id.tvUangBayar);
        tvTotal = findViewById(R.id.tvTotal);
        tvKembalian = findViewById(R.id.tvKembalian);
        tvBonus = findViewById(R.id.tvBonus);
        tvKeterangan = findViewById(R.id.tvKeterangan);

        //Button
        btnProses = findViewById(R.id.btnProses);
        btnHapus = findViewById(R.id.btnHapus);
        btnKeluar = findViewById(R.id.btnKeluar);

        //Proses
        btnProses.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                namaPelanggan = etNamaPelanggan.getText().toString().trim();
                namaPaket = etNamaPaket.getText().toString().trim();
                jumlahPemesanan = etJmlPemesanan.getText().toString().trim();
                hargaPaket = etHarga.getText().toString().trim();
                uangBayar = etJmlUang.getText().toString().trim();

                jmlPemesanan = Double.parseDouble(jumlahPemesanan);
                hrgPaket = Double.parseDouble(hargaPaket);
                uangByr = Double.parseDouble(uangBayar);
                total = (jmlPemesanan * hrgPaket);

                tvNamaPembeli.setText("Nama Pembeli : " + namaPelanggan);
                tvNamaPaket.setText("Nama Paket : " + namaPaket);
                tvJmlPemesanan.setText("Jumlah Pemesanan : " + jumlahPemesanan);
                tvHarga.setText("Harga Paket : " + hargaPaket);
                tvUangBayar.setText("Uang bayar : " + uangBayar);

                tvTotal.setText("Total Pemesanan " + total);
                if (total >= 1000000) {
                    tvBonus.setText("Bonus : Diskon 20% Upgrade Kelas/Paket");
                } else if (total >= 750000) {
                    tvBonus.setText("Bonus : Ekstra Sarapan");
                } else if (total >= 500000) {
                    tvBonus.setText("Bonus : Drink & Snacks");
                } else {
                    tvBonus.setText("Bonus : Tidak ada bonus!");
                }

                kembalian = (uangByr - total);
                if (uangByr < total) {
                    tvKeterangan.setText("Keterangan : Uang bayar kurang Rp. " + (-kembalian));
                    tvKembalian.setText("Uang Kembalian : Rp. 0");
                } else {
                    tvKeterangan.setText("Keterangan : Tunggu kembalian");
                    tvKembalian.setText("Uang Kembalian : Rp. " + kembalian);
                }

            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNamaPembeli.setText("");
                tvNamaPaket.setText("");
                tvJmlPemesanan.setText("");
                tvHarga.setText("");
                tvUangBayar.setText("");
                tvKembalian.setText("");
                tvKeterangan.setText("");
                tvBonus.setText("");
                tvTotal.setText("");

                Toast.makeText(getApplicationContext(), "Data sudah dihapus", Toast.LENGTH_SHORT).show();
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });

    }
}