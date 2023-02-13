package com.beermanager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.beermanager.entities.Beer

class BeerAdapter(private val beers: List<Beer>) :
    RecyclerView.Adapter<BeerAdapter.BeerViewHolder>() {

    class BeerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        private val breweryTextView: TextView = itemView.findViewById(R.id.brewery_text_view)
        private val styleTextView: TextView = itemView.findViewById(R.id.style_text_view)

        fun bind(beer: Beer) {
            nameTextView.text = beer.name
            breweryTextView.text = beer.breweryId.toString()
            styleTextView.text = beer.styleId.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.beer_item, parent, false)
        return BeerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeerViewHolder, position: Int) {
        holder.bind(beers[position])
    }

    override fun getItemCount(): Int {
        return beers.size
    }
}
