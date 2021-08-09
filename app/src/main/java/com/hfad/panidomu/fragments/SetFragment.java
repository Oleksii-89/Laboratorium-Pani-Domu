package com.hfad.panidomu.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.panidomu.R;
import com.hfad.panidomu.database.ManagerDb;
import com.hfad.panidomu.recyclerView.Product;
import com.hfad.panidomu.recyclerView.ProductAdapter;

import java.util.ArrayList;
import java.util.List;


public class SetFragment extends Fragment {
    private RecyclerView recyclerView;
    private ManagerDb managerDb;
    private List<Product> products;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_set, container, false);

        managerDb = new ManagerDb(view.getContext());
        products = new ArrayList<>();
        managerDb.openDb();
        products = managerDb.getSetFromDb();
        managerDb.closeDb();


        recyclerView = view.findViewById(R.id.rv_product_recycler_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        recyclerView.setAdapter(new ProductAdapter(view.getContext(), products));
        return view;

    }
}