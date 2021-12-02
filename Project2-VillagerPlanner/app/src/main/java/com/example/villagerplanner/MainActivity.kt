package com.example.villagerplanner

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val listView = findViewById<ListView>(R.id.main_listView)
        val neutralColor = Color.parseColor("#FAF6E9")
        listView.setBackgroundColor(neutralColor)

        listView.adapter = MyCustomAdapter(this)
        listView.setOnItemClickListener { parent, view, position, id ->
            if(position == 0){
                val intent = Intent(this, villager::class.java)
                startActivity(intent);
//                Toast.makeText(this@MainActivity,"Item One Clicked...", Toast.LENGTH_SHORT).show()
            }
//            if(position == 1){
//                Toast.makeText(this@MainActivity,"Item Two Clicked...", Toast.LENGTH_SHORT).show()
//            }
//            if(position == 2){
//                Toast.makeText(this@MainActivity,"Item Three Clicked...", Toast.LENGTH_SHORT).show()
//            }
        }
    }
    private class MyCustomAdapter(context: Context):BaseAdapter(){

        private val mContext: Context

        private val pictures = arrayListOf<Int>(
            R.drawable.filcon, R.drawable.marshcon, R.drawable.lolscon, R.drawable.kicon, R.drawable.marcon, R.drawable.zuckcon, R.drawable.maricon, R.drawable.snakecon, R.drawable.faunacon, R.drawable.wolfcon, R.drawable.apocon, R.drawable.buncon, R.drawable.rubycon, R.drawable.rosiecon, R.drawable.sherbcon, R.drawable.ericon, R.drawable.camocon, R.drawable.gencon, R.drawable.lilycon, R.drawable.diacon, R.drawable.mercon, R.drawable.nanacon, R.drawable.roaldcon, R.drawable.stitchescon, R.drawable.tangcon, R.drawable.aurcon, R.drawable.beaucon, R.drawable.chescon, R.drawable.daiscon, R.drawable.dobiecon
        )

        private val names = arrayListOf<String>(
            "Filbert", "Marshal", "Lolly", "Kiki", "Marty", "Zucker", "Marina", "Snake", "Fauna", "Wolfgang", "Apollo", "Bunnie", "Ruby", "Rosie", "Sherb", "Erik", "Camofrog", "Genji", "Lily", "Diana", "Merengue", "Nana", "Roald", "Stitches", "Tangy", "Aurora", "Beau", "Chester", "Daisy", "Dobie"
        )
        private val descriptions = arrayListOf<String>(
            "A lazy squirrel", "A smug squirrel", "A normal cat", "A normal cat", "A lazy cub", "A lazy octopus", "A normal octopus", "A jock rabbit", "A normal deer", "A cranky wolf", "A cranky eagle", "A peppy rabbit", "A peppy rabbit", "A peppy cat", "A lazy goat", "A lazy deer", "A cranky frog", "A jock rabbit", "A normal frog", "A snooty deer", "A normal rhino", "A normal monkey", "A jock penguin", "A lazy cub", "A peppy cat", "A normal penguin", "A lazy deer", "A lazy cub", "A normal dog", "A cranky wolf"

        )
        init{
            mContext = context
        }
        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return names.size
        }
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.nameTextView)
            nameTextView.text = names.get(position)

            val villagerIcon = rowMain.findViewById<ImageView>(R.id.imageView)
            villagerIcon.setImageResource(pictures[position])



            val descriptionTextView = rowMain.findViewById<TextView>(R.id.descriptionText)
            descriptionTextView.text = descriptions.get(position)
            return rowMain
        }
    }
}