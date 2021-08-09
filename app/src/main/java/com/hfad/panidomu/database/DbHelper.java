package com.hfad.panidomu.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.hfad.panidomu.R;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = Constants.TABLE_NAME;
    private static final int DB_VERSION = 28;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.TABLE_STRUCTURE);

        insertToDb(db, 1, "cleaning laz", "D-LUX Kamień I Rdza 1l", "19.99", "d_sp_laz_rdza", "d_sp_laz_kamien_i_rdza");
        insertToDb(db, 1, "cleaning laz", "D-LUX Płyn Do Pleśni 750 Ml", "29.99", "d_sp_laz_plesn", "d_sp_laz_plesn");
        insertToDb(db, 1, "cleaning laz", "D-LUX Płyn Do Czyszczenia Fug 1 L", "29.80", "d_sp_laz_fuga", "d_sp_laz_fuga");
        insertToDb(db, 1, "cleaning laz", "D-LUX WC-CHLORATOS 1l", "14.99", "d_sp_laz_wc", "d_sp_laz_wc");
        insertToDb(db, 1, "cleaning pod", "D-LUX Podłogi Nabłyszczający - Płyn Do Mycia Podłóg 1 L", "12.49", "d_sp_pod_cytrus", "d_sp_pod_cytrus");
        insertToDb(db, 1, "cleaning kuh", "D-LUX - Płyn Na Przypalenia 500 Ml", "22.99", "d_sp_kuh_przypalenia", "d_sp_kuh_przypalenia");
        insertToDb(db, 1, "cleaning kuh", "D-LUX Meble 500 Ml", "19.00", "d_sp_kuh_meble", "d_sp_kuh_meble");
        insertToDb(db, 1, "cleaning kuh", "D-LUX - Ręcznik Kuchenny 100 M", "11.99", "d_sp_kuh_papier", "d_sp_kuh_papier");
        insertToDb(db, 0, "set", "Zestaw Niezbędny Z Płynem Do Mebli I Darmową Wysyłką", "74.70", "set_niezbedny_meb", "set_niezbedny_meb");
        insertToDb(db, 0, "set", "Zestaw Domowy Z Darmową Wysyłką", "60.72", "set_niezbedny_meb", "set_domowy");
        insertToDb(db, 1, "set", "D-LUX Zestaw Podłogi – 2", "82", "set_niezbedny_meb", "set_podlogi");
        insertToDb(db, 0, "set", "Zestaw Domowy + D-LUX Żelazko W Spray Z Darmową Wysyłką", "89.72", "set_niezbedny_meb", "set_domowy_zalazko");
        insertToDb(db, 0, "set", "Zestaw Codzienny + D-LUX Ręcznik Kuchenny", "70.70", "set_niezbedny_meb", "set_codzieny_papier");
        insertToDb(db, 0, "set", "Zestaw Okna I Meble", "42.00", "set_niezbedny_meb", "set_okna_meble");
        insertToDb(db, 0, "set", "Zestaw Białe Firanki", "50.00", "set_niezbedny_meb", "set_biale_firanki");
        insertToDb(db, 0, "set", "Zestaw Domowy Z Darmową Wysyłką", "60.72", "set_niezbedny_meb", "set_domowy");
        insertToDb(db, 1, "set", "D-LUX Zestaw Podłogi – 2", "82", "set_niezbedny_meb", "set_podlogi");
        insertToDb(db, 0, "set", "Zestaw Domowy + D-LUX Żelazko W Spray Z Darmową Wysyłką", "89.72", "set_niezbedny_meb", "set_domowy_zalazko");
        insertToDb(db, 0, "set", "Zestaw Codzienny + D-LUX Ręcznik Kuchenny", "70.70", "set_niezbedny_meb", "set_codzieny_papier");
        insertToDb(db, 0, "set", "Zestaw Okna I Meble", "42.00", "set_niezbedny_meb", "set_okna_meble");
        insertToDb(db, 0, "set", "Zestaw Białe Firanki", "50.00", "set_niezbedny_meb", "set_biale_firanki");
        insertToDb(db, 0, "wash", "Vizir - Proszek Do Prania Color 5,395kg", "89", "pr_vizir", "pr_vizir");
        insertToDb(db, 0, "wash", "G&G Anti-Kalk - Żel Odkamieniacz Do Pralek W Żelu 1l", "19.00", "pr_gg_antikal", "pr_gg_antikal");
        insertToDb(db, 0, "wash", "Astonish Oxi Active - Odplamiacz Uniwersalny 500 G", "13.99", "pr_oxi", "pr_oxi");
        insertToDb(db, 0, "wash", "Persil - Proszek Do Prania Color 6,5kg", "89.00", "pr_vizir", "pr_persil");
        insertToDb(db, 0, "wash", "Ariel - Proszek Do Prania Kolor 2,814kg", "66.00", "pr_vizir", "pr_ariel");
        insertToDb(db, 0, "wash", "Triumf - Kapsułki Do Prania Do Koloru 30 Szt.", "32.00", "pr_vizir", "pr_triumf");
        insertToDb(db, 0, "wash", "Dalli - Proszek Do Prania Sensitive 7,15 Kg", "59.00", "pr_vizir", "pr_dalli");
        insertToDb(db, 0, "wash", "Vizir - Proszek Do Prania Color 5,395kg", "89", "pr_vizir", "pr_vizir");
        insertToDb(db, 0, "wash", "G&G Anti-Kalk - Żel Odkamieniacz Do Pralek W Żelu 1l", "19.00", "pr_gg_antikal", "pr_gg_antikal");
        insertToDb(db, 0, "wash", "Astonish Oxi Active - Odplamiacz Uniwersalny 500 G", "13.99", "pr_oxi", "pr_oxi");
        insertToDb(db, 0, "wash", "Persil - Proszek Do Prania Color 6,5kg", "89.00", "pr_vizir", "pr_persil");
        insertToDb(db, 0, "wash", "Ariel - Proszek Do Prania Kolor 2,814kg", "66.00", "pr_vizir", "pr_ariel");
        insertToDb(db, 0, "wash", "Triumf - Kapsułki Do Prania Do Koloru 30 Szt.", "32.00", "pr_vizir", "pr_triumf");
        insertToDb(db, 0, "wash", "Dalli - Proszek Do Prania Sensitive 7,15 Kg", "59.00", "pr_vizir", "pr_dalli"); insertToDb(db, 0, "wash", "Vizir - Proszek Do Prania Color 5,395kg", "89", "pr_vizir", "pr_vizir");
        insertToDb(db, 0, "wash", "G&G Anti-Kalk - Żel Odkamieniacz Do Pralek W Żelu 1l", "19.00", "pr_gg_antikal", "pr_gg_antikal");
        insertToDb(db, 0, "wash", "Astonish Oxi Active - Odplamiacz Uniwersalny 500 G", "13.99", "pr_oxi", "pr_oxi");
        insertToDb(db, 0, "wash", "Persil - Proszek Do Prania Color 6,5kg", "89.00", "pr_vizir", "pr_persil");
        insertToDb(db, 0, "wash", "Ariel - Proszek Do Prania Kolor 2,814kg", "66.00", "pr_vizir", "pr_ariel");
        insertToDb(db, 0, "wash", "Triumf - Kapsułki Do Prania Do Koloru 30 Szt.", "32.00", "pr_vizir", "pr_triumf");
        insertToDb(db, 0, "wash", "Dalli - Proszek Do Prania Sensitive 7,15 Kg", "59.00", "pr_vizir", "pr_dalli");
        insertToDb(db, 0, "cleaning", "Green Shield 70 Szt Chusteczki Do Drewna I Mebli", "6.99", "pr_vizir", "sp_gring_meble");
        insertToDb(db, 0, "cleaning", "Poliboy - Środek Do Czyszczenia Złota I Srebra 375 Ml", "23.00", "pr_vizir", "sp_poliboy");
        insertToDb(db, 0, "cleaning", "Sil - Pianka Do Dywanów 600 Ml", "18.00", "pr_vizir", "sp_sil");
        insertToDb(db, 0, "cleaning", "G&G - Udrażniacz Do Rur 1l", "16.00", "pr_vizir", "sp_rur");
        insertToDb(db, 0, "cleaning", "Green Shield 70 Szt Chusteczki Do Drewna I Mebli", "6.99", "pr_vizir", "sp_gring_meble");
        insertToDb(db, 0, "cleaning", "Poliboy - Środek Do Czyszczenia Złota I Srebra 375 Ml", "23.00", "pr_vizir", "sp_poliboy");
        insertToDb(db, 0, "cleaning", "Sil - Pianka Do Dywanów 600 Ml", "18.00", "pr_vizir", "sp_sil");
        insertToDb(db, 0, "cleaning", "G&G - Udrażniacz Do Rur 1l", "16.00", "pr_vizir", "sp_rur");
        insertToDb(db, 0, "cleaning", "Green Shield 70 Szt Chusteczki Do Drewna I Mebli", "6.99", "pr_vizir", "sp_gring_meble");
        insertToDb(db, 0, "cleaning", "Poliboy - Środek Do Czyszczenia Złota I Srebra 375 Ml", "23.00", "pr_vizir", "sp_poliboy");
        insertToDb(db, 0, "cleaning", "Sil - Pianka Do Dywanów 600 Ml", "18.00", "pr_vizir", "sp_sil");
        insertToDb(db, 0, "cleaning", "G&G - Udrażniacz Do Rur 1l", "16.00", "pr_vizir", "sp_rur");
        insertToDb(db, 0, "cleaning", "Green Shield 70 Szt Chusteczki Do Drewna I Mebli", "6.99", "pr_vizir", "sp_gring_meble");
        insertToDb(db, 0, "cleaning", "Poliboy - Środek Do Czyszczenia Złota I Srebra 375 Ml", "23.00", "pr_vizir", "sp_poliboy");
        insertToDb(db, 0, "cleaning", "Sil - Pianka Do Dywanów 600 Ml", "18.00", "pr_vizir", "sp_sil");
        insertToDb(db, 0, "cleaning", "G&G - Udrażniacz Do Rur 1l", "16.00", "pr_vizir", "sp_rur");
        insertToDb(db, 0, "dishwasher", "Finish Spezial Salz Sól Do Zmywarki 1,2 Kg", "10.00", "pr_vizir", "zm_finish_sol");
        insertToDb(db, 0, "dishwasher", "Dreft - Kapsułki Do Zmywarki 90 Szt. - Platinum", "84.99", "pr_vizir", "zm_dreft");
        insertToDb(db, 0, "dishwasher", "Larbre Vert – All In One Ekologiczne Tabletki Do Zmywarki 30 Szt.", "37.99", "pr_vizir", "zm_vert");
        insertToDb(db, 0, "dishwasher", "Finish Spezial Salz Sól Do Zmywarki 1,2 Kg", "10.00", "pr_vizir", "zm_finish_sol");
        insertToDb(db, 0, "dishwasher", "Dreft - Kapsułki Do Zmywarki 90 Szt. - Platinum", "84.99", "pr_vizir", "zm_dreft");
        insertToDb(db, 0, "dishwasher", "Larbre Vert – All In One Ekologiczne Tabletki Do Zmywarki 30 Szt.", "37.99", "pr_vizir", "zm_vert");
        insertToDb(db, 0, "dishwasher", "Finish Spezial Salz Sól Do Zmywarki 1,2 Kg", "10.00", "pr_vizir", "zm_finish_sol");
        insertToDb(db, 0, "dishwasher", "Dreft - Kapsułki Do Zmywarki 90 Szt. - Platinum", "84.99", "pr_vizir", "zm_dreft");
        insertToDb(db, 0, "dishwasher", "Larbre Vert – All In One Ekologiczne Tabletki Do Zmywarki 30 Szt.", "37.99", "pr_vizir", "zm_vert");
        insertToDb(db, 0, "dishwasher", "Finish Spezial Salz Sól Do Zmywarki 1,2 Kg", "10.00", "pr_vizir", "zm_finish_sol");
        insertToDb(db, 0, "dishwasher", "Dreft - Kapsułki Do Zmywarki 90 Szt. - Platinum", "84.99", "pr_vizir", "zm_dreft");
        insertToDb(db, 0, "dishwasher", "Larbre Vert – All In One Ekologiczne Tabletki Do Zmywarki 30 Szt.", "37.99", "pr_vizir", "zm_vert");
        insertToDb(db, 0, "dishwasher", "Finish Spezial Salz Sól Do Zmywarki 1,2 Kg", "10.00", "pr_vizir", "zm_finish_sol");
        insertToDb(db, 0, "dishwasher", "Dreft - Kapsułki Do Zmywarki 90 Szt. - Platinum", "84.99", "pr_vizir", "zm_dreft");
        insertToDb(db, 0, "dishwasher", "Larbre Vert – All In One Ekologiczne Tabletki Do Zmywarki 30 Szt.", "37.99", "pr_vizir", "zm_vert");
        insertToDb(db, 0, "dishwasher", "Finish Spezial Salz Sól Do Zmywarki 1,2 Kg", "10.00", "pr_vizir", "zm_finish_sol");
        insertToDb(db, 0, "dishwasher", "Dreft - Kapsułki Do Zmywarki 90 Szt. - Platinum", "84.99", "pr_vizir", "zm_dreft");
        insertToDb(db, 0, "dishwasher", "Larbre Vert – All In One Ekologiczne Tabletki Do Zmywarki 30 Szt.", "37.99", "pr_vizir", "zm_vert");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Constants.DROP_TABLE);
        onCreate(db);
    }

    public void insertToDb(SQLiteDatabase db, int dLux, String category, String name,
                           String price, String description, String imageId){
        ContentValues cv = new ContentValues();
        cv.put(Constants.D_LUX, dLux);
        cv.put(Constants.CATEGORY, category);
        cv.put(Constants.NAME, name);
        cv.put(Constants.PRICE, price);
        cv.put(Constants.DESCRIPTION, description);
        cv.put(Constants.IMAGE_ID, imageId);
        db.insert(Constants.TABLE_NAME, null, cv);
    }


}