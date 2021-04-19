package com.example.everisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.w("LifeCycle", "Entrei no Start, deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("LifeCycle","Entrei no Resume, pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifeCycle","PAUSE, a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("LifeCycle", "Stop a tela não está visivel mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LifeCycle", "RESTART a tela está retornando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("LifeCycle", "Destroy- Tela foi destruida")
    }
}