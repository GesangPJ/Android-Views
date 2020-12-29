package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class AutoBanyak extends AppCompatActivity {
    MultiAutoCompleteTextView BanyakIsinya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autobanyak);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        String[] PARTS = {
                "AMD R9-3950X","AMD R9-3900X","AMD R7-3700","AMD R5-3600","AMD R3-3100","AMD R9-5950X","AMD R9-5900X","AMD R5-5600",
                "Intel Core i9-10900K","Intel Core i9-10900XE","Intel Core i9-10900X","Intel Core i7-10700","Intel Core i9-10850",
                "nVIDIA RTX3090","nVIDIA RTX3080","nVIDIA RTX3070","nVIDIA RTX3060Ti","nVIDIA RTX2080Ti","nVIDIA RTX2080","nVIDIA RTX2070",
                "nVIDIA RTX2080 Super", "nVIDIA RTX2070 Super","AMD RX6900XT", "AMD RX6800XT", "AMD RX6800"
        };

        BanyakIsinya = findViewById(R.id.isiBanyak);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,PARTS);

        BanyakIsinya.setAdapter(adapter);
        BanyakIsinya.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

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