package simple.gallery.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import simple.gallery.R
import simple.gallery.model.AlbumModel

class AlbumsGridAdapter(private val list: List<AlbumModel>): BaseAdapter(){
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.grid_item, parent, false)
        val textViewContent=view.findViewById<TextView>(R.id.textViewContent)
        val textViewTitle=view.findViewById<TextView>(R.id.textViewTitle)
        return view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }
}