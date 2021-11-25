package com.example.menus

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var clMain: ConstraintLayout
    private lateinit var tvZero: TextView

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clMain = findViewById(R.id.clMain)
        tvZero = findViewById(R.id.tvZero)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuPlus -> {
                counter++
                tvZero.text = counter.toString()
            }
            R.id.menuMinus -> {
                counter--
                tvZero.text = counter.toString()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}