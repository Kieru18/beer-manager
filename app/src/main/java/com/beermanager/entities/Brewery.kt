package com.beermanager.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "breweries")
data class Brewery(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "brewery_id")
    val breweryId: Long,

    val name: String
)

