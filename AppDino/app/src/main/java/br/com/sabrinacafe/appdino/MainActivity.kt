package br.com.mvalbuquerque.appdino

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import br.com.sabrinacafe.appdino.R

class MainActivity : AppCompatActivity() {

    //Variáveis para armazenar as referências das Views (ImageView e Botões)
    private lateinit var imagem: ImageView //imageview
    private lateinit var btn1: Button // o resto botões
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Define o layout da Activity

        //Inicializando as Views usando findViewById
        imagem = findViewById(R.id.imagem)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)

        //Associando os botões à função cliqueBotão
        btn1.setOnClickListener { cliqueBotao(it) }
        btn2.setOnClickListener { cliqueBotao(it) }
        btn3.setOnClickListener { cliqueBotao(it) }
    }
    // Função que chamada quando algum botão é clicado
    fun cliqueBotao(view: View) {
        when(view.id) {

            //Atualiza a imagem no ImageView usando findViewById
            R.id.btn1 -> imagem.setImageResource(R.drawable.dino1)
            R.id.btn2 -> imagem.setImageResource(R.drawable.dino2)
            R.id.btn3 -> imagem.setImageResource(R.drawable.dino3)
        }
    }
}