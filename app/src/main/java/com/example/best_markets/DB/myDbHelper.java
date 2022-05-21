package com.example.best_markets.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class myDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 4;
    public static final String DATABASE_NAME = "ClassGroup.db";

    private static final String SQL_CREATE_TABLE =
            " CREATE TABLE " + TableInfo.TABLE_NAME + " (" +
                    TableInfo.COLUMN_NAME_SHOPNAME + " TEXT PRIMARY KEY," +
                    TableInfo.COLUMN_NAME_BUSINESSHOURS + " TEXT," +
                    TableInfo.COLUMN_NAME_CONTACTNUMBER + " TEXT," +
                    TableInfo.COLUMN_NAME_WAYTOCOME + " TEXT)";


    private static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TableInfo.TABLE_NAME;
    //db.execSQL("DROP TABLE IF EXISTS " +CREATE_USERS_TABLE );


    public myDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public myDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
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