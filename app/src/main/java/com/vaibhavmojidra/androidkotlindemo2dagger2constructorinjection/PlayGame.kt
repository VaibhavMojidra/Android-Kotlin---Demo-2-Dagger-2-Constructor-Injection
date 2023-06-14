package com.vaibhavmojidra.androidkotlindemo2dagger2constructorinjection

import android.util.Log
import javax.inject.Inject

class PlayGame @Inject constructor(val smartphone: Smartphone, val internet: Internet, val game: Game) {
    init {
        Log.i("MyTag","Play Game Constructed")
    }

    fun playGame(){
        smartphone.isPowerAvailable();
        internet.isInternetAvailable();
        game.isDownloaded();
        Log.i("MyTag","Start playing game")
    }
}