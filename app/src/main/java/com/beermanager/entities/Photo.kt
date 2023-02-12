package com.beermanager.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "photos",
    foreignKeys = [ForeignKey(entity = Beer::class,
        parentColumns = ["beer_id"],
        childColumns = ["beer_id"])])
data class Photo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "photo_id")
    val photoId: Long,

    @ColumnInfo(name = "beer_id")
    val beerId: Long?,

    val photo: ByteArray?
)
