package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class TeksPenglihat extends AppCompatActivity {
    EditText EditTeks1, EditTeks2;
    String Teks1, Teks2;

    TextView HintPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.tekspenglihat);
        Objects.requireNonNull(getSupportActionBar()).setTitle("GesangView-Login");
        getSupportActionBar().setSubtitle("g-paudra.blogspot.com");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        EditTeks1 = (EditText) findViewById(R.id.inusername2);
        EditTeks2 = (EditText) findViewById(R.id.inpassword2);
        HintPass = (TextView) findViewById(R.id.passhint);
        HintPass.setVisibility(View.GONE);

        EditTeks2.addTextChangedListener(PassPenglihat);

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

    private final TextWatcher PassPenglihat = new TextWatcher() {
        @Override

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            HintPass.setVisibility(View.VISIBLE);
        }

        @SuppressLint("SetTextI18n")
        @Override
        public void afterTextChanged(Editable s) {
            if (s.length()==0){
                HintPass.setVisibility(View.GONE);
            }
            else{
                HintPass.setText("Your Password :"+" "+EditTeks2.getText());
            }
        }
    };
    public void cetakmasuk(View view){
        Teks2 = EditTeks2.getText().toString();

        if (Teks2.contains("123")){

            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            Intent Sukses = new Intent(this, SuksesLogin.class);
            startActivity(Sukses);
        }
        else{
            Toast.makeText(this, "Your Password is Wrong, Try Again!", Toast.LENGTH_SHORT).show();
        }

    }
}