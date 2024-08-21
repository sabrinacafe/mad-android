fun main() {
    // Arrays com os números pares e ímpares
    val pares = arrayOf(0, 2, 4, 6)
    val impares = arrayOf(1, 3, 5, 7)

    // Array para armazenar as somas
    val somas = Array(pares.size) { 0 }

    // Realizando a soma dos elementos correspondentes
    for (i in pares.indices) {
        somas[i] = pares[i] + impares[i]
    }

    // Exibindo os resultados das somas
    for (i in somas.indices) {
        println("A soma de ${pares[i]} e ${impares[i]} é ${somas[i]}")
    }
}