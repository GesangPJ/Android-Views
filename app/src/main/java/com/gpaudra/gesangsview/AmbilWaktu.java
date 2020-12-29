package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class AmbilWaktu extends AppCompatActivity {
    TimePicker IniWaktu;
    TextView LihatWaktu;
    Button Tampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambilwaktu);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        IniWaktu = findViewById(R.id.Waktuh);
        LihatWaktu = findViewById(R.id.liatjam);
        Tampilkan = findViewById(R.id.ambiljam);

        IniWaktu.setIs24HourView(true);
        LihatWaktu.setText(JamSekarang());

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
    public String JamSekarang(){
        return "Time: " + IniWaktu.getCurrentHour() + ":" + IniWaktu.getCurrentMinute();
    }
    public void AturJam(View view){
        LihatWaktu.setText(JamSekarang());

    }
}