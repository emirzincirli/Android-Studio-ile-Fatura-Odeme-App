package com.example.fatura;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SOdeme extends AppCompatActivity {

    private EditText edtSozlesmeNo;
    private Button btnOde3;
    private String sozlesmeNo, SN = "123456789";
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sodeme);

        edtSozlesmeNo = findViewById(R.id.edt_text);
        btnOde3 = findViewById(R.id.buton3);

        btnOde3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sozlesmeNo = edtSozlesmeNo.getText().toString();

                if (sozlesmeNo.equals(SN)) {
                    showCustomDialog();
                } else {
                    Toast.makeText(SOdeme.this, "Sözleşme No yanlış", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showCustomDialog() {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.custom_dialog);

        ImageView carpi = dialog.findViewById(R.id.carpi);
        TextView aciklama = dialog.findViewById(R.id.aciklama);
        Button tamam = dialog.findViewById(R.id.tamam);

        aciklama.setText("Faturanız ödenmiştir.");

        carpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        tamam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
