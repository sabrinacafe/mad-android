fun main(){

    println("Digite um número inteiro positivo: ")
    val numero = readLine()!!.toInt() //Solicita e lê o número fornecido pelo usuário

    var soma = 0 //Inicializando a variável soma
    var contador = 3 //Inicializando o contador com o primeiro multiplo de 3
    while (contador <= numero) {
        soma+= contador //adiciona o valor do contador a soma
        contador +3 //incrementa o contador de 3 para obter os próximos multiplo de 3
    }
    println("A soma múltiplos de 3 é: $soma")
}