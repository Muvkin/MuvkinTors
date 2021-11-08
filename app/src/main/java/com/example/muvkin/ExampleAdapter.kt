package com.example.muvkin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ExampleAdapter : RecyclerView.Adapter<ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
     return ExampleViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
     )
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return 4
    }
}
class ExampleViewHolder(view: View) : RecyclerView.ViewHolder(view){

}