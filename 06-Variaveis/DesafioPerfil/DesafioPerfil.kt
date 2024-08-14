fun main(){

    //Declaração de variáveis 

    println("Digite seu nome: ")
    val nome = readLine()!!.toString()
    println("Digite sua idade: ")
    val idade = readLine()!!.toInt()
    println("Digite seu email: ")
    val email = readLine()!!.toString()
    println("Digite se o usuário esta ativo (true/false): ")
    val status = readLine()!!.toBoolean()

    println("O usuário $nome de idade $idade, com o email $email está ativo no sistema")
}