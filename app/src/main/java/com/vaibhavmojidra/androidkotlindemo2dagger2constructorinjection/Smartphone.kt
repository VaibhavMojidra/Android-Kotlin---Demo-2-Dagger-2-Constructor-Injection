package com.vaibhavmojidra.androidkotlindemo2dagger2constructorinjection

import android.util.Log
import javax.inject.Inject

class Smartphone @Inject constructor(val battery: Battery) {
    init {
        Log.i("MyTag","Smartphone Constructed")
    }

    fun isPowerAvailable(){
        battery.isPowerAvailable()
    }
}