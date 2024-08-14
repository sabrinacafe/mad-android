fun main(){

    println("Digite a nota da primeira avaliação: ")
    val nota1 = readLine()!!.toDouble()

    println("Digite a nota da segunda avaliação: ")
    val nota2 = readLine()!!.toDouble()

    println("Digite a nota da terceira avaliação: ")
    val nota3 = readLine()!!.toDouble()

    //Calculando a média escolar 
    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    // Formatando a média escolar
    println("A média é: $media ou $mediaFormatada")
}