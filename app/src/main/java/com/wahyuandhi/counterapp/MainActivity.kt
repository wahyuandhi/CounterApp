package com.wahyuandhi.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var values = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReset = findViewById<Button>(R.id.btn_reset)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        val btnUp = findViewById<Button>(R.id.btn_up)
        val btnDown = findViewById<Button>(R.id.btn_down)

        btnReset.setOnClickListener {
            reset()
            tvResult.text = values.toString()
        }

        btnUp.setOnClickListener {
            up()
            tvResult.text = values.toString()
        }

        btnDown.setOnClickListener {
            down()
            tvResult.text = values.toString()
        }
    }

    fun reset() {
        values = 0
    }
    fun up() {
        values++
    }
    fun down() {
        values--
    }
}