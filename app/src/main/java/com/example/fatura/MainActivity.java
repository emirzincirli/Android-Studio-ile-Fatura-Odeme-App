package com.example.fatura;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText kimlik;
    private Button girisyap;
    private TextView txtsonuc;
    private String kimlik1, DK = "28460590824";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        kimlik = (EditText)findViewById(R.id.edt_kimlikgir);
        girisyap = (Button)findViewById(R.id.btn_giriniz1);
        txtsonuc = (TextView)findViewById(R.id.txt_view);

        girisyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_giriniz1(v);
            }
        });
    }

    public void btn_giriniz1(View v) {
        kimlik1 = kimlik.getText().toString();

        if (!TextUtils.isEmpty(kimlik1)) {
            if (kimlik1.equals(DK)) {
                Intent a = new Intent(MainActivity.this, HangiFatura.class);
                a.putExtra("kimlik", kimlik1);
                startActivity(a);
            }else
                txtsonuc.setText("Kimlik vatandaş uyumu yapılamıyor. Bilgilerinizi kontrol ediniz.");

        }
    }

}
