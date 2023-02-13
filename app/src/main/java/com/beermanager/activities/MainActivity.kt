package com.beermanager.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.beermanager.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.search_button)
        searchButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        val allBeersButton = findViewById<Button>(R.id.all_beers_button)
        allBeersButton.setOnClickListener {
            val intent = Intent(this, AllBeersActivity::class.java)
            startActivity(intent)
        }
    }
}
