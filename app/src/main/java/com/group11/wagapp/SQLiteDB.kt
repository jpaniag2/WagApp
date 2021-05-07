package com.group11.wagapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteDB(context: Context) : SQLiteOpenHelper(context, "USERDATA", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE USERS(USERID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, EMAIL TEXT, USERNAME TEXT, PASSWORD TEXT, CONFIRM_PASSWORD TEXT)")
        db?.execSQL("INSERT INTO USERS(NAME, EMAIL, USERNAME, PASSWORD, CONFIRM_PASSWORD) VALUES( 'TEST','TEST@TEST.COM','TEST', 'TEST123', 'TEST123')")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}