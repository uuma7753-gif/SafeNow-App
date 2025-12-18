package com.example.safenowapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [EmergencyContact::class],
    version = 1,
    exportSchema = false
)
abstract class SafeNowDatabase : RoomDatabase() {

    abstract fun emergencyContactDao(): EmergencyContactDao

    companion object {
        @Volatile
        private var INSTANCE: SafeNowDatabase? = null

        fun getInstance(context: Context): SafeNowDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SafeNowDatabase::class.java,
                    "safenow_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
