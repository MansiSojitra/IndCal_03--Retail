//package com.mansi.industrialcalret;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import androidx.annotation.Nullable;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBHelper extends SQLiteOpenHelper {
//
//    public static final String DBNAME = "login.db";
//
//    public DBHelper(Context context) {
//        super(context, "login.db", null, 1);
//    }
//
////    @Override
////    public void onCreate(SQLiteDatabase MyDB) {
////        MyDB.execSQL("create Table users(username TEXT primary key, password TEXT , emailid TEXT , phoneno TEXT)");
////    }
//
//
//
//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//
//        try {
//            Connection con = DriverManager.getConnection("jdbc:sqlite:login.db");
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
//        MyDB.execSQL("drop Table if exists users");
//    }
//
//    public boolean insertData(String username, String password ,String emailid , String phoneno){
//         SQLiteDatabase MyDB = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("username", username);
//        contentValues.put("password", password);
//        contentValues.put("emailid",emailid);
//        contentValues.put("phoneno",phoneno);
//
//        long result = MyDB.insert("users", null , contentValues);
//
//        if(result==-1){
//            return false;
//        }
//        else{
//            return  true;
//        }
//    }
//
//
//    public boolean checkusername(String username){
//        SQLiteDatabase MyDB = this.getWritableDatabase();
//        Cursor cursor = MyDB.rawQuery("Select * from users where username = ?" , new String[]{username});
//        if(cursor.getCount()>0)
//            return  true;
//        else
//            return false;
//    }
//
//    public boolean checkusernamepassword(String username , String password){
//        SQLiteDatabase MyDB = this.getWritableDatabase();
//        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password=? " ,new String[] {username , password});
//        if(cursor.getCount()>0)
//            return  true;
//        else
//            return false;
//    }
//
//}
