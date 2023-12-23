package com.danielcazorro.ciclodevida

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        const val VECES_ON_CREATE = "VECES_ON_CREATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("CicloDeVida", "onCreate")

        val vecesOnCreate = chargeFromPreferences()
        Log.w("CicloDeVida", "vecesOnCreate = $vecesOnCreate")
        saveInPreferences(vecesOnCreate + 1)
    }

    // Función simplificada para cargar desde preferencias
    fun chargeFromPreferences() = getPreferences(Context.MODE_PRIVATE).getInt(VECES_ON_CREATE, 0)

    // Función simplificada para guardar en preferencias
    fun saveInPreferences(vecesOnCreate: Int) =
        getPreferences(Context.MODE_PRIVATE).edit().apply {
            putInt(VECES_ON_CREATE, vecesOnCreate + 1)
            apply()
        }

    // Resto de métodos del ciclo de vida
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
