package com.vaibhavmojidra.androidkotlindemo2dagger2constructorinjection

import android.util.Log
import javax.inject.Inject

class Game @Inject constructor() {
    init {
        Log.i("MyTag","Game Constructed")
    }

    fun isDownloaded(){
        Log.i("MyTag","Game is downloaded")
    }
}