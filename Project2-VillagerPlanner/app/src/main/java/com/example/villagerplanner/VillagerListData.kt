package com.example.villagerplanner

data class VillagerListData(var name: String ="", var description:String =  "", var icon: Int? = null, var favorite: Boolean = false, var size: Int = 0){
    fun setVillagerData(position: Int){
        setName(position)
        setDescription(position)
        setIcon(position)
        setStatus(false)
        setNumberOfVillagers()
        getStatus(position)
    }
    private fun setName(position: Int){
        when(position){
            0 -> name = "Filbert"
            1 -> name = "Marshal"
            2 -> name = "Lolly"
            3 -> name = "Kiki"
            4 -> name = "Marty"
            5 -> name = "Zucker"
            6 -> name = "Marina"
            7 -> name = "Snake"
            8 -> name = "Fauna"
            9 -> name = "Wolfgang"
            10 -> name = "Apollo"
            11 -> name = "Bunnie"
            12 -> name = "Ruby"
            13 -> name = "Rosie"
            14 -> name = "Sherb"
            15 -> name = "Erik"
            16 -> name = "Camofrog"
            17 -> name = "Genji"
            18 -> name = "Lily"
            19 -> name = "Diana"
            20 -> name = "Merengue"
            21 -> name = "Nana"
            22 -> name = "Roald"
            23 -> name = "Stitches"
            24 -> name = "Tangy"
            25 -> name = "Aurora"
            26 -> name = "Beau"
            27 -> name = "Chester"
            28 -> name = "Daisy"
            29 -> name = "Dobie"
        }
    }
    private fun setDescription(position: Int){
        when(position){
            0 -> description = "A lazy squirrel"
            1 -> description = "A smug squirrel"
            2 -> description = "A normal cat"
            3 -> description = "A normal cat"
            4 -> description = "A lazy cub"
            5 -> description = "A lazy octopus"
            6 -> description = "A normal octopus"
            7 -> description = "A jock rabbit"
            8 -> description = "A normal deer"
            9 -> description = "A cranky wolf"
            10 -> description = "A cranky eagle"
            11 -> description = "A peppy rabbit"
            12 -> description = "A peppy rabbit"
            13 -> description = "A peppy cat"
            14 -> description = "A lazy goat"
            15 -> description = "A lazy deer"
            16 -> description = "A cranky frog"
            17 -> description = "A jock rabbit"
            18 -> description = "A normal frog"
            19 -> description = "A snooty deer"
            20 -> description = "A normal rhino"
            21 -> description = "A normal monkey"
            22 -> description = "A jock penguin"
            23 -> description = "A lazy cub"
            24 -> description = "A peppy cat"
            25 -> description = "A normal penguin"
            26 -> description = "A lazy deer"
            27 -> description = "A lazy cub"
            28 -> description = "A normal dog"
            29 -> description = "A cranky wolf"
        }
    }
    private fun setIcon(position: Int){
        when(position){
            0 -> icon = R.drawable.filcon
            1 -> icon = R.drawable.marshcon
            2 -> icon = R.drawable.lolscon
            3 -> icon = R.drawable.kicon
            4 -> icon = R.drawable.marcon
            5 -> icon = R.drawable.zuckcon
            6 -> icon = R.drawable.lolscon
            7 -> icon = R.drawable.snakecon
            8 -> icon = R.drawable.faunacon
            9 -> icon = R.drawable.wolfcon
            10 -> icon = R.drawable.apocon
            11 -> icon = R.drawable.buncon
            12 -> icon = R.drawable.rubycon
            13 -> icon = R.drawable.rosiecon
            14 -> icon = R.drawable.sherbcon
            15 -> icon = R.drawable.ericon
            16 -> icon = R.drawable.camocon
            17 -> icon = R.drawable.gencon
            18 -> icon = R.drawable.lilycon
            19 -> icon = R.drawable.diacon
            20 -> icon = R.drawable.mercon
            21 -> icon = R.drawable.nanacon
            22 -> icon = R.drawable.lolscon
            23 -> icon = R.drawable.stitchescon
            24 -> icon = R.drawable.tangcon
            25 -> icon = R.drawable.aurcon
            26 -> icon = R.drawable.beaucon
            27 -> icon = R.drawable.chescon
            28 -> icon = R.drawable.daiscon
            29 -> icon = R.drawable.dobiecon
        }
    }
    fun setStatus(favorited: Boolean){
        favorite = favorited;
    }
    private fun setNumberOfVillagers(){
        size = 30;
    }
    fun getStatus(position:Int): Boolean{
        return favorite;
    }
}
