// Exercício: Soma dos Elementos

fun main(){

    //Array de inteiros
    val numbers = intArrayOf(5, 10, 15, 20, 25) //imutável
    var sum = 0 //variável para armazenar a soma // mutavel

    // Loop para somar os elementos do array
    for(number in numbers){

        sum += number
    }
    //Imprima o resultado
    println("A soma dos elementos é igual $sum")
}