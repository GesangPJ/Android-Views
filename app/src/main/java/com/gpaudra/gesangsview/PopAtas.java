package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;


public class PopAtas extends AppCompatActivity {

    Button TombolPop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popatas);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        TombolPop = findViewById(R.id.TombolPop);
        TombolPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KelasPopUp popUpClass = new KelasPopUp();
                popUpClass.showPopupWindow(v);
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
}