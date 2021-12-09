package com.example.villagerplanner

import android.content.Context
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.content.Intent as AndroidContentIntent
import android.widget.ListView as ListView1
import android.content.Intent
import android.telecom.Call.Details
import java.security.AccessControlContext
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {

    private var villagerDisplayed = VillagerTraits()
    private val REQUEST_CODE = 1
    lateinit var favoriteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView1>(R.id.main_listView)
        val neutralColor = Color.parseColor("#FAF6E9")


        listView.setBackgroundColor(neutralColor)

            listView.adapter = MyCustomAdapter(this)

            listView.setOnItemClickListener { parent, view, position, id ->
                if (position == 0) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 1) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 2) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 3) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 4) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 5) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 6) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 7) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 8) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 9) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 10) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 11) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 12) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 13) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 14) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 15) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 16) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 17) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 18) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 19) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 20) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 21) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 22) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 23) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 24) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 25) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 26) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 27) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 28) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
                if (position == 29) {
                    villagerDisplayed.setVillagerValues(position)

                    val intent = AndroidContentIntent(this, villager::class.java)
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
//            favoriteButton.setOnClickListener{
//                val intent = AndroidContentIntent(this, FavoriteList::class.java)
//                intent.putExtra("favoriteStatus", (listView.adapter as MyCustomAdapter).villagerRow.favorite)
//                intent.putExtra("index",(listView.adapter as MyCustomAdapter).index)
//                startActivityForResult(intent, REQUEST_CODE)
//            }
        }
    private class MyCustomAdapter(context: Context):BaseAdapter(){

        private val mContext: Context

        var villagerRow = VillagerListData()

//        var favoriteStatus: Boolean? = null
//
//        var isFavorited = false
//
//        var index: Int = -1

        private val names = arrayListOf<String>(
            "Filbert", "Marshal", "Lolly", "Kiki", "Marty", "Zucker", "Marina", "Snake", "Fauna", "Wolfgang", "Apollo", "Bunnie", "Ruby", "Rosie", "Sherb", "Erik", "Camofrog", "Genji", "Lily", "Diana", "Merengue", "Nana", "Roald", "Stitches", "Tangy", "Aurora", "Beau", "Chester", "Daisy", "Dobie"
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
            return names.size;
        }
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            villagerRow.setVillagerData(position);

            val nameTextView = rowMain.findViewById<TextView>(R.id.nameTextView)
            nameTextView.text = villagerRow.name;

            val villagerIcon = rowMain.findViewById<ImageView>(R.id.imageView)
            villagerIcon.setImageResource(villagerRow.icon!!)


            val descriptionTextView = rowMain.findViewById<TextView>(R.id.descriptionText)
            descriptionTextView.text = villagerRow.description

//            val favoriteVillager = rowMain.findViewById<ImageButton>(R.id.favoriteVillager)

//            favoriteVillager.setOnClickListener(View.OnClickListener {
//                if(!isFavorited){
//                    villagerRow.setStatus(true)
//                    favoriteVillager.setImageResource(R.drawable.star)
//                    isFavorited = true
//                }
//                else{
//                    villagerRow.setStatus(false)
//                    favoriteVillager.setImageResource(R.drawable.star_blank)
//                    isFavorited= false
//                }
//            })
//            index = position

            return rowMain
        }
    }
}