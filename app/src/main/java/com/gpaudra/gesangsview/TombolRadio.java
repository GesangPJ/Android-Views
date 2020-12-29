package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TombolRadio extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup RadG;
    RadioButton PitonR, JavaR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tombolradio);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        RadG = (RadioGroup) findViewById(R.id.grad);
        PitonR = (RadioButton) findViewById(R.id.pitonr);
        JavaR = (RadioButton) findViewById(R.id.javar);
        RadG.setOnCheckedChangeListener(this);

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

    public void onCheckedChanged(RadioGroup group, int ceklis){
        if(ceklis==R.id.pitonr){
            Toast.makeText(this, "Good Choice!", Toast.LENGTH_SHORT).show();
        }
        if(ceklis==R.id.javar){
            Toast.makeText(this, "Bad Choice!", Toast.LENGTH_SHORT).show();
        }

    }
}