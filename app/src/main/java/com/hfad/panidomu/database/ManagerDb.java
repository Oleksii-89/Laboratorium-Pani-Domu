package com.hfad.panidomu.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ImageView;

import com.hfad.panidomu.recyclerView.Product;

import java.util.ArrayList;
import java.util.List;

public class ManagerDb {
    private Context context;
    private DbHelper dbHelper;
    private SQLiteDatabase db;

    public ManagerDb(Context context){
        this.context = context;
        dbHelper = new DbHelper(context);
    }

    public void openDb(){
        db = dbHelper.getReadableDatabase();
    }


    public List<String> getFromDB(){
        List<String> listName = new ArrayList<>();
        Cursor curs = db.query(Constants.TABLE_NAME,
                new String[]{Constants.IMAGE_ID},
                null,
                null,
                null, null, null);
        while (curs.moveToNext()){
            String name = curs.getString(curs.getColumnIndex(Constants.IMAGE_ID));
            listName.add(name);
        }
        curs.close();
        return listName;
    }

    public void loadImage(String imageName, ImageView imageIcon){
        int resID = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        imageIcon.setImageResource(resID);
    }

    public List<Product> getDLuxFromDb(){
        List<Product> listProduct = new ArrayList<>();

        Cursor curs = db.query(Constants.TABLE_NAME,
                new String[]{Constants.NAME, Constants.PRICE, Constants.DESCRIPTION, Constants.IMAGE_ID},
                "D_LUX = ?",
                new String[]{Integer.toString(1)},
                null, null, null);
        while (curs.moveToNext()){
            listProduct.add(new Product(curs.getString(curs.getColumnIndex(Constants.NAME)),
                    curs.getString(curs.getColumnIndex(Constants.PRICE)),
                    curs.getString(curs.getColumnIndex(Constants.DESCRIPTION)),
                    curs.getString(curs.getColumnIndex(Constants.IMAGE_ID))));
        }
        curs.close();

        return listProduct;
    }

    public List<Product> getSetFromDb(){
        List<Product> listProduct = new ArrayList<>();

        Cursor curs = db.query(Constants.TABLE_NAME,
                new String[]{Constants.NAME, Constants.PRICE, Constants.DESCRIPTION, Constants.IMAGE_ID},
                "CATEGORY = ?",
                new String[]{"set"},
                null, null, null);
        while (curs.moveToNext()){
            listProduct.add(new Product(curs.getString(curs.getColumnIndex(Constants.NAME)),
                    curs.getString(curs.getColumnIndex(Constants.PRICE)),
                    curs.getString(curs.getColumnIndex(Constants.DESCRIPTION)),
                    curs.getString(curs.getColumnIndex(Constants.IMAGE_ID))));
        }
        curs.close();

        return listProduct;
    }

    public List<Product> getAllFromDb(String[] search){
        List<Product> listProduct = new ArrayList<>();

        Cursor curs = db.query(Constants.TABLE_NAME,
                new String[]{Constants.NAME, Constants.PRICE, Constants.DESCRIPTION, Constants.IMAGE_ID},
                "CATEGORY = ?",
                search,
                null, null, null);
        while (curs.moveToNext()){
            listProduct.add(new Product(curs.getString(curs.getColumnIndex(Constants.NAME)),
                    curs.getString(curs.getColumnIndex(Constants.PRICE)),
                    curs.getString(curs.getColumnIndex(Constants.DESCRIPTION)),
                    curs.getString(curs.getColumnIndex(Constants.IMAGE_ID))));
        }
        curs.close();

        return listProduct;
    }

//    public List<Product> getProductFromDb(){
//        List<Product> listProduct = new ArrayList<>();
//
//        Cursor curs = db.query(Constants.TABLE_NAME,
//                new String[]{Constants.NAME, Constants.PRICE, Constants.DESCRIPTION, Constants.IMAGE_ID},
//                null,
//                null,
//                null, null, null);
//        while (curs.moveToNext()){
//            listProduct.add(new Product(curs.getString(curs.getColumnIndex(Constants.NAME)),
//                    curs.getString(curs.getColumnIndex(Constants.PRICE)),
//                    curs.getString(curs.getColumnIndex(Constants.DESCRIPTION)),
//                    curs.getString(curs.getColumnIndex(Constants.IMAGE_ID))));
//        }
//        curs.close();
//
//        return listProduct;
//    }



    public void closeDb(){
        dbHelper.close();
    }

}