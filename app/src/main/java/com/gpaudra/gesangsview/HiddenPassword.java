package com.gpaudra.gesangsview;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HiddenPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiddenpassword);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        final EditText teks = findViewById(R.id.inpassword);
        CheckBox cek = findViewById(R.id.cekpassword);

        cek.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // TODO Auto-generated method stub
            if (!isChecked) {
                teks.setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                teks.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
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