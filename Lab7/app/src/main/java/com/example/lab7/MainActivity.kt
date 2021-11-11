package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var message: String = ""
    var present: String = ""
    var villagerName = ""
    var glutenText = ""
    var imageId: Int? = null

    lateinit var radioGroup: RadioGroup
    lateinit var description: TextView
    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var spinner: Spinner
    lateinit var switch: Switch
    lateinit var imageVillager: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        description = findViewById<TextView>(R.id.villagerDescription)
        checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        spinner = findViewById<Spinner>(R.id.spinner)
        switch = findViewById<Switch>(R.id.glutenSwitch)
        imageVillager = findViewById<ImageView>(R.id.villagerImage)

    }
    fun whichVillager(view: android.view.View ){

        var layoutRoot = findViewById<ConstraintLayout>(R.id.root_layout)

        val speciesId = radioGroup.checkedRadioButtonId //int

        if(speciesId == -1){
            val villagerSnackBar = Snackbar.make(layoutRoot, "Please select an animal", Snackbar.LENGTH_SHORT)
            villagerSnackBar.show()
        }
        else{
            var species = findViewById<RadioButton>(speciesId).text
            val villagerType = spinner.selectedItem.toString()
            if(species == "Bunny"){
                if(villagerType == "Lazy"){
                    imageId = R.drawable.sasha
                    if(checkBox1.isChecked && !checkBox2.isChecked){
                        if(switch.isChecked){
                            villagerName = "Sasha, the lazy rabbit"
                            present =  "He loves the flowers so much that he almost ate them!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "Sasha, the lazy rabbit"
                            present =  "He loves the flowers so much that he almost ate them!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && !checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "Sasha, the lazy rabbit"
                            present =  "But you got him trash! He can't eat this!"
                            glutenText = "who can only eat gluten-free food!"

                        }
                        else{
                            villagerName = "Sasha, the lazy rabbit"
                            present =  "But you got him trash! He can't eat this!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "Sasha, the lazy rabbit"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "Sasha, the lazy rabbit"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Smug"){
                    imageId = R.drawable.toby
                    if(checkBox1.isChecked && !checkBox2.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Toby, the smug rabbit"
                            present =  "He loves the flowers so much that he put them in his hair!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Toby, the smug rabbit"
                            present =  "He loves the flowers so much that he put them in his hair!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && !checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Toby, the smug rabbit"
                            present =  "But you got him trash, he shot you a dirty look!"
                            glutenText = "who can only eat gluten-free food!"

                        }
                        else{
                            villagerName = "You got Toby, the smug rabbit"
                            present =  "But you got him trash, he shot you a dirty look!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Toby, the smug rabbit"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Toby, the smug rabbit"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Normal"){
                    imageId = R.drawable.coco
                    if(checkBox1.isChecked && !checkBox2.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Coco, the normal rabbit"
                            present =  "She was shocked to see the flowers since she got the same exact ones for you too!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Coco, the normal rabbit"
                            present =  "She was shocked to see the flowers since she got the same exact ones for you too!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && !checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Coco, the normal rabbit"
                            present =  "You got her trash, she looks so unhappy! But since she's so nice, she accepts it anyway."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Coco, the normal rabbit"
                            present =  "You got her trash, she looks so unhappy! But since she's so nice, she accepts it anyway."
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Coco, the normal rabbit"
                            present =  "She doesn't know how to feel since she loves the flowers, but not the trash...."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Coco, the normal rabbit"
                            present =  "She doesn't know how to feel since she loves the flowers, but not the trash...."
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Peppy"){
                    imageId = R.drawable.bunnie
                    if(checkBox1.isChecked && !checkBox2.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Bunnie, the peppy rabbit"
                            present =  "She thinks you're her fan, so she takes the flowers as her first ever gift from a fan!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Bunnie, the peppy rabbit"
                            present =  "She thinks you're her fan, so she takes the flowers as her first ever gift from a fan!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && !checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Bunnie, the peppy rabbit"
                            present =  "Ahh trash?! She thinks you're a stalker and calls the cops!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Bunnie, the peppy rabbit"
                            present =  "Ahh trash?! She thinks you're a stalker and calls the cops!"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Bunnie, the peppy rabbit"
                            present =  "Yay flowers! But really, the trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Bunnie, the peppy rabbit"
                            present =  "Yay flowers! But really, the trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Snooty"){
                    imageVillager.setImageResource(R.drawable.francine)
                    if(checkBox1.isChecked && !checkBox2.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Francine, the snooty rabbit"
                            present =  "She accepts the flowers with grace and elegance"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Francine, the snooty rabbit"
                            present =  "She accepts the flowers with grace and elegance"
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && !checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Francine, the snooty rabbit"
                            present =  "She throws the trash back at you and glares. Yikes."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Francine, the snooty rabbit"
                            present =  "She throws the trash back at you and glares. Yikes."
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Francine, the snooty rabbit"
                            present =  "She graciously accepts the flowers and refuses to touch the trash. How fitting."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Francine, the snooty rabbit"
                            present =  "She graciously accepts the flowers and refuses to touch the trash. How fitting."
                            glutenText = ""
                        }
                    }
                }
                else if(villagerType == "Jock"){
                    imageId = R.drawable.snake
                    if(checkBox1.isChecked && !checkBox2.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Snake, the jock rabbit"
                            present =  "He tried to use the flowers for weightlifting but accidentally snapped them in half... "
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Snake, the jock rabbit"
                            present =  "He tried to use the flowers for weightlifting but accidentally snapped them in half... "
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && !checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Snake, the jock rabbit"
                            present =  "Trash?! Couldn't you at least have given him a protein shake? "
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Snake, the jock rabbit"
                            present =  "Trash?! Couldn't you at least have given him a protein shake? "
                            glutenText = ""
                        }
                    }
                    else if(checkBox2.isChecked && checkBox1.isChecked){
                        if(switch.isChecked){
                            villagerName = "You got Snake, the jock rabbit"
                            present =  "Thanks for the trash and flowers... he's just going to go to the garbage bin for no reason."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else{
                            villagerName = "You got Snake, the jock rabbit"
                            present =  "Thanks for the trash and flowers... he's just going to go to the garbage bin for no reason."
                            glutenText = ""
                        }
                    }
                }
            }
            else if(species == "Cat") {
                if (villagerType == "Lazy") {
                    imageId = R.drawable.bob
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Bob, the lazy cat"
                            present =  "He loves the flowers so much that he almost ate them!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Bob, the lazy cat"
                            present =  "He loves the flowers so much that he almost ate them!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Bob, the lazy cat"
                            present =  "But you got him trash! He can't eat this!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Bob, the lazy cat"
                            present =  "But you got him trash! He can't eat this!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Bob, the lazy cat"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Bob, the lazy cat"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Smug") {
                    imageId = R.drawable.raymond
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Raymond, the smug cat"
                            present =  "He loves the flowers so much that he put them in his hair!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Raymond, the smug cat"
                            present =  "He loves the flowers so much that he put them in his hair!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Raymond, the smug cat"
                            present =  "But you got him trash, he shot you a dirty look!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Raymond, the smug cat"
                            present =  "But you got him trash, he shot you a dirty look!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Raymond, the smug cat"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = "who can only eat gluten-free food!"

                        }
                        else {
                            villagerName = "Raymond, the smug cat"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Normal") {
                    imageId = R.drawable.kiki
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Kiki, the normal cat"
                            present =  "She was shocked to see the flowers since she got the same exact ones for you too!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Kiki, the normal cat"
                            present =  "She was shocked to see the flowers since she got the same exact ones for you too!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Kiki, the normal cat"
                            present =  "You got her trash, she looks so unhappy! But since she's so nice, she accepts it anyway."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Kiki, the normal cat"
                            present =  "You got her trash, she looks so unhappy! But since she's so nice, she accepts it anyway."
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Kiki, the normal cat"
                            present =  "She doesn't know how to feel since she loves the flowers, but not the trash..."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Kiki, the normal cat"
                            present =  "She doesn't know how to feel since she loves the flowers, but not the trash..."
                            glutenText = ""                        }
                    }
                }
                else if (villagerType == "Peppy") {
                    imageId = R.drawable.rosie
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Rosie, the peppy cat"
                            present =  "She thinks you're her fan, so she takes the flowers as her first ever gift from a fan!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Rosie, the peppy cat"
                            present =  "She thinks you're her fan, so she takes the flowers as her first ever gift from a fan!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Rosie, the peppy cat"
                            present =  "Ahh trash?! She thinks you're a stalker and calls the cops!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Rosie, the peppy cat"
                            present =  "Ahh trash?! She thinks you're a stalker and calls the cops!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Rosie, the peppy cat"
                            present =  "Yay flowers! But really, the trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Rosie, the peppy cat"
                            present =  "Yay flowers! But really, the trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Snooty") {
                    imageId = R.drawable.ankha
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Ankha, the snooty cat"
                            present =  "Yay flowers! She accepts the flowers with grace and elegance"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Ankha, the snooty cat"
                            present =  "Yay flowers! She accepts the flowers with grace and elegance"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Ankha, the snooty cat"
                            present =  "She throws the trash back at you and glares. Yikes."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Ankha, the snooty cat"
                            present =  "She throws the trash back at you and glares. Yikes."
                            glutenText = ""
                        }
                    } else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Ankha, the snooty cat"
                            present =  "She graciously accepts the flowers and refuses to touch the trash. How fitting."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Ankha, the snooty cat"
                            present =  "She graciously accepts the flowers and refuses to touch the trash. How fitting."
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Jock") {
                    imageId = R.drawable.kidcat
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Kid Cat, the snooty cat"
                            present =  "He tried to use the flowers for weightlifting but accidentally snapped them in half..."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Kid Cat, the snooty cat"
                            present =  "He tried to use the flowers for weightlifting but accidentally snapped them in half..."
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Kid Cat, the snooty cat"
                            present =  "Trash?! Couldn't you at least have given him a protein shake?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Kid Cat, the snooty cat"
                            present =  "Trash?! Couldn't you at least have given him a protein shake?"
                            glutenText = ""
                        }
                    } else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Kid Cat, the snooty cat"
                            present =  "Thanks for the trash and flowers... he's just going to go to the garbage bin for no reason."
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Kid Cat, the snooty cat"
                            present =  "Thanks for the trash and flowers... he's just going to go to the garbage bin for no reason."
                            glutenText = ""
                        }
                    }
                }
            }
            else if(species == "Squirrel") {
                if (villagerType == "Lazy") {
                    imageId = R.drawable.filbert
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Filbert, the lazy squirrel"
                            present =  "He loves the flowers so much that he almost ate them!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Filbert, the lazy squirrel"
                            present =  "He loves the flowers so much that he almost ate them!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Filbert, the lazy squirrel"
                            present =  "But you got him trash! He can't eat this!"
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Filbert, the lazy squirrel"
                            present =  "But you got him trash! He can't eat this!"
                            glutenText = ""
                        }
                    } else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Filbert, the lazy squirrel"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = "who can only eat gluten-free food!"
                       }
                        else {
                            villagerName = "Filbert, the lazy squirrel"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = ""
                        }
                    }
                } else if (villagerType == "Smug") {
                    imageId = R.drawable.marshal
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Marshal, the smug squirrel"
                            present =  "He loves the flowers so much that he put them in his hair!"
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Marshal, the smug squirrel"
                            present =  "He loves the flowers so much that he put them in his hair!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                    } else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Marshal, the smug squirrel"
                            present =  "But you got him trash, he shot you a dirty look!"
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Marshal, the smug squirrel"
                            present =  "But you got him trash, he shot you a dirty look!"
                            glutenText = ""
                        }
                    } else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Marshal, the smug squirrel"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Marshal, the smug squirrel"
                            present =  "He likes the flowers..but did you have to give him trash too?"
                            glutenText = ""

                        }
                    }
                } else if (villagerType == "Normal") {
                    imageId = R.drawable.poppy
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Poppy, the normal squirrel"
                            present =  "She was shocked to see the flowers since she got the same exact ones for you too!"
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Poppy, the normal squirrel"
                            present =  "She was shocked to see the flowers since she got the same exact ones for you too!"
                            glutenText = ""
                        }
                    } else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Poppy, the normal squirrel"
                            present =  "You got her trash, she looks so unhappy! But since she's so nice, she accepts it anyway."
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Poppy, the normal squirrel"
                            present =  "You got her trash, she looks so unhappy! But since she's so nice, she accepts it anyway."
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Poppy, the normal squirrel"
                            present =  "She doesn't know how to feel since she loves the flowers, but not the trash..."
                            glutenText = "who can only eat gluten-free food!"
                        } else {
                            villagerName = "Poppy, the normal squirrel"
                            present =  "She doesn't know how to feel since she loves the flowers, but not the trash..."
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Peppy") {
                    imageId = R.drawable.peanut
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Peanut, the peppy squirrel"
                            present =  "She thinks you're her fan, so she takes the flowers as her first ever gift from a fan!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Peanut, the peppy squirrel"
                            present =  "She thinks you're her fan, so she takes the flowers as her first ever gift from a fan!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Peanut, the peppy squirrel"
                            present =  "Ahh trash?! She thinks you're a stalker and calls the cops!"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Peanut, the peppy squirrel"
                            present =  "Ahh trash?! She thinks you're a stalker and calls the cops!"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Peanut, the peppy squirrel"
                            present =  "Yay flowers! But really, the trash too?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Peanut, the peppy squirrel"
                            present =  "Yay flowers! But really, the trash too?"
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Snooty") {
                    imageId = R.drawable.mint
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Mint, the snooty squirrel"
                            present =  "She accepts the flowers with grace and elegance"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Mint, the snooty squirrel"
                            present =  "She accepts the flowers with grace and elegance"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Mint, the snooty squirrel"
                            present =  "She throws the trash back at you and glares. Yikes."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Mint, the snooty squirrel"
                            present =  "She throws the trash back at you and glares. Yikes."
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Mint, the snooty squirrel"
                            present =  "She graciously accepts the flowers and refuses to touch the trash. How fitting."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Mint, the snooty squirrel"
                            present =  "She graciously accepts the flowers and refuses to touch the trash. How fitting."
                            glutenText = ""
                        }
                    }
                }
                else if (villagerType == "Jock") {
                    imageId = R.drawable.sheldon
                    if (checkBox1.isChecked && !checkBox2.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Sheldon, the jock squirrel"
                            present =  "He tried to use the flowers for weightlifting but accidentally snapped them in half..."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Sheldon, the jock squirrel"
                            present =  "He tried to use the flowers for weightlifting but accidentally snapped them in half..."
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && !checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Sheldon, the jock squirrel"
                            present =  "Trash?! Couldn't you at least have given him a protein shake?"
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Sheldon, the jock squirrel"
                            present =  "Trash?! Couldn't you at least have given him a protein shake?"
                            glutenText = ""
                        }
                    }
                    else if (checkBox2.isChecked && checkBox1.isChecked) {
                        if (switch.isChecked) {
                            villagerName = "Sheldon, the jock squirrel"
                            present =  "Thanks for the trash and flowers... he's just going to go to the garbage bin for no reason."
                            glutenText = "who can only eat gluten-free food!"
                        }
                        else {
                            villagerName = "Sheldon, the jock squirrel"
                            present =  "Thanks for the trash and flowers... he's just going to go to the garbage bin for no reason."
                            glutenText = ""
                        }
                    }
                }
            }
        }
        message = "You got $villagerName $glutenText $present"

        updateUI()
    }
    fun updateUI(){
        description.text = message
        imageId?.let { imageVillager.setImageResource(it) }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("message", message)
        imageId?.let { outState.putInt("image", it) }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        message = savedInstanceState.getString("message", "")
        imageId = savedInstanceState.getInt("image")
        updateUI()
    }
}