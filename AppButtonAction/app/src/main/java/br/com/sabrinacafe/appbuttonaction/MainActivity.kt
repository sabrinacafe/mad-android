//Declarando o pacote onde esta a classe localizada do app ou budleid
package br.com.sabrinacafe.appbuttonaction

//Importando as bibliotecas necessárias para este aplicativo
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Define o layout da tela usandi o arquivo de layout que é o activity_main.xml
        setContentView(R.layout.activity_main)

        //Encontra o botão na interface do usuário utilizando o ID button
        val button = findViewById<Button>(R.id.button)

        //Encontra o textView
        val textView = findViewById<TextView>(R.id.textView)

        //Definindo ouvinte de clique para o botão
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view : View) {

                val message = "Você pressiono o Botão"
                //Ação a ser executada quando o botão for clicado

                //Mostra a informação na view
                textView.text = message

                // O toast é mostrado no momento que eu faço isso
                showToast(message)
            }
        })
    }

        //Função que exibe a mensagem em um toast

        private fun showToast(message: String) {
            //Criar um objeto toast para exibir a mensagem
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
}