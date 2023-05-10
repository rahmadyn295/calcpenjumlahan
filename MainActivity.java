package com.latihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tvHASIL);
        EditText et1 = findViewById(R.id.editText5);
        EditText et2 = findViewById(R.id.editText6);
        Button bt1 = findViewById(R.id.btJUMLAH);
2222

        bt1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah = "";
                if (view.getId() == bt1.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 + x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                        }
                    }
                });
            }
        }

