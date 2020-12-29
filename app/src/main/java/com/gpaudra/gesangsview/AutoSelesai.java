package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoSelesai extends AppCompatActivity {

    String[] Kerjaan =
            {
                    "CEO","CTO","CFO","Admin","System Engineer","CMO","Office Staff","UI/UX Designer","Server Technician","Server Admin","Marketing Manager",
                    "Human Resource Unit","Network Engineer","Junior Developer","Senior Developer"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoselesai);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,Kerjaan);
        //Mendapatkan instansi dari AutoCompleteTextView
        AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.AutoSelesaiTeks);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.WHITE);




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