package com.gpaudra.gesangsview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ProgressKotak extends AppCompatActivity {
    Button TbFolding;
    ProgressDialog FoldingBar;
    private int progressBarStatus = 0;
    private final Handler progressBarHandler = new Handler();
    private long fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progresskotak);
        addListenerOnButtonClick();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
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
    private void addListenerOnButtonClick() {
        TbFolding  =findViewById(R.id.TombolFold);
        TbFolding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FoldingBar = new ProgressDialog(v.getContext());
                FoldingBar.setIndeterminate(false);
                FoldingBar.setCancelable(true);
                FoldingBar.setMessage("Mining ...");
                FoldingBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                FoldingBar.setProgress(0);
                FoldingBar.setMax(100);
                FoldingBar.show();

                progressBarStatus = 0;
                fileSize = 0;
                new Thread(new Runnable() {
                    public void run() {
                        while (progressBarStatus < 100) {
                            progressBarStatus +=1;

                           // progressBarStatus = doOperation();
                            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

                            progressBarHandler.post(new Runnable() {
                                public void run() {
                                    try {
                                        // Sleep for 200 milliseconds.
                                        Thread.sleep(200);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    FoldingBar.setProgress(progressBarStatus);
                                }
                            });
                        }

                        if (progressBarStatus >= 100) {
                            Toast.makeText(ProgressKotak.this, "Congratulations! You've got 100 BitCoins!", Toast.LENGTH_SHORT).show();
                            try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
                            // close the progress bar dialog
                             FoldingBar.dismiss();
                        }
                    }
                }).start();
            }//end of onClick method
        });
        }

    }