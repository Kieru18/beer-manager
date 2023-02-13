package com.beermanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

import com.beermanager.entities.Beer

@Dao
interface BeerDao {
    @Query("SELECT * FROM beers")
    fun getAll(): List<Beer>

    @Insert
    fun insert(beer: Beer)

    @Update
    fun update(beer: Beer)

    @Delete
    fun delete(beer: Beer)
}