package com.example.day10lecture1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gotoNextActivity = findViewById<Button>(R.id.go_to_next_page)
        gotoNextActivity.setOnClickListener {
            // explicit intent
            // val intent = Intent(this , NextActivity::class.java)
            // implicit intent
            val intent = Intent(this , NextActivity::class.java)
            startActivity(intent)
            finish() // to close the current activity

        }
        val toastButton = findViewById<Button>(R.id.button2)
        toastButton.setOnClickListener {
            Toasty.info(this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
        }
        }
    }
