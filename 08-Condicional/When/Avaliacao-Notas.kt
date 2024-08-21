// Avaliacao de notas 
fun main() {

    //Definindo a nota do aluno
    val nota = 85

    //Usando o when para avaliar o conceito de nota

    val conceito = when (nota){
        in 0...49 -> "F" //Se ferrou Muito
        in 50...59 -> "D" // Se ferrou Muito
        in 60...69 -> "C" // Se Ferrou Pouco
        in 70...79 -> "B" // Se deu Bem 
        in 80...100 -> "A" // Muito bem 
        else -> "Nota inválida"
    }

    //Exibindo 
    println("Sua nota foi: $conceito")
}