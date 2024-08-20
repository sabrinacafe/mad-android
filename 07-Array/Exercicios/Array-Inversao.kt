//Exercicio: Inversão de array

fun main(){

    //Array original
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val reversedArray = originalArray.reversedArray() //array invertido

    // array original : 1, 2, 3, 4, 5
    println("Array orinal: ${originalArray.joinToString()}")

    // array invertido : 5, 4, 3, 2, 1
    println("Array invertido: ${reversedArray.joinToString()}")

    //Exemplo como é utilizado A - Z, ou Z - A

}