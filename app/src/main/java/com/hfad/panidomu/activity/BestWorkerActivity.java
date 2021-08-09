package com.hfad.panidomu.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.hfad.panidomu.R;

public class BestWorkerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_worker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_best_worker);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

//    public void goToDescription(View view){
//
//        Intent intent = new Intent(this, AboutWorkerActivity.class);
//        startActivity(intent);
//
//    }

}