package com.example.plugindemo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        findViewById<Button>(R.id.clickButton).setOnClickListener {
            Log.d("TAG", "onCreate: HEREHREHEHREHR")
        }
    }
}