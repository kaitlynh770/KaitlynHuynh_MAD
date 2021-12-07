package com.example.villagerplanner

data class VillagerTraits(var villagerName: String = "", var villagerType: String = "", var villagerSpecies: String = "", var villagerBirthday: String = "", var villagerPhrase: String = "", var villagerSkill: String = "", var villagerGoal: String = "", var villagerSong: String = "", var villagerSongUrl: String = "", var villagerImage: Int? = null){
    fun setVillagerValues(villagerId: Int){
        setVillagerName(villagerId)
        setVillagerType(villagerId)
        setVillagerSpecies(villagerId)
        setVillagerBirthday(villagerId)
        setVillagerPhrase(villagerId)
        setVillagerSkill(villagerId)
        setVillagerGoal(villagerId)
        setVillagerSong(villagerId)
        setVillagerSongUrl(villagerId)
        setVillagerImage(villagerId)
    }
    private fun setVillagerName(villagerId: Int){
        when(villagerId){
            0 -> villagerName = "Filbert"
            1 -> villagerName = "Marshal"
            2 -> villagerName = "Lolly"
            3 -> villagerName = "Kiki"
            4 -> villagerName = "Marty"
            5 -> villagerName = "Zucker"
            6 -> villagerName = "Marina"
            7 -> villagerName = "Snake"
            8 -> villagerName = "Fauna"
            9 -> villagerName = "Wolfgang"
            10 -> villagerName = "Apollo"
            11 -> villagerName = "Bunnie"
            12 -> villagerName = "Ruby"
            13 -> villagerName = "Rosie"
            14 -> villagerName = "Sherb"
            15 -> villagerName = "Erik"
            16 -> villagerName = "Camofrog"
            17 -> villagerName = "Genji"
            18 -> villagerName = "Lily"
            19 -> villagerName = "Diana"
            20 -> villagerName = "Merengue"
            21 -> villagerName = "Nana"
            22 -> villagerName = "Roald"
            23 -> villagerName = "Stitches"
            24 -> villagerName = "Tangy"
            25 -> villagerName = "Aurora"
            26 -> villagerName = "Beau"
            27 -> villagerName = "Chester"
            28 -> villagerName = "Daisy"
            29 -> villagerName = "Dobie"
        }
    }
    private fun setVillagerType(villagerId: Int){
        when(villagerId){
            0 -> villagerType = "Lazy"
            1 -> villagerType = "Smug"
            2 -> villagerType = "Normal"
            3 -> villagerType = "Normal"
            4 -> villagerType = "Lazy"
            5 -> villagerType = "Lazy"
            6 -> villagerType = "Normal"
            7 -> villagerType = "Jock"
            8 -> villagerType = "Normal"
            9 -> villagerType = "Cranky"
            10 -> villagerType = "Cranky"
            11 -> villagerType = "Peppy"
            12 -> villagerType = "Peppy"
            13 -> villagerType = "Peppy"
            14 -> villagerType = "Lazy"
            15 -> villagerType = "Lazy"
            16 -> villagerType = "Cranky"
            17 -> villagerType = "Jock"
            18 -> villagerType = "Normal"
            19 -> villagerType = "Snooty"
            20 -> villagerType = "Normal"
            21 -> villagerType = "Normal"
            22 -> villagerType = "Jock"
            23 -> villagerType = "Lazy"
            24 -> villagerType = "Peppy"
            25 -> villagerType = "Normal"
            26 -> villagerType = "Lazy"
            27 -> villagerType = "Lazy"
            28 -> villagerType = "Normal"
            29 -> villagerType = "Cranky"
        }
    }
    private fun setVillagerSpecies(villagerId: Int){
        when(villagerId){
            0 -> villagerSpecies = "Squirrel"
            1 -> villagerSpecies = "Squirrel"
            2 -> villagerSpecies = "Cat"
            3 -> villagerSpecies = "Cat"
            4 -> villagerSpecies = "Cub"
            5 -> villagerSpecies = "Octopus"
            6 -> villagerSpecies = "Octopus"
            7 -> villagerSpecies = "Rabbit"
            8 -> villagerSpecies = "Deer"
            9 -> villagerSpecies = "Wolf"
            10 -> villagerSpecies = "Eagle"
            11 -> villagerSpecies = "Rabbit"
            12 -> villagerSpecies = "Rabbit"
            13 -> villagerSpecies = "Cat"
            14 -> villagerSpecies = "Goat"
            15 -> villagerSpecies = "Deer"
            16 -> villagerSpecies = "Frog"
            17 -> villagerSpecies = "Rabbit"
            18 -> villagerSpecies = "Frog"
            19 -> villagerSpecies = "Deer"
            20 -> villagerSpecies = "Rhino"
            21 -> villagerSpecies = "Monkey"
            22 -> villagerSpecies = "Penguin"
            23 -> villagerSpecies = "Cub"
            24 -> villagerSpecies = "Cat"
            25 -> villagerSpecies = "Penguin"
            26 -> villagerSpecies = "Deer"
            27 -> villagerSpecies = "Cub"
            28 -> villagerSpecies = "Dog"
            29 -> villagerSpecies = "Wolf"
        }
    }
    private fun setVillagerBirthday(villagerId: Int){
        when(villagerId){
            0 -> villagerBirthday = "June 3rd (Gemini)"
            1 -> villagerBirthday = "September 29th (Libra)"
            2 -> villagerBirthday = "March 27th (Aries)"
            3 -> villagerBirthday = "October 8th (Libra)"
            4 -> villagerBirthday = "April 16th (Aries)"
            5 -> villagerBirthday = "March 8th (Pisces)"
            6 -> villagerBirthday = "June 26th (Cancer)"
            7 -> villagerBirthday = "November 3rd (Scorpio)"
            8 -> villagerBirthday = "March 26th (Aries)"
            9 -> villagerBirthday = "November 25th (Sagittarius)"
            10 -> villagerBirthday = "July 4th (Cancer)"
            11 -> villagerBirthday = "May 9th (Taurus)"
            12 -> villagerBirthday = "December 25th (Capricorn)"
            13 -> villagerBirthday = "February 27th (Pisces)"
            14 -> villagerBirthday = "January 18th (Capricorn)"
            15 -> villagerBirthday = "July 27th (Leo)"
            16 -> villagerBirthday = "June 5th (Gemini)"
            17 -> villagerBirthday = "January 21st (Aquarius)"
            18 -> villagerBirthday = "February 4th (Aquarius)"
            19 -> villagerBirthday = "January 4th (Capricorn)"
            20 -> villagerBirthday = "March 19th (Pisces)"
            21 -> villagerBirthday = "August 23rd (Virgo)"
            22 -> villagerBirthday = "January 5th (Capricorn)"
            23 -> villagerBirthday = "February 10th (Aquarius)"
            24 -> villagerBirthday = "June 17th (Gemini)"
            25 -> villagerBirthday = "January 27th (Aquarius)"
            26 -> villagerBirthday = "April 5th (Aries)"
            27 -> villagerBirthday = "August 6th (Leo)"
            28 -> villagerBirthday = "November 16th (Scorpio)"
            29 -> villagerBirthday = "February 17th (Aquarius)"
        }
    }
    private fun setVillagerPhrase(villagerId: Int){
        when(villagerId){
            0 -> villagerPhrase = "bucko"
            1 -> villagerPhrase = "sulky"
            2 -> villagerPhrase = "bonbon"
            3 -> villagerPhrase = "kitty cat"
            4 -> villagerPhrase = "pompom"
            5 -> villagerPhrase = "bloop"
            6 -> villagerPhrase = "blurp"
            7 -> villagerPhrase = "bunyip"
            8 -> villagerPhrase = "dearie"
            9 -> villagerPhrase = "snarrrl"
            10 -> villagerPhrase = "pah"
            11 -> villagerPhrase = "tee-hee"
            12 -> villagerPhrase = "li’l ears"
            13 -> villagerPhrase = "silly"
            14 -> villagerPhrase = "bawwww"
            15 -> villagerPhrase = "chow down"
            16 -> villagerPhrase = "ten-hut"
            17 -> villagerPhrase = "mochi"
            18 -> villagerPhrase = "toady"
            19 -> villagerPhrase = "no doy"
            20 -> villagerPhrase = "shortcake"
            21 -> villagerPhrase = "po po"
            22 -> villagerPhrase = "b-b-buddy"
            23 -> villagerPhrase = "stuffin'"
            24 -> villagerPhrase = "reeeeOWR"
            25 -> villagerPhrase = "b-b-baby"
            26 -> villagerPhrase = "saltlick"
            27 -> villagerPhrase = "rookie"
            28 -> villagerPhrase = "bow-WOW"
            29 -> villagerPhrase = "ohmmm"
        }
    }
    private fun setVillagerSkill(villagerId: Int){
        when(villagerId){
            0 -> villagerSkill = "Vaulting"
            1 -> villagerSkill = "Mental Math"
            2 -> villagerSkill = "Peeling Apples"
            3 ->villagerSkill = "Fishing"
            4 -> villagerSkill = "Hiding Shoes"
            5 -> villagerSkill = "Baton Twirling"
            6 -> villagerSkill = "Tongue Twisters "
            7 -> villagerSkill = "Playing jacks"
            8 -> villagerSkill = "Mental math"
            9 -> villagerSkill = "Memorizing stuff"
            10 -> villagerSkill = "Staying up late"
            11 -> villagerSkill = "Staying positive"
            12 -> villagerSkill = "Doing handstands"
            13 -> villagerSkill = "Karaoke"
            14 -> villagerSkill = "N/A"
            15 -> villagerSkill = "Playing horseshoes"
            16 -> villagerSkill = "Playing jacks"
            17 -> villagerSkill = "Subsistence living"
            18 -> villagerSkill = "Calligraphy"
            19 -> villagerSkill = "Playing poker"
            20 -> villagerSkill = "Doodling"
            21 -> villagerSkill = "Making crafts"
            22 -> villagerSkill = "Belly dancing"
            23 -> villagerSkill = "Forgetting stuff"
            24 -> villagerSkill = "Doing handstands"
            25 -> villagerSkill = "Making budgets"
            26 -> villagerSkill = "Staying awake"
            27 -> villagerSkill = "Trivia"
            28 -> villagerSkill = "Making budgets"
            29 -> villagerSkill = "Speed reading"
        }
    }
    private fun setVillagerGoal(villagerId: Int){
        when(villagerId){
            0 -> villagerGoal = "Pilot"
            1 -> villagerGoal = "Designer"
            2 -> villagerGoal = "Chef"
            3 -> villagerGoal = "Writer"
            4 -> villagerGoal = "Baker"
            5 -> villagerGoal = "Chef"
            6 -> villagerGoal = "Pharmacist"
            7 -> villagerGoal = "Soccer player"
            8 -> villagerGoal = "Teacher"
            9 -> villagerGoal = "Journalist"
            10 -> villagerGoal = "Pilot"
            11 -> villagerGoal = "Gymnast"
            12 -> villagerGoal = "Photography"
            13 -> villagerGoal = "Movie star"
            14 -> villagerGoal = "N/A"
            15 -> villagerGoal = "Carpenter"
            16 -> villagerGoal = "Pilot"
            17 -> villagerGoal = "Politician"
            18 -> villagerGoal = "Teacher"
            19 -> villagerGoal = "Dermatologist"
            20 -> villagerGoal = "Pastry chef"
            21 -> villagerGoal = "Judge"
            22 -> villagerGoal = "Pro golfer"
            23 -> villagerGoal = "Lawyer"
            24 -> villagerGoal = "Hair stylist"
            25 -> villagerGoal = "Doctor"
            26 -> villagerGoal = "Mayor"
            27 -> villagerGoal = "Teacher"
            28 -> villagerGoal = "Archaeologist"
            29 -> villagerGoal = "Writer"
        }
    }
    private fun setVillagerSong(villagerId: Int){
        when(villagerId){
            0 -> villagerSong = "Stale Cupcakes"
            1 -> villagerSong = "K.K. Bossa"
            2 -> villagerSong = "K.K. Bossa"
            3 -> villagerSong = "Only Me"
            4 -> villagerSong = "My Place"
            5 -> villagerSong = "Spring Blossoms"
            6 -> villagerSong = "Soulful K.K."
            7 -> villagerSong = "King K.K."
            8 -> villagerSong = "K.K. Stroll"
            9 -> villagerSong = "K.K. D&B"
            10 ->villagerSong = "K.K. Rock"
            11 -> villagerSong = "Forest Life"
            12 -> villagerSong = "Stale Cupcakes"
            13 -> villagerSong = "Bubblegum K.K."
            14 -> villagerSong = "Hypno K.K."
            15 -> villagerSong = "Drivin’"
            16 -> villagerSong = "K.K. Safari"
            17 -> villagerSong = "King K.K."
            18 -> villagerSong = "Farewell"
            19 -> villagerSong = "Farewell"
            20 -> villagerSong = "K.K. Ballad"
            21 -> villagerSong = "K.K. Ballad"
            22 -> villagerSong = "K.K. March"
            23 -> villagerSong = "I Love You"
            24 -> villagerSong = "I Love You"
            25 -> villagerSong = "Stale Cupcakes"
            26 -> villagerSong = "Mountain Song"
            27 -> villagerSong = "Imperial K.K."
            28 -> villagerSong = "Forest Life"
            29 -> villagerSong = "Agent K.K."
        }
    }
    private fun setVillagerSongUrl(villagerId: Int){
        when(villagerId){
            0 -> villagerSongUrl = "https://www.youtube.com/watch?v=4yzzxkSqcRU"
            1 -> villagerSongUrl = "https://www.youtube.com/watch?v=ruaa3NFdmJA&t"
            2 -> villagerSongUrl = "https://www.youtube.com/watch?v=ruaa3NFdmJA&t"
            3 -> villagerSongUrl = "https://www.youtube.com/watch?v=O3QTPztDea8"
            4 -> villagerSongUrl = "https://www.youtube.com/watch?v=d-VSaFJAUgU&t"
            5 -> villagerSongUrl = "https://www.youtube.com/watch?v=597_bfo0diE&t"
            6 -> villagerSongUrl = "https://www.youtube.com/watch?v=6hWWyExPRKE&t"
            7 -> villagerSongUrl = "https://www.youtube.com/watch?v=e8j8H3cN2cY"
            8 -> villagerSongUrl = "https://www.youtube.com/watch?v=8NQNFkwXH-Q"
            9 -> villagerSongUrl = "https://www.youtube.com/watch?v=FdXgEJqqb-8"
            10 ->villagerSongUrl = "https://www.youtube.com/watch?v=DUeZEyB1ZXk"
            11 -> villagerSongUrl = "https://www.youtube.com/watch?v=vUtdY-aOTrs"
            12 -> villagerSongUrl = "https://www.youtube.com/watch?v=4yzzxkSqcRU"
            13 -> villagerSongUrl = "https://www.youtube.com/watch?v=x4UaSRDehvA"
            14 -> villagerSongUrl = "https://www.youtube.com/watch?v=KCosa-nYo94"
            15 -> villagerSongUrl = "https://www.youtube.com/watch?v=HlGnmZYPJ50"
            16 -> villagerSongUrl = "https://www.youtube.com/watch?v=Zo4hETWqA5U"
            17 -> villagerSongUrl = "https://www.youtube.com/watch?v=e8j8H3cN2cY"
            18 -> villagerSongUrl = "https://www.youtube.com/watch?v=yqb8sH-b2J0"
            19 -> villagerSongUrl = "https://www.youtube.com/watch?v=yqb8sH-b2J0"
            20 -> villagerSongUrl = "https://www.youtube.com/watch?v=Frfu0D-wC3w"
            21 -> villagerSongUrl = "https://www.youtube.com/watch?v=Frfu0D-wC3w"
            22 -> villagerSongUrl = "https://www.youtube.com/watch?v=JU8v5hA4m0c"
            23 -> villagerSongUrl = "https://www.youtube.com/watch?v=bRsl3TB5Hu8"
            24 -> villagerSongUrl = "https://www.youtube.com/watch?v=bRsl3TB5Hu8"
            25 -> villagerSongUrl = "https://www.youtube.com/watch?v=4yzzxkSqcRU"
            26 -> villagerSongUrl = "https://www.youtube.com/watch?v=LHjTChAfe9A"
            27 -> villagerSongUrl = "https://www.youtube.com/results?search_query=imperial+kk+aircheck"
            28 -> villagerSongUrl = "https://www.youtube.com/watch?v=vUtdY-aOTrs"
            29 -> villagerSongUrl = "https://www.youtube.com/watch?v=YmOWOpcCoTg"
        }
    }
    private fun setVillagerImage(villagerId: Int){
        when(villagerId){
            0 -> villagerImage = R.drawable.filbert
            1 -> villagerImage = R.drawable.marshal
            2 -> villagerImage = R.drawable.lolly
            3 -> villagerImage = R.drawable.kiki
            4 -> villagerImage = R.drawable.marty
            5 -> villagerImage = R.drawable.zucker
            6 -> villagerImage = R.drawable.marina
            7 -> villagerImage = R.drawable.snake
            8 -> villagerImage = R.drawable.fauna
            9 -> villagerImage = R.drawable.wolfgang
            10 -> villagerImage = R.drawable.apollo
            11 -> villagerImage = R.drawable.bunnie
            12 -> villagerImage = R.drawable.ruby
            13 -> villagerImage = R.drawable.rosie
            14 -> villagerImage = R.drawable.sherb
            15 -> villagerImage = R.drawable.erik
            16 -> villagerImage = R.drawable.camofrog
            17 -> villagerImage = R.drawable.genji
            18 -> villagerImage = R.drawable.lily
            19 -> villagerImage = R.drawable.diana
            20 -> villagerImage = R.drawable.merengue
            21 -> villagerImage = R.drawable.nana
            22 -> villagerImage = R.drawable.roald
            23 -> villagerImage = R.drawable.stitches
            24 -> villagerImage = R.drawable.tangcon
            25 -> villagerImage = R.drawable.aurora
            26 -> villagerImage = R.drawable.beau
            27 -> villagerImage = R.drawable.chester
            28 -> villagerImage = R.drawable.daisy
            29 -> villagerImage = R.drawable.dobie
        }
    }
}
