package com.example.projectwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private CardView btn1, btn2, btn3, btn4, btn5, btn6;
    private TextView total;
    private Button button1, button2, button3, button4, button5, button6, totalid;
    private int tothar,totam=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1 = (CardView) findViewById(R.id.btn1);
        btn2 = (CardView) findViewById(R.id.btn2);
        btn3 = (CardView) findViewById(R.id.btn3);
        btn4 = (CardView) findViewById(R.id.btn4);
        btn5 = (CardView) findViewById(R.id.btn5);
        btn6 = (CardView) findViewById(R.id.btn6);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        totalid = findViewById(R.id.totalid);

        total= (TextView) findViewById(R.id.totalid);

        totalid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Pembayaran.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PaketPilihan.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PaketEksklusif.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PaketBisnis2.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PaketBisnis1.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PaketEkonomi2.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PaketEkonomi1.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tothar=300000;
                totam+=tothar;
                total.setText("Total : Rp."+Integer.toString(totam));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tothar=350000;
                totam+=tothar;;
                total.setText("Total : Rp."+Integer.toString(totam));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tothar=450000;
                totam+=tothar;
                total.setText("Total : Rp."+Integer.toString(totam));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tothar=500000;
                totam+=tothar;
                total.setText("Total : Rp."+Integer.toString(totam));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tothar=600000;
                totam+=tothar;
                total.setText("Total : Rp."+Integer.toString(totam));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tothar=0;
                totam+=tothar;
                total.setText("Total : Rp."+Integer.toString(totam));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.callcenter_id:
                Intent intent = new Intent(HomeActivity.this, CallCenter.class);
                startActivity(intent);
                Toast.makeText(this, "Call Center", Toast.LENGTH_SHORT).show();
                break;
            case R.id.customerservice_id:
                Intent intent1 = new Intent(HomeActivity.this, CustomerService.class);
                startActivity(intent1);
                Toast.makeText(this, "SMS Center", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lokasi_id:
                Intent intent2 = new Intent(HomeActivity.this, Lokasi.class);
                startActivity(intent2);
                Toast.makeText(this, "Lokasi/Maps", Toast.LENGTH_SHORT).show();
                break;
            case R.id.updateuserpassword_id:
                Intent intent3 = new Intent(HomeActivity.this, UserUpdate.class);
                startActivity(intent3);
                Toast.makeText(this, "Update User & Password", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}