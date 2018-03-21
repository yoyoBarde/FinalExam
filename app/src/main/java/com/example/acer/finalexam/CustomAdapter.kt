package com.example.acer.finalexam

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by acer on 3/21/2018.
 */
class CustomAdapter(val albumList:ArrayList<Album_Model>,context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    var mcontext=context
    override fun getItemCount(): Int {
        return albumList.size
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val albumName= itemView.findViewById<TextView>(R.id.albumName_tv)
        val artistName= itemView.findViewById<TextView>(R.id.artistName_tv)
        val albumImage = itemView.findViewById<ImageView>(R.id.albumImage)

    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.album_item,parent,false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val album:Album_Model = albumList[position]
        holder?.albumName?.text = album.albumTitle
        holder?.artistName?.text = album.artistName
       // val pokemonImage = holder?.pokeImage
       // Picasso.with(mcontext).load(pokemon.pokeImage).into(pokemonImage)



    }
}