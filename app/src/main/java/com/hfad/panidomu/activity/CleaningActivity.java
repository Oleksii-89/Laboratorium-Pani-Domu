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

import java.util.List;

public class CleaningActivity extends AppCompatActivity {
    private List<Product> productList;
    private ManagerDb managerDb;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_cleaning);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        Bundle extras = getIntent().getExtras();
        String[] cleaning = extras.getStringArray("pranie");

        managerDb = new ManagerDb(this);
        managerDb.openDb();
        productList = managerDb.getAllFromDb(cleaning);
        managerDb.closeDb();

        recyclerView = (RecyclerView) findViewById(R.id.rv_product_recycler_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new ProductAdapter(this, productList));

    }
}