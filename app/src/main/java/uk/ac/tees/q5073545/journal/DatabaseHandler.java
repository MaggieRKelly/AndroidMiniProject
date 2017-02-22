package uk.ac.tees.q5073545.journal;

/*
 * Created by Maggie on 20/02/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHandler extends SQLiteOpenHelper {

    //Database Name
    private static final String DATABASE_NAME = "Journal.db";

    //Table Name
    private static final String TABLE_NAME = "Journal";

    //Table columns names
    private static final String COL_ID = "_id";
    private static final String COL_note = "note";
    private static final String COL_type = "category";
    private static final String COL_dateTime = "dateTime";
    private static final String COL_locationLong = "locationLong";
    private static final String COL_locationLat = "locationLat";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //generate create SQL Statement
        String CREATE_JOURNAL_TABLE = "CREATE TABLE "
                + TABLE_NAME
                + "(" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL_note + " TEXT,"
                + COL_type + " TEXT,"
                + COL_dateTime + " REAL,"
                + COL_locationLong + " REAL,"
                + COL_locationLat + " REAL " + ")";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //drop older table if exists and create fresh (dletes all data)
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

