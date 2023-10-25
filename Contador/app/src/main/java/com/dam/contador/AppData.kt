package com.dam.contador

data class AppData(
    val num: Int = 0,
    val name: String = "",
    val numList: MutableList<Int> = mutableListOf()
)
