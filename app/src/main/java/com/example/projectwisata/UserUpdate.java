package com.example.projectwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserUpdate extends AppCompatActivity {
    EditText username, password, nama;
    Button cancel, Update;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_update);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        nama = findViewById(R.id.nama);
        cancel = findViewById(R.id.cancel);
        Update = findViewById(R.id.update);
        preferences = getSharedPreferences("UserInfo", 0);
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameValue = username.getText().toString();
                String passwordValue = password.getText().toString();
                String namaValue = nama.getText().toString();
                if ((usernameValue.length()>1)){
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username", usernameValue);
                    editor.putString("password", passwordValue);
                    editor.putString("nama", namaValue);
                    editor.apply();
                    Toast.makeText( UserUpdate.this, "User updated!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(UserUpdate.this,MainActivity.class);
                    startActivity(intent);
                }
                else {

                    Toast.makeText(UserUpdate.this, "Ada form yang kosong/belum di isi",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserUpdate.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void back(){
        Intent p=new Intent(UserUpdate.this,MainActivity.class);
        startActivity(p);
    }
}