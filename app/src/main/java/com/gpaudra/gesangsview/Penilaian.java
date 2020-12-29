package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Penilaian extends AppCompatActivity {
    RatingBar Nilai;
    Button Tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penilaian);
        MendengarTombolKlik();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



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
    public void MendengarTombolKlik(){
        Nilai = findViewById(R.id.ratingBar);
        Tombol = findViewById(R.id.tombolnilai);

        Tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating=String.valueOf(Nilai.getRating());
                Toast.makeText(getApplicationContext(), rating + " "+"Thank You", Toast.LENGTH_LONG).show();
            }
        });

    }


}