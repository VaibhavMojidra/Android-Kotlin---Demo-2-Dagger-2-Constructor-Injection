package com.vaibhavmojidra.androidkotlindemo2dagger2constructorinjection

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor() {
    init {
        Log.i("MyTag","Internet Constructed")
    }

    fun isInternetAvailable(){
        Log.i("MyTag","Internet available")
    }
}