package com.example.victoria2020

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHelloWorld.setOnClickListener {
            it.setBackgroundColor(Color.MAGENTA)
            btnHelloWorld.text = "Hello Romo!"
            Log.d("MyTag", "Entró al Listener")
            Toast.makeText(this, "Mi alerta", Toast.LENGTH_LONG).show()
        }

        btnNewActivity.setOnClickListener {
            Log.d("MyTag2", "Entró al segundo listener")
            val intent = Intent(this, SecondActivity::class.java).apply {

            }
            startActivity(intent)
        }

        btnStringAndInt.setOnClickListener {
            val intent = Intent(this, StringAndIntActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btn_IMC.setOnClickListener {
            val intent = Intent(this, IMC::class.java).apply {
            }
            startActivity(intent)
        }

        btnFighter.setOnClickListener {
            val intent = Intent(this, TimeFighter::class.java).apply {
            }
            startActivity(intent)
        }

        btnShake.setOnClickListener {
            val intent = Intent(this, ShakeActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btnPar.setOnClickListener {
            val intent = Intent(this, evenNumber::class.java).apply {
            }
            startActivity(intent)
        }

        btnLottie.setOnClickListener {
            val intent = Intent(this, LottieAnim::class.java).apply {
            }
            startActivity(intent)
        }

        btnDialogs.setOnClickListener {
            val intent = Intent(this, Dialogs::class.java).apply {
            }
            startActivity(intent)
        }

    }
}