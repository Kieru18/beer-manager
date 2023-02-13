package com.beermanager.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "beers",
    foreignKeys = [
        ForeignKey(entity = Brewery::class,
            parentColumns = ["brewery_id"],
            childColumns = ["brewery_id"]),
        ForeignKey(entity = Style::class,
            parentColumns = ["style_id"],
            childColumns = ["style_id"])
    ])
data class Beer(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "beer_id")
    val beerId: Long,

    val name: String?,

    @ColumnInfo(name = "style_id")
    val styleId: Long?,

    @ColumnInfo(name = "brewery_id")
    val breweryId: Long?
)


