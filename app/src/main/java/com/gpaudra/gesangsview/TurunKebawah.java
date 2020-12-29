package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;


public class TurunKebawah extends AppCompatActivity {

    private Spinner turunbawah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turunkebawah);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        turunbawah = findViewById(R.id.spinner);
        turunbawah.setOnItemSelectedListener(new Pilihan());
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
    public class Pilihan implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int posisi, long id) {
            String PilihanPertama = String.valueOf(turunbawah.getSelectedItem());

            if(PilihanPertama.equals(String.valueOf(turunbawah.getSelectedItem()))){

            }
            else {
                Toast.makeText(parent.getContext(), "You've choose : " + parent.getItemAtPosition(posisi).toString(),
                        Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {

        }

    }
}