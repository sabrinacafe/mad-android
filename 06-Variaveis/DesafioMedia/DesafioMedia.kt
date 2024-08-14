fun main(){
    
    val nota1 = 9.25
    val nota2 = 8.00
    val nota3 = 4.75

    //Calculando a média escolar 
    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    // Formatando a média escolar
    println("A média é: $media ou $mediaFormatada")
}