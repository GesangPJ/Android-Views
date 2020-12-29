package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class KontrolZoom extends AppCompatActivity {

    ZoomControls KontrolGede;

    ImageView Gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kontrolzoom);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        KontrolGede = findViewById(R.id.KontrolZooms);
        Gambar = findViewById(R.id.imageView);

        KontrolGede.setOnZoomInClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int w = Gambar.getWidth();
                int h = Gambar.getHeight();

                ConstraintLayout.LayoutParams params =
                        new ConstraintLayout.LayoutParams(w + 10, h + 10);

                Gambar.setLayoutParams(params);

            }
        });

        KontrolGede.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int w = Gambar.getWidth();
                int h = Gambar.getHeight();

                ConstraintLayout.LayoutParams params =
                        new ConstraintLayout.LayoutParams(w - 10, h - 10);

                Gambar.setLayoutParams(params);

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