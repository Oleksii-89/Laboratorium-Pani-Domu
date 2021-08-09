package com.hfad.panidomu;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.support.v7.widget.ShareActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.widget.TextView;

import com.hfad.panidomu.activity.BestWorkerActivity;
import com.hfad.panidomu.activity.ContactActivity;
import com.hfad.panidomu.database.Constants;
import com.hfad.panidomu.database.DbHelper;
import com.hfad.panidomu.database.ManagerDb;
import com.hfad.panidomu.fragments.D_luxFragment;
import com.hfad.panidomu.fragments.SellFragment;
import com.hfad.panidomu.fragments.SetFragment;
import com.hfad.panidomu.fragments.TopFragment;
import com.hfad.panidomu.recyclerView.Product;
import com.hfad.panidomu.recyclerView.ProductAdapter;
import com.hfad.panidomu.recyclerView.TestAdapter;
import com.hfad.panidomu.recyclerView.TestCardView;

import java.util.ArrayList;
import java.util.List;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;
    List<Product>products;
    ManagerDb managerDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        SectionsPagerAdapter pagerAdapter =
                new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider =
                (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionProvider("Chcesz kupić?");
        return super.onCreateOptionsMenu(menu);
        }

        private void setShareActionProvider(String text){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
        }

        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_best_worker:
                    Intent intent = new Intent(this, BestWorkerActivity.class);
                    startActivity(intent);
                    return true;
            case R.id.action_contact:
                Intent contact = new Intent(this, ContactActivity.class);
                startActivity(contact);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        }

        private class SectionsPagerAdapter extends FragmentPagerAdapter{

        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
            public int getCount(){
            return 4;
        }

        @Override
            public Fragment getItem(int position){
            switch (position){
                case 0:
                    return new TopFragment();
                case 1:
                    return new D_luxFragment();
                case 2:
                    return new SetFragment();
                case 3:
                    return new SellFragment();
            }
            return null;
        }

        @Override
            public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return getResources().getText(R.string.fragment_top);
                case 1:
                    return getResources().getText(R.string.fragment_dlux);
                case 2:
                    return getResources().getText(R.string.fragment_set);
                case 3:
                    return getResources().getText(R.string.fragment_sell);
            }
            return null;
        }

        }

        @Override
    public void onBackPressed(){
        Intent moveback =
                new Intent(this, MainActivity.class);
        startActivity(moveback);
        finish();
        }

}










//  managerDb = new ManagerDb(this);
//          products = new ArrayList<>();
//        managerDb.openDb();
//        products = managerDb.getProductFromDb();
//        managerDb.closeDb();
//
//
//
//
//
//        RecyclerView recycler = (RecyclerView) findViewById(R.id.rv_product_recycler_id);
//        ProductAdapter adapter = new ProductAdapter(this, products);
//        recycler.setLayoutManager(new GridLayoutManager(this, 2));
//        recycler.setAdapter(adapter);



//    private void loadImage(String mImageName, ImageView mImageIcon){
//        int resID = mContext.getResources().getIdentifier(mImageName , "drawable", mContext.getPackageName());
//        if(resID!=0) {//The associated resource identifier. Returns 0 if no such resource was found. (0 is not a valid resource ID.)
//            mImageIcon.setImageResource(resID);
//        }
//    }




//    ManagerDb managerDb;
//    List<String> listName;

//    managerDb = new ManagerDb(this);
//            managerDb.openDb();
//            listName = managerDb.getFromDB();
//            managerDb.closeDb();
//
//
//            String [] name = new String[listName.size()];
//            for (int i = 0; i < listName.size(); i++) {
//        name[i] = listName.get(i);
//        }
//
//
//    RecyclerView recyclerView= (RecyclerView) findViewById(R.id.rvTest);
//    TestAdapter testAdapter = new TestAdapter(name);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
//                recyclerView.setAdapter(testAdapter);










//    String[] productNames = new String[Product.product.length];
//        for (int i = 0; i < productNames.length; i++) {
//        productNames[i] = Product.product[i].getTitle();
//        }
//
//        int[] productImages = new int[Product.product.length];
//        for (int i = 0; i < productImages.length; i++) {
//        productImages[i] = Product.product[i].getImageResource();
//        }
//
//        double[] productPrice = new double[Product.product.length];
//        for (int i = 0; i < productPrice.length; i++) {
//        productPrice[i] = Product.product[i].getPrice();
//        }
//
//        RecyclerView myRecycler = (RecyclerView) findViewById(R.id.product_recycler_id);
//        ProductAdapter adapter = new ProductAdapter(productNames, productPrice, productImages);
//        myRecycler.setLayoutManager(new GridLayoutManager(this, 2));
//        myRecycler.setAdapter(adapter);





















//    private ManagerDb managerDb;
//    private DbHelper dbHelper;
//    private TextView tvText;
//    private List<String> list;
//
//
//      dbHelper = new DbHelper(this);
//              managerDb = new ManagerDb(this);
//              tvText = findViewById(R.id.tvHelloWorld);
//              list = new ArrayList<>();
//
//
//@Override
//protected void onResume() {
//        super.onResume();
//        managerDb.openDb();
//        for (String description : managerDb.getFromDB()){
//        tvText.append(description);
//        tvText.append("\n");
//        }
//        managerDb.closeDb();
//        }