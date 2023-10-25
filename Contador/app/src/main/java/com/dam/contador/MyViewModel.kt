package com.dam.contador

import android.util.Log
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var num by mutableStateOf(0)
    var namee by mutableStateOf("")
    val numList = mutableListOf<Int>()


    fun funcionRandom() {

        num = (0..3).random()
         numList.add(num)

        Log.d("Tag", "Random")
    }


    fun getNumero(): Int {
        return num
    }
fun getLista():List<Int>{
    return numList
}
}
