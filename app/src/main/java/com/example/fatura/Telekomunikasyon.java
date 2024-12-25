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

public class Telekomunikasyon extends AppCompatActivity {

    private Button dsmart, digi, turkcell, vodafone, ttnet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_telekomunikasyon2);

        dsmart = findViewById(R.id.btn_giriniz16);
        digi = findViewById(R.id.btn_giriniz15);
        turkcell = findViewById(R.id.btn_giriniz18);
        vodafone = findViewById(R.id.btn_giriniz19);
        ttnet = findViewById(R.id.btn_giriniz17);

        dsmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Telekomunikasyon.this, TOdeme.class);
                startActivity(b);
            }
        });
        digi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Telekomunikasyon.this, TOdeme.class);
                startActivity(b);
            }
        });
        turkcell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Telekomunikasyon.this, TOdeme.class);
                startActivity(b);
            }
        });
        vodafone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Telekomunikasyon.this, TOdeme.class);
                startActivity(b);
            }
        });
        ttnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Telekomunikasyon.this, TOdeme.class);
                startActivity(b);
            }
        });

    }
}