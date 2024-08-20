//Exerccio: Maior e Menor Elemento

fun main(){

    //Array de inteiros
    val numbers = intArrayOf(8, 3, 12, 6, 20)
    var min = numbers[0] // Variável para armazenar o menor elemento
    var max = numbers[0] // Variável para armazenar o maior elemento

    //Loop para encontrar o menor e maior elemento
    for (number in numbers){
        if (number < min){
            min = number
        }
        if (number > max){
            max = number
        }
    }
    println("O elemento é $min")
    println("O elemento é $max")

}