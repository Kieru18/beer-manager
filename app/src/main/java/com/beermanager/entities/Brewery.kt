package com.beermanager.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "breweries")
data class Brewery(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "brewery_id")
    @NotNull
    val breweryId: Long,

    val name: String
)

