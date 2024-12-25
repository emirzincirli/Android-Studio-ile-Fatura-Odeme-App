package com.example.fatura;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HangiFatura extends AppCompatActivity {

    private Button dogalgaz, su, elektrik, telekomunikasyon;
    private String gelentc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hangi_fatura);

        dogalgaz = findViewById(R.id.btn_giriniz2);
        su = findViewById(R.id.btn_giriniz4);
        elektrik = findViewById(R.id.btn_giriniz3);
        telekomunikasyon = findViewById(R.id.btn_giriniz5);

        Intent gelenintent = getIntent();
        gelentc = gelenintent.getStringExtra("kimlik");

        dogalgaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(HangiFatura.this, Dogalgaz.class);
                startActivity(b);
            }
        });

        elektrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(HangiFatura.this, Elektrik.class);
                startActivity(b);
            }
        });

        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(HangiFatura.this, Su.class);
                startActivity(b);
            }
        });

        telekomunikasyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(HangiFatura.this, Telekomunikasyon.class);
                startActivity(b);
            }
        });
    }
}
