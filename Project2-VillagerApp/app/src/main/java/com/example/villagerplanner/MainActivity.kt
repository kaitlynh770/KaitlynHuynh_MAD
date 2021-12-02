package com.example.villagerplanner

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.mainListView)
        val neutralColor = Color.parseColor("#FAF6E9")
        listView.setBackgroundColor(neutralColor)

        listView.adapter = MyCustomAdapter(this) //something to render for the list
    }
    private class MyCustomAdapter(context: Context): BaseAdapter(){

        private val mContext: Context

        private val names = arrayListOf<String>(
            "Filbert", "Marshal", "Lolly", "Kiki", "Marty", "Zucker", "Marina", "Snake", "Fauna", "Wolfgang", "Apollo", "Bunnie", "Ruby", "Rosie", "Sherb", "Erik", "Camofrog", "Genji", "Lily", "Diana", "Merengue", "Nana", "Roald", "Stitches", "Tangy", "Aurora", "Beau", "Chester", "Daisy", "Dobie"
        )

        init{
            this.mContext = context
        }
        //responsible for how many rows are in my list
        override fun getCount(): Int {
            return names.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }
        //responsible for rendering out each row
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            val positionTextView = rowMain.findViewById<TextView>(R.id.shortDescription)
            positionTextView.text = "Row number: $position"

            val nameTextView = rowMain.findViewById<TextView>(R.id.name)
            nameTextView.text = names.get(position)

            return rowMain
        }
    }
}
