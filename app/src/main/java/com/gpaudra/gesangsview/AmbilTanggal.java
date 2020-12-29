package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class AmbilTanggal extends AppCompatActivity {
    DatePicker Tanggalan;
    TextView Muncul;
    Button Ambil;

    int Bulan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambiltanggal);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Tanggalan = findViewById(R.id.Tanggalan);
        Muncul = findViewById(R.id.muncultanggal);
        Ambil = findViewById(R.id.gantitanggal);

        Muncul.setText(HariIni());




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
    public String HariIni(){
        StringBuilder mHariIni = new StringBuilder();
        Bulan = Tanggalan.getMonth() +1;
        mHariIni.append("Date : ").append(Bulan).append("/").append(Tanggalan.getDayOfMonth()).append("/").append(Tanggalan.getYear());
        return mHariIni.toString();
    }
    public void GantiTanggal(View view){
        Muncul.setText(HariIni());

    }
}