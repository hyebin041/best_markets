package com.example.best_markets.DB;

public class MarketTableInfo {

    public static final String TABLE_NAME = "markets";
    public static final String COLUMN_NAME_M_NAME = "marketname";
    public static final String COLUMN_NAME_M_INTRO = "marketintro";

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + MarketTableInfo.TABLE_NAME + " (" +
                    MarketTableInfo.COLUMN_NAME_M_NAME + " TEXT," +
                    MarketTableInfo.COLUMN_NAME_M_INTRO + " TEXT)" ;

    private static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TableInfo.TABLE_NAME;

}
