package com.gpaudra.gesangsview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button TombolLanjut = findViewById(R.id.tombolnext);
        TombolLanjut.setOnClickListener(v -> NextHalaman());

        Button TombolPertama = findViewById(R.id.tombolpertama);
        TombolPertama.setOnClickListener(v -> HalamanTeks());

        Button TombolKedua = findViewById(R.id.tombolkedua);
        TombolKedua.setOnClickListener(v -> HalamanFonts());

        Button TombolKetiga = findViewById(R.id.tombol19);
        TombolKetiga.setOnClickListener(v -> HalamanTombolKustom());

        Button TombolKeempat = findViewById(R.id.tombol20);
        TombolKeempat.setOnClickListener(v -> HalamanExplicit());

        Button TombolKelima = findViewById(R.id.tombol21);
        TombolKelima.setOnClickListener(v->HalamanImplicit());

        Button TombolKeenam = findViewById(R.id.tombol22);
        TombolKeenam.setOnClickListener(v->HalamanGambar());

        Button TombolKetujuh = findViewById(R.id.tombol23);
        TombolKetujuh.setOnClickListener(v->HalamanTombolGambar());

        Button TombolKedelapan = findViewById(R.id.tombol24);
        TombolKedelapan.setOnClickListener(v->HalamanEditText());

        Button TombolKesembilan = findViewById(R.id.tombol25);
        TombolKesembilan.setOnClickListener(v->HalamanPassword());

        Button TombolSepuluh = findViewById(R.id.tombol26);
        TombolSepuluh.setOnClickListener(v->HalamanPenglihat());

        Button TombolSebelas = findViewById(R.id.tombol27);
        TombolSebelas.setOnClickListener(v->HalamanToast());

        Button TombolDuaBelas = findViewById(R.id.tombol28);
        TombolDuaBelas.setOnClickListener(v->HalamanKosong());

        Button TombolTigaBelas = findViewById(R.id.tombol29);
        TombolTigaBelas.setOnClickListener(v->HalamanCek());

        Button TombolEmpatBelas = findViewById(R.id.tombol30);
        TombolEmpatBelas.setOnClickListener(v->MilihWarna());

        Button TombolLimaBelas = findViewById(R.id.tombol31);
        TombolLimaBelas.setOnClickListener(v->HalamanRadio());

        Button TombolEnamBelas = findViewById(R.id.tombol32);
        TombolEnamBelas.setOnClickListener(v->HalamanBawah());


    }
    public void HalamanBawah(){
        Intent AktivitasBawah = new Intent(this, TurunKebawah.class);
        startActivity(AktivitasBawah);
    }
    public void NextHalaman(){
        Intent AktivitasLain =new Intent(this, HalamanKedua.class);
        startActivity(AktivitasLain);
    }

    public void HalamanTeks(){
        Intent AktivitasPertama =  new Intent(this, LihatTeks.class);
        startActivity(AktivitasPertama);
    }

    public void HalamanTombolKustom(){
        Intent AktivitasTombol1 = new Intent(this, tombolkustom.class);
        startActivity(AktivitasTombol1);
    }

    public void HalamanFonts(){
        Intent AktivitasFonts = new Intent(this, CustomFonts.class);
        startActivity(AktivitasFonts);
    }
    public void HalamanExplicit(){
        Intent AktivitasExplicit = new Intent(this, explicitbutton.class);
        startActivity(AktivitasExplicit);
    }
    public void HalamanImplicit(){
        Intent AktivitasImplicit = new Intent(this, ImplicitIntent.class);
        startActivity(AktivitasImplicit);
    }

    public void HalamanGambar(){
        Intent AktivitasGambar = new Intent(this, LihatGambar.class);
        startActivity(AktivitasGambar);
    }
    public void HalamanTombolGambar(){
        Intent AktivitasTombolGambar = new Intent(this, TombolGambar.class);
        startActivity(AktivitasTombolGambar);
    }
    public void HalamanEditText(){
        Intent AktivitasEditTeks = new Intent(this, EditTeks.class);
        startActivity(AktivitasEditTeks);
    }

    public void HalamanPassword(){
        Intent AktivitasPassword = new Intent(this, HiddenPassword.class);
        startActivity(AktivitasPassword);
    }
    public void HalamanPenglihat(){
        Intent AktivitasPenglihat = new Intent(this, TeksPenglihat.class);
        startActivity(AktivitasPenglihat);
    }
    public void HalamanToast(){
        Intent AktivitasToast = new Intent(this, WidgetToast.class);
        startActivity(AktivitasToast);
    }
    public void HalamanKosong(){
        Intent AktivitasKosong = new Intent(this, Kosong.class);
        startActivity(AktivitasKosong);
    }
    public void HalamanCek(){
        Intent AktivitasCek = new Intent(this, CekBox.class);
        startActivity(AktivitasCek);
    }
    public void MilihWarna(){
        Intent AktivitasWarna = new Intent(this, PilihWarna.class);
        startActivity(AktivitasWarna);
    }
    public void HalamanRadio(){
        Intent AktivitasRadio = new Intent(this, TombolRadio.class);
        startActivity(AktivitasRadio);
    }

}