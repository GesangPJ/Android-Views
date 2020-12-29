package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ImplicitIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicit);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button TombolYT = findViewById(R.id.tombolbuka);
        TombolYT.setOnClickListener(v->BukaYT());
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

    public void BukaYT(){
        Intent ChannelYT = new Intent(Intent.ACTION_VIEW);
        ChannelYT.setData(Uri.parse("https://www.youtube.com/channel/UCXkRBbNpJZ2_Rie-9s6mxlg"));
        ChannelYT.setPackage("com.google.android.youtube");
        startActivity(ChannelYT);
    }
}