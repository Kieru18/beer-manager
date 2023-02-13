package com.beermanager

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.beermanager.dao.BeerDao
import com.beermanager.dao.BreweryDao
import com.beermanager.dao.PhotoDao
import com.beermanager.dao.StyleDao

import com.beermanager.entities.Beer
import com.beermanager.entities.Brewery
import com.beermanager.entities.Photo
import com.beermanager.entities.Style

@Database(entities = [Beer::class, Brewery::class, Photo::class, Style::class], version = 1)
abstract class BeerManagerDatabase : RoomDatabase() {

    abstract fun beerDao(): BeerDao
    abstract fun breweryDao(): BreweryDao
    abstract fun photoDao(): PhotoDao
    abstract fun styleDao(): StyleDao

    companion object {
//        @Volatile
        private var INSTANCE: BeerManagerDatabase? = null

        fun getInstance(context: Context): BeerManagerDatabase {
            if (INSTANCE == null) {
                synchronized(BeerManagerDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        BeerManagerDatabase::class.java,
                        "database.db"
                    ).build()
                }
            }
            return INSTANCE!!
        }
    }
}
