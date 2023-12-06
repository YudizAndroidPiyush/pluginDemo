package com.example.plugindemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.mylibrary.MyActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        findViewById<Button>(R.id.clickButton).setOnClickListener {
            val myIntent = Intent(this, MyActivity::class.java)
            startActivity(myIntent)
        }
    }
}