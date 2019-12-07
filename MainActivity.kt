package com.example.trabalho1_calculo_combustivel

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        setSupportActionBar(toolbar)

        botao.setOnClickListener {
            var gas = gasolina.text.toString().toFloat()
            var al = alcool.text.toString().toFloat()
            if (gas * 0.7 > al) {
                resultado.setText("Álcool!")
            } else {
                resultado.setText("Gasolina!")
            }
            Log.i("AULA", "Fiz a conta!")
        }

    }
}