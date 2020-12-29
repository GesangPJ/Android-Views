package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

public class TombolSwitch extends AppCompatActivity {
    SwitchCompat swBaterai, swAPU, swEng1, swEng2, swEng3, swEng4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tombolswitch);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        swBaterai = findViewById(R.id.sw1);
        swAPU = findViewById(R.id.sw2);
        swEng1 = findViewById(R.id.sw3);
        swEng2 = findViewById(R.id.sw4);
        swEng3 = findViewById(R.id.sw5);
        swEng4 = findViewById(R.id.sw6);

        swBaterai.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TombolSwitch.this, "Turning On Battery...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TombolSwitch.this, "Turning Off Battery...", Toast.LENGTH_SHORT).show();
                }

            }
        }));

        swAPU.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TombolSwitch.this, "Starting APU...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TombolSwitch.this, "Shutting down APU...", Toast.LENGTH_SHORT).show();

                }

            }
        }));

        swEng1.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TombolSwitch.this, "Starting Engine 1...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TombolSwitch.this, "Shutting down Engine 1...", Toast.LENGTH_SHORT).show();
                }

            }
        }));

        swEng2.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TombolSwitch.this, "Starting Engine 2...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TombolSwitch.this, "Shutting down Engine 2...", Toast.LENGTH_SHORT).show();
                }

            }
        }));

        swEng3.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TombolSwitch.this, "Starting Engine 3...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TombolSwitch.this, "Shutting down Engine 3...", Toast.LENGTH_SHORT).show();

                }

            }
        }));

        swEng4.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TombolSwitch.this, "Starting Engine 4...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(TombolSwitch.this, "Shutting down Engine 4...", Toast.LENGTH_SHORT).show();

                }

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