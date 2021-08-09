package com.hfad.panidomu.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.hfad.panidomu.R;
import com.hfad.panidomu.database.ManagerDb;
import com.hfad.panidomu.recyclerView.Product;
import com.hfad.panidomu.recyclerView.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class WashingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ManagerDb managerDb;
    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_washing);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        String[] washing = extras.getStringArray("pranie");

        managerDb = new ManagerDb(this);
        products = new ArrayList<>();
        managerDb.openDb();
        products = managerDb.getAllFromDb(washing);
        managerDb.closeDb();


        recyclerView = (RecyclerView) findViewById(R.id.rv_product_recycler_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new ProductAdapter(this, products));



    }
}