package com.beermanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

import com.beermanager.entities.Brewery

@Dao
interface BreweryDao {
    @Query("SELECT * FROM breweries")
    fun getAll(): List<Brewery>

    @Insert
    fun insert(brewery: Brewery)

    @Update
    fun update(brewery: Brewery)

    @Delete
    fun delete(brewery: Brewery)
}