package com.example.lab8

import android.widget.ImageButton

data class Pokemon(var pokemonName: String = "", var url: String = ""){
    fun setTilePokemon(chosenTile: Int) {
        setPokemon(chosenTile)
        setPokemonUrl(chosenTile)
    }
    private fun setPokemon(chosenTile: Int){
        when(chosenTile) {
            1 -> pokemonName = "Magikarp"
            2 -> pokemonName = "Magikarp"
            3 -> pokemonName = "Feebas"
            4 -> pokemonName = "Magikarp"
        }
    }
    private fun setPokemonUrl(chosenTile: Int){
        when(chosenTile){
            1 -> url = "https://bulbapedia.bulbagarden.net/wiki/Magikarp_(Pok%C3%A9mon)"
            2 -> url = "https://bulbapedia.bulbagarden.net/wiki/Magikarp_(Pok%C3%A9mon)"
            3 -> url = "https://bulbapedia.bulbagarden.net/wiki/Feebas_(Pok%C3%A9mon)"
            4 -> url = "https://bulbapedia.bulbagarden.net/wiki/Magikarp_(Pok%C3%A9mon)"
        }
    }
}
