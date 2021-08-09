package com.hfad.panidomu.database;

public class Constants {
    public static final String TABLE_NAME = "PANIDOMU";
    public static final String _ID = "_id";
    public static final String D_LUX = "D_LUX";
    public static final String CATEGORY = "CATEGORY";
    public static final String NAME = "NAME";
    public static final String PRICE = "PRICE";
    public static final String DESCRIPTION = "DESCRIPTION";
    public static final String IMAGE_ID = "IMAGE_RESOURCE_ID";
    public static final int DB_VERSION = 1;
    public static final String[] RETURN = {D_LUX, NAME, PRICE, DESCRIPTION, IMAGE_ID};
    public static final String COLUMN = CATEGORY + " = ?";

    public static final String TABLE_STRUCTURE = "CREATE TABLE " + TABLE_NAME
            + "(" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + D_LUX + " INTEGER, "
            + CATEGORY + " TEXT, "
            + NAME + " TEXT, "
            + PRICE + " TEXT, "
            + DESCRIPTION + " TEXT, "
            + IMAGE_ID + " TEXT);";

    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

}
