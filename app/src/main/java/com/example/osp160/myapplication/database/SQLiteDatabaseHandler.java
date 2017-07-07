package com.example.osp160.myapplication.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by osp193 on 6/7/17.
 */

public class SQLiteDatabaseHandler extends SQLiteOpenHelper {


    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "drivercallData";

    // Country table name
    private static final String TABLE_COUNTRY= "Calldetail";

    // Country Table Columns names
    private static final String KEY_ID = "id";
    private static final String COUNTRY_NAME = "CountryName";
    private static final String POPULATION = "Population";


    public SQLiteDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_COUNTRY_TABLE = "CREATE TABLE " + TABLE_COUNTRY + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + COUNTRY_NAME + " TEXT,"
                + COUNTRY_NAME + " LONG" + ")";
        db.execSQL(CREATE_COUNTRY_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COUNTRY);
        // Create tables again
        onCreate(db);

    }

    /*// Updating single country
    public int updateCountry(Country country) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COUNTRY_NAME, country.getCountryName());
        values.put(POPULATION, country.getPopulation());

        // updating row
        return db.update(TABLE_COUNTRY, values, KEY_ID + " = ?",
                new String[] { String.valueOf(country.getId()) });
    }

    // Deleting single country
    public void deleteCountry(Country country) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_COUNTRY, KEY_ID + " = ?",
                new String[] { String.valueOf(country.getId()) });
        db.close();
    }*/

    // Deleting all countries
    public void deleteAllCountries() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_COUNTRY,null,null);
        db.close();
    }

    // Getting countries Count
    public int getCountriesCount() {
        String countQuery = "SELECT  * FROM " + TABLE_COUNTRY;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
}
