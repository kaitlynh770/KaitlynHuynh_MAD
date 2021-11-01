package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import pl.droidsonroids.gif.GifImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sayHello(view: android.view.View) {
        val helloText = findViewById<TextView>(R.id.squidMessage)
        val editName = findViewById<EditText>(R.id.editTextName)
        val name = editName.text
        helloText.text = "Hey, meet $name! She said hello!"

        val imageSquid = findViewById<ImageView>(R.id.imageView)
        imageSquid.setImageResource(R.drawable.ika)

    }
}