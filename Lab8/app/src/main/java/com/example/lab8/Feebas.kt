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
import com.example.lab8.databinding.ActivityFeebasBinding

class Feebas : AppCompatActivity() {

  //  private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityFeebasBinding

    lateinit var feebasTextView: TextView
    private var pokemonSpecies: String? = null
    private var pokemonUrl: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFeebasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        feebasTextView = findViewById(R.id.feebasString)

        pokemonSpecies = intent.getStringExtra("pokemonSpecies")
        pokemonUrl = intent.getStringExtra("pokemonUrl")

        pokemonSpecies?.let { feebasTextView.text = "Wow, you found the elusive $pokemonSpecies! This is the rarest Pokemon ever, congrats!" }

        binding.fab.setOnClickListener { view -> loadWebSite() }

//        val navController = findNavController(R.id.nav_host_fragment_content_feebas)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
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
//        val navController = findNavController(R.id.nav_host_fragment_content_feebas)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}