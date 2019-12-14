package com.example.trabalho

import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.AbsListView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var texto_um = texto1
        var texto_dois = texto2
        var botao = botao
        var saida = saida


        botao.setOnClickListener {

            var gasolina = texto_um.text.toString().toFloat()
            var alcool = texto_dois.text.toString().toFloat()

            if ( gasolina*0.7 > alcool) {
                Toast.makeText(this, "Gasolina", Toast.LENGTH_LONG).show()
                saida.text = "Gasolina"

            } else {
                Toast.makeText(this, "alcool", Toast.LENGTH_LONG).show()
                saida.text = "Gasolina"
            }

            Log.i("AULA", "CLIQUEI NO BOTAO")
        }
    }


}
