package com.example.lab8

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.lab8.databinding.ActivityMagikarpBinding
import org.w3c.dom.Text

class Magikarp : AppCompatActivity() {

   // private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMagikarpBinding
    lateinit var magikarpTextView: TextView
    private var pokemonSpecies: String? = null
    private var pokemonUrl: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMagikarpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

//        val navController = findNavController(R.id.nav_host_fragment_content_magikarp)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

        //view
        magikarpTextView = findViewById(R.id.magikarpString)

        pokemonSpecies = intent.getStringExtra("pokemonSpecies")
        pokemonUrl = intent.getStringExtra("pokemonUrl")

        pokemonSpecies?.let { magikarpTextView.text = "aww, you only found a boring old $pokemonSpecies :(" }

        binding.fab.setOnClickListener { view -> loadWebSite() }


    }
    private fun loadWebSite(){
        //create intent
        var intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.data = pokemonUrl?.let{ Uri.parse(pokemonUrl)}

        // start activity
        startActivity(intent)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_magikarp)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}