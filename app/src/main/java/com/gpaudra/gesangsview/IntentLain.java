package com.gpaudra.gesangsview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class IntentLain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intentlain);



        Button BackIntent = findViewById(R.id.backintent);
        BackIntent.setOnClickListener(v-> HalamanExplicit());

        Button Utama = findViewById(R.id.backmain);
        Utama.setOnClickListener(v->HalamanUtama());
    }

    public void HalamanExplicit(){
        Intent AktivitasExplicit = new Intent(this, explicitbutton.class);
        startActivity(AktivitasExplicit);
    }

    public void HalamanUtama(){
        Intent AktivitasUtama = new Intent(this, MainActivity.class);
        startActivity(AktivitasUtama);
    }
}