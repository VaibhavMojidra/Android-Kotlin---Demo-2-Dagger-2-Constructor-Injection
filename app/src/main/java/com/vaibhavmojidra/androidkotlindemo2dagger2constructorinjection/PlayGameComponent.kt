package com.vaibhavmojidra.androidkotlindemo2dagger2constructorinjection

import dagger.Component

@Component
interface PlayGameComponent {
    fun getPlayGame() : PlayGame
}