/*
package com.example.fragmentpro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main2.view.*
import kotlinx.android.synthetic.main.item.view.*

class CustomAdapter(context: Context,private val objects: Array<out String>, private val image : Array<out Int>) :
    ArrayAdapter<String>(context, R.layout.item, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)

        val l:LayoutInflater= LayoutInflater.from(context)
        val customView:View= l.inflate(R.layout.item,parent,false)

        customView.textView3.text = objects!![position]
        customView.imageView.setImageResource(image[position])

        return customView

    }
}

 */