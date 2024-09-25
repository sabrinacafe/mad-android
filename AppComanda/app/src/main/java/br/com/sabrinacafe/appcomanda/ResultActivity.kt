package br.com.sabrinacafe.appcomanda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class ResultActivity : AppCompatActivity() {
    private lateinit var resultadoTextView: TextView
    private lateinit var voltarBotao: Button
    private lateinit var coxinhaQuantidadeTextView: TextView
    private lateinit var bebidaQuantidadeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultadoTextView = findViewById(R.id.textViewResultado)
        voltarBotao = findViewById(R.id.backButton)
        coxinhaQuantidadeTextView = findViewById(R.id.textViewCoxinhaResult)
        bebidaQuantidadeTextView = findViewById(R.id.textViewBebidaResult)

        val coxinhaQuantitidade = intent.getIntExtra(lblCoxinha, 0)
        val bebidaQuantitidade = intent.getIntExtra(lblBebida, 0)

        val total = calculateTotal(coxinhaQuantitidade, bebidaQuantitidade)

        resultadoTextView.text = "Total a pagar: R$ $total"
        //     resultadoTextView.text = "Total a pagar: R$ %.2f".format(total)
        coxinhaQuantidadeTextView.text = "Quantidade de Coxinhas: $coxinhaQuantitidade"
        bebidaQuantidadeTextView.text = "Quantidade de Bebidas: $bebidaQuantitidade"

        voltarBotao.setOnClickListener {
            finish() // Volta para a tela anterior
        }

    }

    private fun calculateTotal(coxinhaQuantidade: Int, bebidaQuantidade: Int): Double {
        val coxinhaPrice = 10.0
        val bebidaPrice = 15.0
        val taxaServico = 0.10

        val totalCoxinha = coxinhaQuantidade * coxinhaPrice
        val totalBebida = bebidaQuantidade * bebidaPrice
        val subtotal = totalCoxinha + totalBebida
        val totalComTaxa = subtotal + (subtotal * taxaServico)

        return totalComTaxa
    }

    companion object {
        const val lblCoxinha = "lbl_coxinha"
        const val lblBebida = "lbl_bebida"
    }


}