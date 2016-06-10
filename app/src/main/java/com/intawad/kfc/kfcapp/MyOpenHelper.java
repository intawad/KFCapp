package com.intawad.kfc.kfcapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GGG on 10/6/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    public static final String database_name = "kfcdatabase.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table kfc (" +
            "_DistanceID INTEGER PRIMARY KEY AUTOINCREMENT," +
            " Year INTEGER," +
            " New INTEGER," +
            " Root1 INTEGER," +
            " Root2 INTEGER," +
            " Care1 INTEGER," +
            " Care2 INTEGER," +
            " Ready INTEGER," +
            " Gas1 INTEGER," +
            " Gas2 INTEGER," +
            " Day35 INTEGER," +
            " Day45 INTEGER," +
            " Day60 INTEGER," +
            " Day75 INTEGER," +
            " Day85 INTEGER," +
            " Day100 INTEGER," +
            " Day120 INTEGER," +
            " Day135 INTEGER," +
            " Day150 INTEGER," +
            " Die INTEGER);";
    private android.database.sqlite.SQLiteDatabase sqLiteDatabase;

    @Override
    public void onCreate(SQLiteDatabase db) {
        sqLiteDatabase.execSQL(create_user_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    }
}
