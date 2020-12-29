package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.Toast;

public class CariBar extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar BarCari;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caribar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        BarCari = findViewById(R.id.seekBar);
        BarCari.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this);

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

    @Override
    public void onProgressChanged(SeekBar BarCari, int progress, boolean fromUser) {
        Toast.makeText(getApplicationContext(),"Processing: "+progress, Toast.LENGTH_SHORT).show();
    }

    public void onStartTrackingTouch(SeekBar BarCari) {
        Toast.makeText(getApplicationContext(),"SeekBar Started!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar BarCari) {
        Toast.makeText(getApplicationContext(),"SeekBar Stopped", Toast.LENGTH_SHORT).show();
    }


}