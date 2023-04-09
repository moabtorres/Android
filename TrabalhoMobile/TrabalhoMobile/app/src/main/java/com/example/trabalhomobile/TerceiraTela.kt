package com.example.trabalhomobile

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.trabalhomobile.databinding.ActivitySegundaTelaBinding
import com.example.trabalhomobile.databinding.ActivityTerceiraTelaBinding

class TerceiraTela : AppCompatActivity() {

    private lateinit var binding: ActivityTerceiraTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.statusBarColor = Color.parseColor("#FFFFFF")

        binding.icVoltar.setOnClickListener {
            val VoltarSegundaTela = Intent(this, SegundaTela::class.java)
            startActivity(VoltarSegundaTela)



        }

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val mensagem = editText.text.toString()
            // Faça algo com a mensagem, como enviá-la para um servidor ou exibi-la em uma TextView

            // Limpa o texto da EditText
            editText.setText("")

            // Exibe uma mensagem de agradecimento
            val agradecimento = "Mensagem enviada com sucesso, obrigado!"
            Toast.makeText(this, agradecimento, Toast.LENGTH_SHORT).show()
        }

    }


    }
