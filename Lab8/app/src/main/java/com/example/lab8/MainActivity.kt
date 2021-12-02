package com.example.lab8

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    lateinit var tile1Button: Button
    lateinit var tile2Button: Button
    lateinit var tile3Button: Button
    lateinit var tile4Button: Button



    private var whichPokemon = Pokemon()

    private val REQUEST_CODE = 1

    private var buttonId = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tile1Button = findViewById(R.id.tile1)
        tile2Button = findViewById(R.id.tile2)
        tile3Button = findViewById(R.id.tile3)
        tile4Button = findViewById(R.id.tile4)

        tile1Button.setOnClickListener{
            buttonId = 1
            whichPokemon.setTilePokemon(buttonId)
            Log.i("tile number", buttonId.toString())
            Log.i("pokemon name", whichPokemon.pokemonName);
            Log.i("pokemon name", whichPokemon.url);

            val intent = Intent(this, Magikarp::class.java)
            intent.putExtra("pokemonSpecies", whichPokemon.pokemonName);
            intent.putExtra("pokemonUrl", whichPokemon.url);

            startActivityForResult(intent, REQUEST_CODE)
        }
        tile2Button.setOnClickListener {
            buttonId = 2
            whichPokemon.setTilePokemon(buttonId)
            Log.i("pokemon name", whichPokemon.pokemonName);
            Log.i("pokemon name", whichPokemon.url);

            val intent = Intent(this, Magikarp::class.java)
            intent.putExtra("pokemonSpecies", whichPokemon.pokemonName);
            intent.putExtra("pokemonUrl", whichPokemon.url);

            startActivityForResult(intent, REQUEST_CODE)
        }
        tile3Button.setOnClickListener {
            buttonId = 3
            whichPokemon.setTilePokemon(buttonId)
            Log.i("pokemon name", whichPokemon.pokemonName);
            Log.i("pokemon name", whichPokemon.url);

            val intent = Intent(this, Feebas::class.java)
            intent.putExtra("pokemonSpecies", whichPokemon.pokemonName);
            intent.putExtra("pokemonUrl", whichPokemon.url);

            startActivityForResult(intent, REQUEST_CODE)
        }
        tile4Button.setOnClickListener {
            buttonId = 4
            whichPokemon.setTilePokemon(buttonId)
            Log.i("pokemon name", whichPokemon.pokemonName);
            Log.i("pokemon name", whichPokemon.url);

            val intent = Intent(this, Magikarp::class.java)
            intent.putExtra("pokemonSpecies", whichPokemon.pokemonName);
            intent.putExtra("pokemonUrl", whichPokemon.url);

            startActivityForResult(intent, REQUEST_CODE)
        }
    }
}