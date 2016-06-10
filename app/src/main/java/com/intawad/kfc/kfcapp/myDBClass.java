//package com.intawad.kfc.kfcapp;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.content.Intent;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//
//public class myDBClass extends SQLiteOpenHelper {
//
//
//    // Database Version
//    private static final int DATABASE_VERSION = 1;
//
//
//    // Database Name
//    private static final String DATABASE_NAME = "kfcdatabase.db";
//
//    // Table Name
//    private static final String create_user_table = "create table kfc (" +
//            "_DistanceID INTEGER PRIMARY KEY AUTOINCREMENT," +
//            " Year INTEGER," +
//            " New INTEGER," +
//            " Root1 INTEGER," +
//            " Root2 INTEGER," +
//            " Care1 INTEGER," +
//            " Care2 INTEGER," +
//            " Ready INTEGER," +
//            " Gas1 INTEGER," +
//            " Gas2 INTEGER," +
//            " Day35 INTEGER," +
//            " Day45 INTEGER," +
//            " Day60 INTEGER," +
//            " Day75 INTEGER," +
//            " Day85 INTEGER," +
//            " Day100 INTEGER," +
//            " Day120 INTEGER," +
//            " Day135 INTEGER," +
//            " Day150 INTEGER," +
//            " Die INTEGER);";
//
//    public myDBClass(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        sqLiteDatabase.execSQL(create_user_table);
////        // Create Table Name
////        db.execSQL("CREATE TABLE " + TABLE_MEMBER +
////                "(DistanceID INTEGER PRIMARY KEY AUTOINCREMENT," +
////                " Year INTEGER(100)," +
////                " New INTEGER(100)," +
////                " Root1 INTEGER(100)," +
////                " Root2 INTEGER(100)," +
////                " Care1 INTEGER(100)," +
////                " Care2 INTEGER(100)," +
////                " Ready INTEGER(100)," +
////                " Gas1 INTEGER(100)," +
////                " Gas2 INTEGER(100)," +
////                " Day35 INTEGER(100)," +
////                " Day45 INTEGER(100)," +
////                " Day60 INTEGER(100)," +
////                " Day75 INTEGER(100)," +
////                " Day85 INTEGER(100)," +
////                " Day100 INTEGER(100)," +
////                " Day120 INTEGER(100)," +
////                " Day135 INTEGER(100)," +
////                " Day150 INTEGER(100)," +
////                " Die INTEGER(100));");
////
////        Log.d("CREATE TABLE","Create Table Successfully.");
//    }
//
////    // Insert Data
////    public long InsertData(Integer intYear, Integer intNew, Integer intRoot1, Integer intRoot2,
////                           Integer intCare1, Integer intCare2, Integer intReady, Integer intGas1,
////                           Integer intGas2, Integer intDay35, Integer intDay45, Integer intDay60,
////                           Integer intDay75, Integer intDay85, Integer intDay100, Integer intDay120,
////                           Integer intDay135, Integer intDay150, Integer intDie, String kfc) {
////        // TODO Auto-generated method stub
////
////        try {
////            SQLiteDatabase db;
////            db = this.getWritableDatabase(); // Write Data
////
////            /**
////             *  for API 11 and above
////             SQLiteStatement insertCmd;
////             String strSQL = "INSERT INTO " + TABLE_MEMBER
////             + "(MemberID,Name,Tel) VALUES (?,?,?)";
////
////             insertCmd = db.compileStatement(strSQL);
////             insertCmd.bindString(1, strMemberID);
////             insertCmd.bindString(2, strName);
////             insertCmd.bindString(3, strTel);
////             return insertCmd.executeInsert();
////             */
////
////            ContentValues Val = new ContentValues();
////            Val.put("Year", intYear);
////            Val.put("New", intNew);
////            Val.put("Root1", intRoot1);
////            Val.put("Root2", intRoot2);
////            Val.put("Care1", intCare1);
////            Val.put("Care2", intCare2);
////            Val.put("Ready", intReady);
////            Val.put("Gas1", intGas1);
////            Val.put("Gas2", intGas2);
////            Val.put("Day35", intDay35);
////            Val.put("45Day", intDay45);
////            Val.put("60Day", intDay60);
////            Val.put("75Day", intDay75);
////            Val.put("85Day", intDay85);
////            Val.put("100Day", intDay100);
////            Val.put("120Day", intDay120);
////            Val.put("135Day", intDay135);
////            Val.put("150Day", intDay150);
////            Val.put("Die", intDie);
////
////            long rows = db.insert(kfc, null, Val);
////
////            db.close();
////            return rows; // return rows inserted.
////
////        } catch (Exception e) {
////            return -1;
////        }
////
////    }
//
//    // Select Data
//    public String[] SelectData(String DistanceID) {
//        // TODO Auto-generated method stub
//
//        try {
//            String arrData[] = null;
//
//            SQLiteDatabase db;
//            db = this.getReadableDatabase(); // Read Data
//
//            Cursor cursor = db.query(TABLE_MEMBER, new String[] { "*" },
//                    "DistanceID=?",
//                    new String[] { String.valueOf(DistanceID) }, null, null, null, null);
//
//            if(cursor != null)
//            {
//                if (cursor.moveToFirst()) {
//                    arrData = new String[cursor.getColumnCount()];
//                    /***
//                     *  0 = MemberID
//                     *  1 = Name
//                     *  2 = Tel
//                     */
//                    arrData[0] = cursor.getString(0);
//                    arrData[1] = cursor.getString(1);
//                    arrData[2] = cursor.getString(2);
//                }
//            }
//            cursor.close();
//            db.close();
//            return arrData;
//
//        } catch (Exception e) {
//            return null;
//        }
//
//    }
//
//
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        // TODO Auto-generated method stub
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);
//
//        // Re Create on method  onCreate
//        onCreate(db);
//    }
//
//}
