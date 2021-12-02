package com.example.villagerplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class villager : AppCompatActivity() {
    lateinit var villagerName: TextView
    lateinit var villagerType: TextView
    lateinit var villagerSpecies: TextView
    lateinit var villagerBirthday: TextView
    lateinit var villagerSkill: TextView
    lateinit var villagerGoal: TextView
    lateinit var villagerSong: TextView
    lateinit var villagerImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_villager)

        villagerName = findViewById(R.id.villagerName)
        villagerType = findViewById(R.id.villagerType)
        villagerSpecies = findViewById(R.id.villagerSpecies)
        villagerBirthday = findViewById(R.id.villagerBirthday)
        villagerSkill = findViewById(R.id.villagerSkill)
        villagerGoal = findViewById(R.id.villagerGoal)
        villagerSong = findViewById(R.id.villagerSong)
        villagerImage = findViewById(R.id.villagerImage)
    }
}