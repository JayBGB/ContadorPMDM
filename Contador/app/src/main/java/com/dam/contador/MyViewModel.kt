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
    private var appData = AppData()

    fun updateAppData(newData: AppData) {
        appData = newData
    }

    fun getNumero(): Int {
        return appData.num
    }

    fun getLista(): List<Int> {
        return appData.numList
    }

    fun funcionRandom() {
        val updatedData = appData.copy(num = (0..25).random())
        updatedData.numList.add(updatedData.num)
        appData = updatedData

    }

    fun updateName(newName: String) {
        val updatedData = appData.copy(name = newName)
        appData = updatedData
    }
}
