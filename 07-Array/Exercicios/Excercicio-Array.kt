fun main(){
    // Trabalahndo com Array (Vetores, Matrizes, Coleções, Listas)
    //Tipo de dado que permite armazenar multiplos valores e uma mesma variável
    // Obs.: 0 acesso dos elementos do Array é feito atrvés de um induce que começa em 0

    // Declaração de um Array
    // var nomeDaVariavel = arrayOf(valor, valor, valor)

    val idades = arrayOf(8, 36, 42) 

    // Acesso a uma posição especifica do array
    println("O registro Zero de idade é: ${idades[1]}")

    val alturas = FloatArray(256)

    //Outra forma de declaração e atribuição de valores a um Array
    alturas[0] = 1.71f // Posição 0
    alturas[1] = 1.62f // Posição 1
    alturas[2] = 1.53f // Posição 2
    alturas[3] = 1.84f
    alturas[4] = 1.92f

    //imprimindo o valor do primeiro registro de altura
    println("O registro ZERO de aluras é: %.2f".format(alturas[0]))
    println("O registro UM de aluras é: %.2f".format(alturas[1]))
    println("O registro DOIS de aluras é: %.2f".format(alturas[2]))

    //Outra forma de declaração de atribuição de valor de um Array
    val nome = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G') //char precisa ser aspas simples
    println("O último caracter de nome é: ${nome[6]}")

    //
    val empresa = "FIAP"
    println("Nome da empresa é ${empresa[0]}")

    //tamanho
    var tamanho: Int
    tamanho = nome.size
    println("Posição do último caractere de nome é: ${nome [tamanho - 1]}")

    //Nós temos três posições de memória sendo utilidadas
    println("Quantidade itens: ${idades.size}")

    //Qual é o peso do array em bytes
    println("Peso do array: ${idades.size * 4} bytes") //Um int possui 4 bytes de tamanho


}