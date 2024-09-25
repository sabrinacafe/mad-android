package br.com.sabrinacafe.appcomanda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

////Versão sem tratamento do erro.
//class MainActivity : AppCompatActivity() {
//    // Declarando as variáveis para os elementos da interface do usuário
//    private lateinit var coxinhaEditText: EditText
//    private lateinit var bebidaEditText: EditText
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Inicializando as variáveis com referências aos elementos da interface
//        coxinhaEditText = findViewById(R.id.editTextCoxinha)
//        bebidaEditText = findViewById(R.id.editTextBebida)
//
//        // Encontrando o botão de cálculo e definindo um ouvinte de clique
//        val calculateButton: Button = findViewById(R.id.calculateButton)
//        calculateButton.setOnClickListener {
//            // Chama a função para calcular e exibir o resultado
//            calculateAndShowResult()
//        }
//    }
//
//    // Função para calcular e mostrar o resultado
//    private fun calculateAndShowResult() {
//        // Obtendo a quantidade de coxinhas e bebidas inseridas como texto
//        val coxinhaQuantity = coxinhaEditText.text.toString().toInt()
//        val bebidaQuantity = bebidaEditText.text.toString().toInt()
//
//        // Criando uma intenção (intent) para iniciar a ResultActivity
//        val intent = Intent(this, ResultActivity::class.java)
//
//        // Passando as quantidades de coxinhas e bebidas como extras para a ResultActivity
//        intent.putExtra(ResultActivity.lblCoxinha, coxinhaQuantity)
//        intent.putExtra(ResultActivity.lblBebida, bebidaQuantity)
//
//        // Iniciando a ResultActivity com os extras
//        startActivity(intent)
//    }
//}


//Versão com tratamento do erro

class MainActivity : AppCompatActivity() {
    private lateinit var coxinhaEditText: EditText
    private lateinit var bebidaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coxinhaEditText = findViewById(R.id.editTextCoxinha)
        bebidaEditText = findViewById(R.id.editTextBebida)

        val calculateButton: Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener {
            calculateAndShowResult()
        }
    }

    private fun calculateAndShowResult() {
        val coxinhaInput = coxinhaEditText.text.toString()
        val bebidaInput = bebidaEditText.text.toString()

        if (coxinhaInput.isNotEmpty() && bebidaInput.isNotEmpty()) {
            val coxinhaQuantity = coxinhaInput.toInt()
            val bebidaQuantity = bebidaInput.toInt()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ResultActivity.lblCoxinha, coxinhaQuantity)
            intent.putExtra(ResultActivity.lblBebida, bebidaQuantity)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
        }
    }
}