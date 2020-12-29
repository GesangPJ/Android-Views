package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Kosong extends AppCompatActivity {

    EditText PasswordUser;
    Button Tombol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isinyakosong);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        PasswordUser = (EditText) findViewById(R.id.inipassword);
        Tombol = (Button) findViewById(R.id.tombolkosong);

        Tombol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                if(PasswordUser.getText().toString().equals("")){
                   Toast.makeText(Kosong.this, "Password field is Empty!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Kosong.this, "Test Success!", Toast.LENGTH_SHORT).show();
                }
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