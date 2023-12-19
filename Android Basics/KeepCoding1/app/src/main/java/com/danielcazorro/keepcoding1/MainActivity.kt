package com.danielcazorro.keepcoding1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Soy el println")
        Log.d("TAG", "Soy el log nivel d")
        Log.i("TAG", "Soy el log nivel i")
        Log.w("TAG", "Soy el log nivel w")
        Log.e("TAG", "Soy el log nivel e")
        Log.wtf("TAG", "Soy el log nivel wtf")

    }
}