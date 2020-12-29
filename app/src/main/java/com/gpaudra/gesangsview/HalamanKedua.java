package com.gpaudra.gesangsview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HalamanKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamankedua);

        Button TombolBalik = findViewById(R.id.tombolbalik);
        TombolBalik.setOnClickListener(v -> BalikHalaman());

        Button TombolTujuhBelas = findViewById(R.id.tombol17);
        TombolTujuhBelas.setOnClickListener(v->HalamanTanggal());

        Button TombolDelapanBelas = findViewById(R.id.tombol18);
        TombolDelapanBelas.setOnClickListener(v->HalamanJam());

        Button TombolSembilanBelas = findViewById(R.id.tombol19);
        TombolSembilanBelas.setOnClickListener(v->HalamanSwitch());

        Button TombolDuaPuluh = findViewById(R.id.tombol20);
        TombolDuaPuluh.setOnClickListener(v->HalamanTogel());

        Button Tombol21 = findViewById(R.id.tombol21);
        Tombol21.setOnClickListener(v->HalamanDigital());

        Button Tombol22 = findViewById(R.id.tombol22);
        Tombol22.setOnClickListener(v->HalamanAnalog());

        Button Tombol23 = findViewById(R.id.tombol23);
        Tombol23.setOnClickListener(v->HalamanZoom());

        Button Tombol24 = findViewById(R.id.tombol24);
        Tombol24.setOnClickListener(v->HalamanProses());

        Button Tombol25 = findViewById(R.id.tombol25);
        Tombol25.setOnClickListener(v->HalamanRating());

        Button Tombol26 = findViewById(R.id.tombol26);
        Tombol26.setOnClickListener(v->HalamanCari());

        Button Tombol27 = findViewById(R.id.tombol27);
        Tombol27.setOnClickListener(v->HalamanFolding());

        Button Tombol28 = findViewById(R.id.tombol28);
        Tombol28.setOnClickListener(v->HalamanAuto());

        Button Tombol29 = findViewById(R.id.tombol29);
        Tombol29.setOnClickListener(v->HalamanAutoBanyak());

        Button Tombol30 = findViewById(R.id.tombol30);
        Tombol30.setOnClickListener(v->HalamanPop());

        Button Tombol31 = findViewById(R.id.tombol31);
        Tombol31.setOnClickListener(v->HalamanVideo());

        Button Tombol32 = findViewById(R.id.tombol32);
        Tombol32.setOnClickListener(v->HalamanDrop());
    }
    public void HalamanDrop(){
        Intent AktivitasDrop = new Intent(this, DropBawah.class);
        startActivity(AktivitasDrop);
    }
    public void HalamanVideo(){
        Intent AktivitasVideo = new Intent(this, LihatVideo.class);
        startActivity(AktivitasVideo);
    }
    public void HalamanPop(){
        Intent AktivitasPop = new Intent(this, PopAtas.class);
        startActivity(AktivitasPop);
    }
    public void HalamanAutoBanyak(){
        Intent AktivitasAutoBanyak = new Intent(this,AutoBanyak.class);
        startActivity(AktivitasAutoBanyak);
    }
    public void HalamanAuto(){
        Intent AktivitasAuto = new Intent(this, AutoSelesai.class);
        startActivity(AktivitasAuto);
    }
    public void HalamanFolding(){
        Intent AktivitasFolding = new Intent(this, ProgressKotak.class);
        startActivity(AktivitasFolding);
    }
    public void HalamanCari(){
        Intent AktivitasCari = new Intent(this, CariBar.class);
        startActivity(AktivitasCari);
    }
    public void HalamanRating(){
        Intent AktivitasRating = new Intent(this, Penilaian.class);
        startActivity(AktivitasRating);
    }
    public void HalamanProses(){
        Intent AktivitasProses = new Intent(this, ProgresBulet.class);
        startActivity(AktivitasProses);
    }
    public void HalamanZoom(){
        Intent AktivitasZoom = new Intent(this, KontrolZoom.class);
        startActivity(AktivitasZoom);
    }
    public void HalamanAnalog(){
        Intent AktivitasAnalog = new Intent(this, JamAnalog.class);
        startActivity(AktivitasAnalog);
    }
    public void HalamanDigital(){
        Intent AktivitasDigital = new Intent(this, JamDigital.class);
        startActivity(AktivitasDigital);
    }
    public void HalamanTogel(){
        Intent AktivitasTogel = new Intent(this, TombolTogel.class);
        startActivity(AktivitasTogel);
    }
    public void HalamanSwitch(){
        Intent AktivitasSwitch = new Intent(this, TombolSwitch.class);
        startActivity(AktivitasSwitch);
    }
    public void HalamanJam(){
        Intent AktivitasJam = new Intent(this, AmbilWaktu.class);
        startActivity(AktivitasJam);
    }
    public void HalamanTanggal(){
        Intent AktivitasTanggal = new Intent(this, AmbilTanggal.class);
        startActivity(AktivitasTanggal);
    }
    public void BalikHalaman() {
        Intent AktivitasBalik = new Intent(this, MainActivity.class);
        startActivity(AktivitasBalik);
    }
}