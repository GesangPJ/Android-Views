package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LihatGambar extends AppCompatActivity {
    ImageView KotakGambar ;
    Button TombolLanjut, TombolSebelumnya;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        KotakGambar = findViewById(R.id.Gambar);
        TombolLanjut = findViewById(R.id.selanjutnya);
        TombolSebelumnya = findViewById(R.id.sebelumnyas);
        TombolSebelumnya.setVisibility(View.INVISIBLE);


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

    public void Selanjutnya(View view){
        KotakGambar.setImageResource(R.drawable.stark_industries_logo);
        TombolSebelumnya.setVisibility(View.VISIBLE);
        TombolLanjut.setVisibility(View.INVISIBLE);

    }
    public void Sebelum(View view){
        KotakGambar.setImageResource(R.drawable._718a076e29822051df8bcf8b5ce1124_android_logo_by_vexels);
        TombolSebelumnya.setVisibility(View.INVISIBLE);
        TombolLanjut.setVisibility(View.VISIBLE);
    }





}