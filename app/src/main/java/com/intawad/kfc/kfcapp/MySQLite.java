package com.intawad.kfc.kfcapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GGG on 10/6/2559.
 */
public class MySQLite {
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "kfc";
    public static final String column_id = "_DistanceID";
    public static final String Column_Year = "Year";
    public static final String Column_New = "New";
    public static final String Column_Root1 = "Root1";
    public static final String Column_Root2 = "Root2";
    public static final String Column_Care1 = "Care1";
    public static final String Column_Care2 = "Care2";
    public static final String Column_Ready = "Ready";
    public static final String Column_Gas1 = "Gas1";
    public static final String Column_Gas2 = "Gas2";
    public static final String Column_Day35 = "Day35";
    public static final String Column_Day45 = "Day45";
    public static final String Column_Day60 = "Day60";
    public static final String Column_Day75 = "Day75";
    public static final String Column_Day85 = "Day85";
    public static final String Column_Day100 = "Day100";
    public static final String Column_Day120 = "Day120";
    public static final String Column_Day135 = "Day135";
    public static final String Column_Day150 = "Day150";
    public static final String Column_Die = "Die";

    public MySQLite(Context context) {
        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();
    }

    public long AddNewData(Integer intYear,
                           Integer intNew,
                           Integer intRoot1,
                           Integer intRoot2,
                           Integer intCare1,
                           Integer intCare2,
                           Integer intReady,
                           Integer intGas1,
                           Integer intGas2,
                           Integer intDay35,
                           Integer intDay45,
                           Integer intDay60,
                           Integer intDay75,
                           Integer intDay85,
                           Integer intDay100,
                           Integer intDay120,
                           Integer intDay135,
                           Integer intDay150,
                           Integer intDie) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column_Year, intYear);
        contentValues.put(Column_New, intNew);
        contentValues.put(Column_Root1, intRoot1);
        contentValues.put(Column_Root2, intRoot2);
        contentValues.put(Column_Care1, intCare1);
        contentValues.put(Column_Care2, intCare2);
        contentValues.put(Column_Ready, intReady);
        contentValues.put(Column_Gas1, intGas1);
        contentValues.put(Column_Gas2, intGas2);
        contentValues.put(Column_Day35, intDay35);
        contentValues.put(Column_Day45, intDay45);
        contentValues.put(Column_Day60, intDay60);
        contentValues.put(Column_Day75, intDay75);
        contentValues.put(Column_Day85, intDay85);
        contentValues.put(Column_Day100, intDay100);
        contentValues.put(Column_Day120, intDay120);
        contentValues.put(Column_Day135, intDay135);
        contentValues.put(Column_Day150, intDay150);
        contentValues.put(Column_Die, intDie);
        return sqLiteDatabase.insert(user_table, null, contentValues);


    }

}
