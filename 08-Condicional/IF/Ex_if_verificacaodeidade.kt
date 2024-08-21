// Exercicio verificação de idade 
fun main(){

    println("Digite a sua idade: ")
    val idade = readLine()!!.toInt()

    if (idade >=18) {
        println("Você é maior de idade")
    } else{
        println("Você é menor de idade")
    }
}