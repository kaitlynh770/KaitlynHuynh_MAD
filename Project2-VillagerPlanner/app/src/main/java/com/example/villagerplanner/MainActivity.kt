package com.example.villagerplanner

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import org.w3c.dom.Text
import android.widget.ListView as ListView1

class MainActivity : AppCompatActivity() {

    private var villagerDisplayed = VillagerTraits()
    private val REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView1>(R.id.main_listView)
        val neutralColor = Color.parseColor("#FAF6E9")


        listView.setBackgroundColor(neutralColor)


        listView.adapter = MyCustomAdapter(this)

        listView.setOnItemClickListener { parent, view, position, id ->
            if(position == 0){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 1){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 2){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 3){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 4){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 5){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 6){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 7){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 8){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 9){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 10){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 11){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 12){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 13){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 14){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 15){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 16){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 17){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 18){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 19){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 20){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 21){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 22){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 23){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 24){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 25){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)

                startActivityForResult(intent, REQUEST_CODE);

            }
            if(position == 26){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 27){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 28){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
            if(position == 29){
                villagerDisplayed.setVillagerValues(position)

                val intent = Intent(this, villager::class.java)
                intent.putExtra("name", villagerDisplayed.villagerName);
                intent.putExtra("type", villagerDisplayed.villagerType);
                intent.putExtra("species", villagerDisplayed.villagerSpecies);
                intent.putExtra("phrase", villagerDisplayed.villagerPhrase);
                intent.putExtra("birthday", villagerDisplayed.villagerBirthday);
                intent.putExtra("skill", villagerDisplayed.villagerSkill);
                intent.putExtra("goal", villagerDisplayed.villagerGoal);
                intent.putExtra("song", villagerDisplayed.villagerSong);
                intent.putExtra("songUrl", villagerDisplayed.villagerSongUrl);
                intent.putExtra("image", villagerDisplayed.villagerImage)


                startActivityForResult(intent, REQUEST_CODE);
            }
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