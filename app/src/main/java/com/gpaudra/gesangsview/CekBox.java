package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CekBox extends AppCompatActivity {



    CheckBox cekpython,cekdeeplearning,cekchash,cekjava,cekkotlin,cekruby,cekC;
    Button selesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cekbox);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        cekpython = (CheckBox) findViewById(R.id.cek1);
        cekdeeplearning = (CheckBox) findViewById(R.id.cek2);
        cekchash = (CheckBox) findViewById(R.id.cek3);
        cekjava = (CheckBox) findViewById(R.id.cek4);
        cekkotlin = (CheckBox) findViewById(R.id.cek5);
        cekruby = (CheckBox) findViewById(R.id.cek6);
        cekC = (CheckBox) findViewById(R.id.cek7);
        selesai = (Button) findViewById(R.id.selesai);

        cekpython.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekdeeplearning.setChecked(false);
                cekC.setChecked(false);
                cekchash.setChecked(false);
                cekjava.setChecked(false);
                cekkotlin.setChecked(false);
                cekruby.setChecked(false);
            }
        });
        cekdeeplearning.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekpython.setChecked(false);
                cekC.setChecked(false);
                cekchash.setChecked(false);
                cekjava.setChecked(false);
                cekkotlin.setChecked(false);
                cekruby.setChecked(false);
            }
        });
        cekchash.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekpython.setChecked(false);
                cekC.setChecked(false);
                cekdeeplearning.setChecked(false);
                cekjava.setChecked(false);
                cekkotlin.setChecked(false);
                cekruby.setChecked(false);
            }
        });
        cekjava.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekpython.setChecked(false);
                cekC.setChecked(false);
                cekchash.setChecked(false);
                cekdeeplearning.setChecked(false);
                cekkotlin.setChecked(false);
                cekruby.setChecked(false);
            }
        });
        cekkotlin.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekpython.setChecked(false);
                cekC.setChecked(false);
                cekchash.setChecked(false);
                cekjava.setChecked(false);
                cekdeeplearning.setChecked(false);
                cekruby.setChecked(false);
            }
        });
        cekruby.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekpython.setChecked(false);
                cekC.setChecked(false);
                cekchash.setChecked(false);
                cekjava.setChecked(false);
                cekkotlin.setChecked(false);
                cekdeeplearning.setChecked(false);
            }
        });
        cekC.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                cekpython.setChecked(false);
                cekdeeplearning.setChecked(false);
                cekchash.setChecked(false);
                cekjava.setChecked(false);
                cekkotlin.setChecked(false);
                cekruby.setChecked(false);
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

    public void Proses(View view){
        String X="";

        if(cekpython.isChecked()){
            X+="Python";

        }
        if(cekdeeplearning.isChecked()){
            X+="DeepLearning";

        }
        if(cekchash.isChecked()){
            X+="C#";

        }
        if(cekjava.isChecked()){
            X+="Java";

        }
        if(cekkotlin.isChecked()){
            X+="Kotlin";

        }
        if(cekruby.isChecked()){
            X+="Ruby";

        }
        if(cekC.isChecked()){
            X+="C";

        }
        Toast.makeText(this, "You've choose : "+" "+X, Toast.LENGTH_SHORT).show();


    }
}