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

public class Dogalgaz extends AppCompatActivity {

    private Button istdogalgaz, ankdogalgaz, izdogalgaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dogalgaz);

        istdogalgaz = findViewById(R.id.btn_giriniz6);
        ankdogalgaz = findViewById(R.id.btn_giriniz7);
        izdogalgaz = findViewById(R.id.btn_giriniz8);

        istdogalgaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Dogalgaz.this, DOdeme.class);
                startActivity(b);
            }
        });
        ankdogalgaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Dogalgaz.this, DOdeme.class);
                startActivity(b);
            }
        });
        izdogalgaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Dogalgaz.this, DOdeme.class);
                startActivity(b);
            }
        });
    }
}