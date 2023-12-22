package com.danielcazorro.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("CicloDeVida", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("CicloDeVida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("CicloDeVida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("CicloDeVida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("CicloDeVida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("CicloDeVida", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("CicloDeVida", "onRestart")
    }
}