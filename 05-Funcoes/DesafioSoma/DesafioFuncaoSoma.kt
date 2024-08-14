// Desafio Soma de Dois Quadrados

fun somaDosQuadrados(a: Int, b: Int) : Int {

    //Calcula o quadrado de  'a' e armazena o resultado na variável 'quadradoA'

    val quadradoA = a * a
    val quadradoB = b * b 
    return quadradoA + quadradoB

}

fun main(){
    val numeroA = 5
    val numeroB = 4

    val resultado = somaDosQuadrados(numeroA, numeroB)

    println("A soma dos quadrados dos números $numeroA e $numeroB é igual $resultado")
}