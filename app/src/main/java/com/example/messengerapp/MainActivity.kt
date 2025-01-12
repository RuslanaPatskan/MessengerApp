package com.example.messengerapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_create_message) // Завантажує макет content_create_message.xml
        Log.d(tag, "MainActivity: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "MainActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "MainActivity: onDestroy")
    }
}
