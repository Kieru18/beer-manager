package com.beermanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

import com.beermanager.entities.Style

@Dao
interface StyleDao {
    @Query("SELECT * FROM styles")
    fun getAll(): List<Style>

    @Insert
    fun insert(style: Style)

    @Update
    fun update(style: Style)

    @Delete
    fun delete(style: Style)
}
