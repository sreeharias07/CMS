package com.example.canteenmanagement;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class myDbAdapter extends SQLiteOpenHelper {
        public myDbAdapter(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
                super(context, name, factory, version);
        }
       /* myDbAdapter myhelper;

        public myDbAdapter(Context context)
        {
                myhelper = new myDbHelper(context);
        }*/


        @Override
        public void onCreate(SQLiteDatabase db) {

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
}
