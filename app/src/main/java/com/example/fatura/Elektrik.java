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

public class Elektrik extends AppCompatActivity {

    private Button istelektrik, ankelektrik, izelektrik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_elektrik);

        istelektrik = findViewById(R.id.btn_giriniz12);
        ankelektrik = findViewById(R.id.btn_giriniz13);
        izelektrik = findViewById(R.id.btn_giriniz14);

        istelektrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Elektrik.this, EOdeme.class);
                startActivity(b);
            }
        });
        ankelektrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Elektrik.this, EOdeme.class);
                startActivity(b);
            }
        });
        izelektrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Elektrik.this, EOdeme.class);
                startActivity(b);
            }
        });
    }
}