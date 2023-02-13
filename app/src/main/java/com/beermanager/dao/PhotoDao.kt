package com.beermanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

import com.beermanager.entities.Photo

@Dao
interface PhotoDao {
    @Query("SELECT * FROM photos")
    fun getAll(): List<Photo>

    @Query("SELECT * FROM photos WHERE beer_id = :beerId")
    fun getByBeerId(beerId: Long): List<Photo>

    @Insert
    fun insert(photo: Photo)

    @Update
    fun update(photo: Photo)

    @Delete
    fun delete(photo: Photo)
}
