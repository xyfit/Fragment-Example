package com.one.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.one.fragmentexample.R
import com.one.recyclerview.models.UsersModel

class UserAdapter(val baseList: List<UsersModel>): RecyclerView.Adapter<UserAdapter.ItemHolder>() {
    inner class ItemHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {// item layout (shablon) briktirish
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item_ly, parent, false)// LayoutInflater-> xml item layoutni view a o'griw
       return ItemHolder(view)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {// itemlayoutga (shablonga) malumotlarni joylash
        val itemDate = baseList[position]// chiziwdagi position
        holder.itemView.findViewById<ImageView>(R.id.img_id).setImageResource(itemDate.img)
        holder.itemView.findViewById<TextView>(R.id.title_text).text = itemDate.title
        holder.itemView.findViewById<TextView>(R.id.message_text).text = itemDate.message
    }

    override fun getItemCount(): Int {// recycler view uzunligi (shablonlar soni)
       return baseList.size
    }
}