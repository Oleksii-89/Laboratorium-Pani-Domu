package com.hfad.panidomu.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.hfad.panidomu.R;

public class AboutWorkerActivity extends AppCompatActivity {
    View pom1, pom2, team1, team2, jak1, jak2, d1, d2;
    int pom1i, pom2i, team1i, team2i, jak1i, jak2i, d1i, d2i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_worker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_about_worker);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        pom1 = (ImageView) findViewById(R.id.worker_pomoc_one);
        pom2 = (ImageView) findViewById(R.id.worker_pomoc_one);
        team1 = (ImageView) findViewById(R.id.worker_pomoc_one);
        team2 = (ImageView) findViewById(R.id.worker_pomoc_one);
        jak1 = (ImageView) findViewById(R.id.worker_pomoc_one);
        jak2 = (ImageView) findViewById(R.id.worker_pomoc_one);
        d1 = (ImageView) findViewById(R.id.worker_pomoc_one);
        d2 = (ImageView) findViewById(R.id.worker_pomoc_one);

        pom1i = 1;
        pom2i = 2;
        team1i = 3;
        team2i = 4;
        jak1i = 5;
        jak2i = 6;
        d1i = 7;
        d2i = 8;
    }



    public void p1(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", pom1i);
        startActivity(intent);
    }

    public void p2(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", pom2i);
        startActivity(intent);
    }

    public void t1(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", team1i);
        startActivity(intent);
    }

    public void t2(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", team2i);
        startActivity(intent);
    }

    public void j1(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", jak1i);
        startActivity(intent);
    }

    public void j2(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", jak2i);
        startActivity(intent);
    }

    public void d1(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", d1i);
        startActivity(intent);
    }

    public void d2(View view){
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("foto", d2i);
        startActivity(intent);
    }

//    public boolean fotoSelected(MenuItem item){
//        switch (item.getItemId()){
//            case pom1:
//                Intent intent = new Intent(this, FotoActivity.class);
//                intent.putExtra("foto", pom1);
//        }
//    }

}