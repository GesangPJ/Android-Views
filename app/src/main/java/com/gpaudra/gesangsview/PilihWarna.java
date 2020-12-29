package com.gpaudra.gesangsview;

import android.annotation.SuppressLint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



public class PilihWarna extends AppCompatActivity {
    CheckBox cekblue,ceksilver,cekblack,cekyellow,cekred;

    Button Tombol;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihwarna);
        getSupportActionBar().setSubtitle("Color Changer");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



        cekblue = (CheckBox) findViewById(R.id.cek01);
        ceksilver = (CheckBox) findViewById(R.id.cek02);
        cekblack = (CheckBox) findViewById(R.id.cek03);
        cekyellow = (CheckBox) findViewById(R.id.cek04);
        cekred = (CheckBox) findViewById(R.id.cek05);
        Tombol = (Button) findViewById(R.id.gantiwarna);

        cekblue.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                ceksilver.setChecked(false);
                cekblack.setChecked(false);
                cekyellow.setChecked(false);
                cekred.setChecked(false);
            }
        });
        ceksilver.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekblue.setChecked(false);
                cekblack.setChecked(false);
                cekyellow.setChecked(false);
                cekred.setChecked(false);
            }
        });
        cekblack.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekblue.setChecked(false);
                ceksilver.setChecked(false);
                cekyellow.setChecked(false);
                cekred.setChecked(false);
            }
        });
        cekyellow.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekblue.setChecked(false);
                ceksilver.setChecked(false);
                cekblack.setChecked(false);
                cekred.setChecked(false);
            }
        });
        cekred.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekblue.setChecked(false);
                ceksilver.setChecked(false);
                cekblack.setChecked(false);
                cekyellow.setChecked(false);
            }
        });


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
    public void GantiWarna(View view){

        if(cekblue.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }
        else if(ceksilver.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#8c8c8f"));
        }
        else if(cekblack.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        }
        else if(cekyellow.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }
        else if(cekred.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        }
        else{
            Toast.makeText(this,"Please Choose the Color", Toast.LENGTH_SHORT).show();
        }


    }
}