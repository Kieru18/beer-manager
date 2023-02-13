package com.beermanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.beermanager.dao.BeerDao

class MainActivity : AppCompatActivity() {
    private lateinit var beerDao: BeerDao
    private lateinit var db: BeerManagerDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = BeerManagerDatabase.getDatabase(applicationContext)
        beerDao = db.beerDao()

        val beers = beerDao.getAll()
        Log.d("MainActivity", "Beers: $beers")
    }
}
