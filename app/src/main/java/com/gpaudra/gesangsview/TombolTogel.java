package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TombolTogel extends AppCompatActivity {
    ToggleButton TBaterai, TUPS, TNET_A, TNET_B;
    TextView St_Bat, St_UPS, St_NET_A, St_NET_B;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tomboltogel);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        TBaterai = findViewById(R.id.tg01);
        TUPS = findViewById(R.id.tg02);
        TNET_A = findViewById(R.id.tg03);
        TNET_B = findViewById(R.id.tg04);
        St_Bat = findViewById(R.id.teks1);
        St_UPS = findViewById(R.id.teks2);
        St_NET_A = findViewById(R.id.teks3);
        St_NET_B = findViewById(R.id.teks4);
        TBaterai.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                St_Bat.setText("Battery is On");
            } else {
                St_Bat.setText("Battery is Off");
            }
        }));
        TUPS.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                St_UPS.setText("UPS is Ready");
            } else {
                St_UPS.setText("UPS is Off");
            }
        }));
        TNET_A.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                St_NET_A.setText("NETWORK A is ON");
            } else {
                St_NET_A.setText("NETWORK A is Off");
            }
        }));
        TNET_B.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                St_NET_B.setText("NETWORK B is ON");
            } else {
                St_NET_B.setText("NETWORK B is Off");
            }
        }));
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}