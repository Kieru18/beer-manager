package com.beermanager.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "styles")
data class Style(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "style_id")
    val styleId: Long,

    val name: String,

    val description: String?
)
