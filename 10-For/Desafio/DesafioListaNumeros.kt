// Desafio: Calcular a soma dos números pares em uma lista de números
//Criar uma lista de números e calcular a soma dos números pares.
fun main(){

    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var soma = 0

    if (numeros % 2 == 0){
        val soma = Array(numeros.size) { 0 }
    }

     // Realizando a soma dos elementos correspondentes
    for (i in pares.indices) {
        soma[i] += numeros[i] 
    }

    println("A soma de todos numeros pares da lista é: $soma")


}