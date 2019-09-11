package com.example.waktu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.
        OnClickListener {
    private EditText edtJam;
    private Button edtHitung;
    private TextView edtHasil,edtHasil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edtJam = (EditText) findViewById(R.id.edt_jam);
        edtHitung = (Button) findViewById(R.id.edt_hitung);
        edtHasil = (TextView) findViewById(R.id.edt_hasil);
        edtHasil2 = (TextView) findViewById(R.id.edt_hasil2);
        edtHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.edt_hitung) {
            String detik = edtJam.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(detik)) {
                isEmptyFields = true;
                edtJam.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                double j = Double.parseDouble(detik);
                double konversi = j * 60;
                edtHasil.setText(String.valueOf(konversi));
            }
            if (!isEmptyFields) {
                double j = Double.parseDouble(detik);
                double konversi = j * 3600;
                edtHasil2.setText(String.valueOf(konversi));
            }
        }
    }
}
