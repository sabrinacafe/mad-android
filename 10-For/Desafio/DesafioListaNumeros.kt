// Desafio: Calcular a soma dos números pares em uma lista de números.
//Criar uma lista de números e calcular a soma dos números pares.
fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numerosPares = mutableListOf<Int>()

    for (numero in numeros) {
        if (numero % 2 == 0) { //número é par com a condição if (numero % 2 == 0).
            numerosPares.add(numero)
        }
    }

    val somaPares = numerosPares.sum()
    println("A soma dos números pares é: $somaPares")
}