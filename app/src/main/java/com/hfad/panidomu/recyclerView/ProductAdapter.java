package com.hfad.panidomu.recyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfad.panidomu.R;
import com.hfad.panidomu.activity.ProductActivity;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private Context context;
    private List<Product> listProduct;

    public ProductAdapter(Context context, List<Product> listProduct) {
        this.context = context;
        this.listProduct = listProduct;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_product_title;
        ImageView iv_product_image;
        TextView tv_product_price;
        CardView cardView;

        public ViewHolder(View itemView){
            super(itemView);
            tv_product_title = (TextView) itemView.findViewById(R.id.product_title_id);
            iv_product_image = (ImageView) itemView.findViewById(R.id.product_image_id);
            tv_product_price = (TextView) itemView.findViewById(R.id.product_price_id);
            cardView = (CardView) itemView.findViewById(R.id.product_card_id);
        }
    }

    @Override
    public int getItemCount(){
        return listProduct.size();
    }

    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.card_product, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ProductAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position){

        holder.tv_product_title.setText(listProduct.get(position).getTitle());
//        String imageName = listProduct.get(position).getImageResource();
        int resID = context.getResources().getIdentifier(listProduct.get(position).getImageResource(), "drawable", context.getPackageName());
        holder.iv_product_image.setImageResource(resID);
//        holder.iv_product_image.setImageResource(listProduct.get(position).getImageResource());
        holder.tv_product_price.setText(listProduct.get(position).getPrice());

        int descriptionId = context.getResources().getIdentifier(listProduct.get(position).getDescription(), "string", context.getPackageName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, ProductActivity.class);

                intent.putExtra("Title", listProduct.get(position).getTitle());
                intent.putExtra("Price", listProduct.get(position).getPrice());
                intent.putExtra("Description", descriptionId);
                intent.putExtra("imageResource", resID);

                context.startActivity(intent);

            }
        });
    }

}











//    private String[] adapterTitle;
//    private double[] adapterPrice;
//    private int[] adapterImage;
//
//    public ProductAdapter(String[] adapterTitle, double[] adapterPrice, int[] adapterImage) {
//        this.adapterTitle = adapterTitle;
//        this.adapterPrice = adapterPrice;
//        this.adapterImage = adapterImage;
//    }




//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position){
//        CardView cardView = holder.cardView;
//        ImageView imageView = (ImageView) cardView.findViewById(R.id.product_image_id);
//        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), adapterImage[position]);
//        imageView.setImageDrawable(drawable);
//        imageView.setContentDescription(adapterTitle[position]);
//        TextView titleView = (TextView) cardView.findViewById(R.id.product_title_id);
//        titleView.setText(adapterTitle[position]);
//        TextView priceView = (TextView) cardView.findViewById(R.id.product_price_id);
//        priceView.setContentDescription(adapterTitle[position]);
//    }
