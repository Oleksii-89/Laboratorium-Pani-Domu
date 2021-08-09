package com.hfad.panidomu.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.hfad.panidomu.R;

public class FotoActivity extends AppCompatActivity {
    private int pom1, pom2, team1, team2, jak1, jak2, d1, d2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_foto);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        pom1 = R.drawable.work_helper;
        pom2 = R.drawable.work_waite;
        team1 = R.drawable.work_team_work_one;
        team2 = R.drawable.work_team_work_two;
        jak1 = R.drawable.work_box_one;
        jak2 = R.drawable.work_box_two;
        d1 = R.drawable.fly_box_one;
        d2 = R.drawable.fly_box_two;

        img = (ImageView) findViewById(R.id.foto_worker_id);

        Bundle extra = getIntent().getExtras();
        int foto = extra.getInt("foto");

        switch (foto){
            case 1:
                img.setImageResource(pom1);
                break;
            case 2:
                img.setImageResource(pom2);
                break;
            case 3:
                img.setImageResource(team1);
                break;
            case 4:
                img.setImageResource(team2);
                break;
            case 5:
                img.setImageResource(jak1);
                break;
            case 6:
                img.setImageResource(jak2);
                break;
            case 7:
                img.setImageResource(d1);
                break;
            case 8:
                img.setImageResource(d2);
                break;
        }

    }


}