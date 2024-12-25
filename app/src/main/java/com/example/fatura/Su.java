package com.example.fatura;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Su extends AppCompatActivity {

    private Button istsu, anksu, izsu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_su2);

        istsu = findViewById(R.id.btn_giriniz9);
        anksu = findViewById(R.id.btn_giriniz10);
        izsu = findViewById(R.id.btn_giriniz11);

        istsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Su.this, SOdeme.class);
                startActivity(b);
            }
        });
        anksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Su.this, SOdeme.class);
                startActivity(b);
            }
        });
        izsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Su.this, SOdeme.class);
                startActivity(b);
            }
        });

    }
}