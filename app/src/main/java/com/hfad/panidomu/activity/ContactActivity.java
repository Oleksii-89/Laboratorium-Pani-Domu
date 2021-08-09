package com.hfad.panidomu.activity;

import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.hfad.panidomu.R;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    public void onClickDone(View view){
        CharSequence text = getString(R.string.mesege_text);
        int duration = Snackbar.LENGTH_INDEFINITE;
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinator_contact), text, duration);
        snackbar.setAction(R.string.snack_text, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ContactActivity.this, R.string.snack_bar_message, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        snackbar.show();
    }

}