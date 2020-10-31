package com.wahyuandhi.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val linLay = findViewById<LinearLayout>(R.id.linlay)

        btnReset.setOnClickListener {
            val tvHistory = TextView(this)
            tvHistory.text = values.toString()
            tvHistory.textSize = 30F
            linLay.addView(tvHistory)
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