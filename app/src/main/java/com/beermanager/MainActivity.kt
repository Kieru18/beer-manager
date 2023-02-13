package com.beermanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.beermanager.dao.BeerDao
import com.beermanager.entities.Beer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var database: BeerManagerDatabase
    private lateinit var beerDao: BeerDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize database and DAO
        database = BeerManagerDatabase.getInstance(this)
        beerDao = database.beerDao()

        // Launch coroutine to get all beers from the database
        CoroutineScope(Dispatchers.IO).launch {
            val beers = beerDao.getAll()
            withContext(Dispatchers.Main) {
                // Update UI with beers
                updateUI(beers)
            }
        }
    }

    private fun updateUI(beers: List<Beer>) {
        // Get reference to RecyclerView in activity_main.xml
        val recyclerView = findViewById<RecyclerView>(R.id.beer_recycler_view)

        // Create BeerAdapter with retrieved beers
        val adapter = BeerAdapter(beers)

        // Set adapter and layout manager for RecyclerView
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

