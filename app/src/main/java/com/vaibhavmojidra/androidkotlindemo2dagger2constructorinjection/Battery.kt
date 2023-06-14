package com.vaibhavmojidra.androidkotlindemo2dagger2constructorinjection

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {
    init {
        Log.i("MyTag","Battery Constructed")
    }

    fun isPowerAvailable(){
        Log.i("MyTag","Battery available")
    }
}