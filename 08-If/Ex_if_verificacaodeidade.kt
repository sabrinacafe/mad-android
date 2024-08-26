// Exercicio verificação de idade 
//Olhar a resolução do professor, pois precisa de tratamento de exceção

fun main(){

    println("Digite a sua idade: ")
    val idade = readLine()

    if (idade >=18) {
        println("Você é maior de idade")
    } else{
        println("Você é menor de idade")
    }
}