package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditTeks extends AppCompatActivity {

    EditText namadepan, namabelakang;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editteks);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        namadepan = (EditText) findViewById(R.id.namadepan);
        namabelakang = (EditText) findViewById(R.id.namabelakang);
        output = (TextView) findViewById(R.id.tampilkan);



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
    @SuppressLint("SetTextI18n")
    public void cetaknama(View view){
        String NamaDepan = namadepan.getText().toString();
        String NamaBelakang = namabelakang.getText().toString();
        output.setText("Welcome"+" "+NamaDepan+" "+NamaBelakang+" "+"to GesangApp");
    }


}