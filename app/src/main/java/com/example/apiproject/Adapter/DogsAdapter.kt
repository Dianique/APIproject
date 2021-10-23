package com.example.apiproject.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.apiproject.R
import com.example.apiproject.model.dogApi
import com.squareup.picasso.Picasso

class DogsAdapter(val context: Context?, private val dogImages: ArrayList<dogApi>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(

    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
      val v = LayoutInflater.from(parent.context).inflate(R.layout.dog_images,parent,false)
        return ViewHolder(v)


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
     Picasso.get().load(dogImages[position].message).into(holder.itemView.dogShot) //Picasso is a image downloading library that renders photos from web service


    }

    override fun getItemCount(): Int {
        return dogImages.size

    }

    class ViewHolder(v: View?) : RecyclerView.ViewHolder(v!!), View.OnClickListener {

        override fun onClick(v: View?) {
            //create a function that allows for click onto RecyclerView
        }

        init {
            itemView.setOnClickListener(this)
        }
        val dogShot: ImageView = itemView.findViewById(R.id.dogPic)

    }

}