package com.hfad.panidomu.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfad.panidomu.R;

public class ProductActivity extends AppCompatActivity {

    Context context;
    private TextView tvTitle, tvDescription, tvPrice;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        tvTitle = (TextView) findViewById(R.id.tv_ap_product_title);
        tvPrice = (TextView) findViewById(R.id.tv_ap_price);
        tvDescription = (TextView) findViewById(R.id.tv_ap_description);
        ivImage = (ImageView) findViewById(R.id.iv_ap_product_image_id);

        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String price = intent.getExtras().getString("Price");
        int description = intent.getExtras().getInt("Description");
        int imageID = intent.getExtras().getInt("imageResource");


        tvTitle.setText(title);
        tvPrice.setText(price);
        tvDescription.setText(getString(description));
        ivImage.setImageResource(imageID);

    }
}