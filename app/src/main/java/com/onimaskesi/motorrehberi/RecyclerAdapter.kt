package com.onimaskesi.motorrehberi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_motorlar.view.*
import kotlinx.android.synthetic.main.recycler_row.view.*
import java.util.zip.Inflater

class RecyclerAdapter(val titleArray: ArrayList<String>, val gorselArray: ArrayList<Bitmap> , val textArray: ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.MotorlarViewHolder>() {

    class MotorlarViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorlarViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return  MotorlarViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return titleArray.size
    }

    override fun onBindViewHolder(holder: MotorlarViewHolder, position: Int) {

        var title = titleArray.get(position)
        var newtitle = ""
        for (harf in title){
            if(harf != ' '){
                newtitle = newtitle + harf
            }else{
                break
            }
        }
        holder.itemView.motorTextView.text = newtitle

        holder.itemView.setOnClickListener {
            SingletonClass.gorsel = gorselArray.get(position)
            var intent = Intent(holder.itemView.context, Motorlar::class.java)
            intent.putExtra("Title", titleArray.get(position))
            intent.putExtra("Text", textArray.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

}