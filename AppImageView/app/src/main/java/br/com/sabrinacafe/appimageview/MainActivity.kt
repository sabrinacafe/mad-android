package br.com.sabrinacafe.appimageview

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Declarando a variável que vai mostrar a imagem
        val imageView :ImageView = findViewById(R.id.imageView)

        //Declarando a variável que irá ter a ação do botão
        val btnAddImage: Button = findViewById(R.id.btnAddImage)

        //Ação do botão
        btnAddImage.setOnClickListener{
            imageView.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }
}