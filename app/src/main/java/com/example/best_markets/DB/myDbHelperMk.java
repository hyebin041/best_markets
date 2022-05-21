package com.example.best_markets.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class myDbHelperMk extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 4;
    public static final String DATABASE_NAME = "Markets.db";

    private static final String SQL_CREATE_TABLE =
            " CREATE TABLE " + MarketTableInfo.TABLE_NAME + " (" +
                    MarketTableInfo.COLUMN_NAME_M_NAME + " TEXT," +
                    MarketTableInfo.COLUMN_NAME_M_INTRO + " TEXT)";


    private static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + MarketTableInfo.TABLE_NAME;
    //db.execSQL("DROP TABLE IF EXISTS " +CREATE_USERS_TABLE );


    public myDbHelperMk(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public myDbHelperMk(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_TABLE);
        onCreate(sqLiteDatabase);
    }
}
