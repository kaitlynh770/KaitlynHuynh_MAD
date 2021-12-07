package com.example.villagerplanner

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class villager : AppCompatActivity() {


    lateinit var villagerName: TextView
    lateinit var villagerType: TextView
    lateinit var villagerSpecies: TextView
    lateinit var villagerPhrase: TextView
    lateinit var villagerBirthday: TextView
    lateinit var villagerSkill: TextView
    lateinit var villagerGoal: TextView
    lateinit var villagerSong: TextView
    lateinit var villagerImage: ImageView
    lateinit var fab: FloatingActionButton

    private var name: String? = null
    private var type: String? = null
    private var species: String? = null
    private var phrase: String? = null
    private var birthday: String? = null
    private var skill: String? = null
    private var goal: String? = null
    private var song: String? = null
    private var songUrl: String? = null
    private var picture: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_villager)

        villagerName = findViewById(R.id.villagerName)
        villagerType = findViewById(R.id.villagerType)
        villagerSpecies = findViewById(R.id.villagerSpecies)
        villagerPhrase = findViewById(R.id.villagerCatchphrase)
        villagerBirthday = findViewById(R.id.villagerBirthday)
        villagerSkill = findViewById(R.id.villagerSkill)
        villagerGoal = findViewById(R.id.villagerGoal)
        villagerSong = findViewById(R.id.villagerSong)
        villagerImage = findViewById(R.id.villagerImage)
        fab = findViewById(R.id.fab)

        name = intent.getStringExtra("name")
        type = intent.getStringExtra("type")
        species = intent.getStringExtra("species")
        phrase = intent.getStringExtra("phrase")
        birthday = intent.getStringExtra("birthday")
        skill = intent.getStringExtra("skill")
        goal = intent.getStringExtra("goal")
        song = intent.getStringExtra("song")
        songUrl = intent.getStringExtra("songUrl")
        picture = intent.getIntExtra("picture", -1);

        name?.let{villagerName.text = "$name"}
        type?.let{villagerType.text = "$type"}
        species?.let{villagerSpecies.text = "$species"}
        phrase?.let{villagerPhrase.text = "$phrase"}
        birthday?.let{villagerBirthday.text = "$birthday"}
        skill?.let{villagerSkill.text = "$skill"}
        goal?.let{villagerGoal.text = "$goal"}
        song?.let{villagerSong.text = "$song"}

        if(name == "Filbert"){
            villagerImage.setImageResource(R.drawable.filbert)
        }
        if(name == "Marshal"){
            villagerImage.setImageResource(R.drawable.marshal)
        }
        if(name == "Lolly"){
            villagerImage.setImageResource(R.drawable.lolly)
        }
        if(name == "Kiki"){
            villagerImage.setImageResource(R.drawable.kiki)
        }
        if(name == "Marty"){
            villagerImage.setImageResource(R.drawable.marty)
        }
        if(name == "Zucker"){
            villagerImage.setImageResource(R.drawable.zucker)
        }
        if(name == "Marina"){
            villagerImage.setImageResource(R.drawable.marina)
        }
        if(name == "Snake"){
            villagerImage.setImageResource(R.drawable.snake)
        }
        if(name == "Fauna"){
            villagerImage.setImageResource(R.drawable.fauna)
        }
        if(name == "Wolfgang"){
            villagerImage.setImageResource(R.drawable.wolfgang)
        }
        if(name == "Apollo"){
            villagerImage.setImageResource(R.drawable.apollo)
        }
        if(name == "Bunnie"){
            villagerImage.setImageResource(R.drawable.bunnie)
        }
        if(name == "Ruby"){
            villagerImage.setImageResource(R.drawable.ruby)
        }
        if(name == "Rosie"){
            villagerImage.setImageResource(R.drawable.rosie)
        }
        if(name == "Sherb"){
            villagerImage.setImageResource(R.drawable.sherb)
        }
        if(name == "Erik"){
            villagerImage.setImageResource(R.drawable.erik)
        }
        if(name == "Camofrog"){
            villagerImage.setImageResource(R.drawable.camofrog)
        }
        if(name == "Genji"){
            villagerImage.setImageResource(R.drawable.genji)
        }
        if(name == "Lily"){
            villagerImage.setImageResource(R.drawable.lily)
        }
        if(name == "Diana"){
            villagerImage.setImageResource(R.drawable.diana)
        }
        if(name == "Merengue"){
            villagerImage.setImageResource(R.drawable.merengue)
        }
        if(name == "Nana"){
            villagerImage.setImageResource(R.drawable.nana)
        }
        if(name == "Roald"){
            villagerImage.setImageResource(R.drawable.roald)
        }
        if(name == "Stitches"){
            villagerImage.setImageResource(R.drawable.stitches)
        }
        if(name == "Tangy"){
            villagerImage.setImageResource(R.drawable.tangy)
        }
        if(name == "Aurora"){
            villagerImage.setImageResource(R.drawable.aurora)
        }
        if(name == "Beau"){
            villagerImage.setImageResource(R.drawable.beau)
        }
        if(name == "Chester"){
            villagerImage.setImageResource(R.drawable.chester)
        }
        if(name == "Daisy"){
            villagerImage.setImageResource(R.drawable.daisy)
        }
        if(name == "Dobie"){
            villagerImage.setImageResource(R.drawable.dobie)
        }
        fab.setOnClickListener(){
            var intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = songUrl?.let{Uri.parse(songUrl)}

            startActivity(intent)
        }

    }

//    private fun loadWebSite(){
//        //create intent
//        var intent = Intent()
//        intent.action = Intent.ACTION_VIEW
//        intent.data = songUrl?.let{ Uri.parse(songUrl)}
//
//        // start activity
//        startActivity(intent)
//    }
}