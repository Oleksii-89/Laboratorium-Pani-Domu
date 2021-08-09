package com.hfad.panidomu.recyclerView;

import android.content.Context;
import android.content.res.Resources;
import android.renderscript.Sampler;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfad.panidomu.R;

import java.time.temporal.ValueRange;
import java.util.zip.Inflater;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private String[] testTitle;
    private Context context;

    public TestAdapter(String[] testTitle, Context context) {

        this.testTitle = testTitle;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return testTitle.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }


    @Override
    public TestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.test_card, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position){

//        CardView cardView = viewHolder.cardView;
//        TextView testTitleView = (TextView) cardView.findViewById(R.id.tvTest_title);
//        testTitleView.setText(testTitle[position]);

        CardView cardView = viewHolder.cardView;
        ImageView testImageView = (ImageView) cardView.findViewById(R.id.iv_test_image);
        int resID = context.getResources().getIdentifier(testTitle[position], "drawable", context.getPackageName());
        testImageView.setImageResource(resID);

    }


}
