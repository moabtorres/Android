package com.example.trabalhomobile

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trabalhomobile.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.statusBarColor = Color.parseColor("#FFFFFF")

        binding.icVoltar.setOnClickListener {
            val VoltarTelaPrincipal = Intent(this, TelaPrincipal::class.java)
            startActivity(VoltarTelaPrincipal)
        }

        binding.icNavegar.setOnClickListener {
            val navegarTerceiraTela = Intent(this, TerceiraTela::class.java)
            startActivity(navegarTerceiraTela)
        }
    }
}