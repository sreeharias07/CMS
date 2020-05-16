package com.example.canteenmanagement;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDbAdapter extends SQLiteOpenHelper {

        public static final String DATABASE_NAME = "Credentials.db";
        public static final String TABLE_NAME_STUDENT = "Student";
        public static final String  COL_1 = "USERNAME";
        public static final String COL_2 = "PASSWORD";
        public static final String TABLE_NAME_CANTEEN = "Canteen";


        public myDbAdapter(Context context) {
                super(context, DATABASE_NAME, null, 1);
        }
        myDbAdapter myhelper;



        @Override
        public void onCreate(SQLiteDatabase db) {
                db.execSQL("create table " +  TABLE_NAME_CANTEEN + " (USERNAME TEXT PRIMARY KEY,PASSWORD TEXT)");
                db.execSQL("create table " +  TABLE_NAME_STUDENT + " (USERNAME TEXT PRIMARY KEY,PASSWORD TEXT)");


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_STUDENT);
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_CANTEEN);
                onCreate(db);
        }

        public boolean insertData(String uname,String pass, boolean category) {
                SQLiteDatabase db = this.getWritableDatabase();

                ContentValues contentValues = new ContentValues();
                contentValues.put(COL_1,uname);
                contentValues.put(COL_2,pass);
                if(category){
                        long result = db.insert(TABLE_NAME_STUDENT, null, contentValues);
                        if(result == -1)
                                return false;
                        else
                                return true;

                }else {
                        long result = db.insert(TABLE_NAME_CANTEEN, null, contentValues);
                        if(result == -1)
                                return false;
                        else
                                return true;
                }

        }
}
