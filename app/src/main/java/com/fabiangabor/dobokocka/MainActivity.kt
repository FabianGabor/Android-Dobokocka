package com.fabiangabor.dobokocka

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dobasGomb: Button = findViewById(R.id.button)

        dobasGomb.setOnClickListener {
            kockaDobas()
            val toast = Toast.makeText(this, "A dobas megtortent!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun kockaDobas() {
        val dobokocka = Kocka(6)
        val kockaErtek = dobokocka.dobas()
        val eredmenySzoveg: TextView = findViewById(R.id.textView)
        eredmenySzoveg.text = kockaErtek.toString()
    }
}

class Kocka (val oldalak:Int){

    fun dobas():Int {
        val randomNum = (1..this.oldalak).random()
        return (randomNum)
    }
}