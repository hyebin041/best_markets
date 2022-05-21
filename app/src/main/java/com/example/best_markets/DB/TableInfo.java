package com.example.best_markets.DB;

public class TableInfo {

    public static final String TABLE_NAME = "information";
    public static final String COLUMN_NAME_SHOPNAME = "id";
    public static final String COLUMN_NAME_BUSINESSHOURS = "name";
    public static final String COLUMN_NAME_CONTACTNUMBER = "age";
    public static final String COLUMN_NAME_WAYTOCOME = "department";

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TableInfo.TABLE_NAME + " (" +
                    TableInfo.COLUMN_NAME_SHOPNAME + " TEXT," +
                    TableInfo.COLUMN_NAME_BUSINESSHOURS + " TEXT," +
                    TableInfo.COLUMN_NAME_CONTACTNUMBER + " TEXT," +
                    TableInfo.COLUMN_NAME_WAYTOCOME + " TEXT)" ;

    private static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TableInfo.TABLE_NAME;

}
