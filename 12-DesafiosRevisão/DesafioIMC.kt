import java.util.* //importa a classe Scanner do pacote java.util

fun main(){
    //Declarando variáveis
    val scanner = Scanner(System.`in`) //Cria um objeto Scanner para leitura de entrada do usuário
    var sair: Char //Declaração da variável 'sair' para armazenar a escolha de continuar ou sair

    // Utilizando o do while para que o usuário possa escolher se quer continuar no sistema 
    do {
        coletarDados() //Chama a função 'coletarDados' para obter informações do usuário
        println("Tecle [c] para continuar ou [s] para sair: ") //Exibe a mensagem para o usuário
        sair = scanner.next()[0]//Lê um caractere da entrada do usuário e atribui à variável 'sair'
    } while (sair != 's') // Repete o Loop enquanto o usuário não digitar 's' 
}

fun coletarDados(){
    //Definindo variáveis
    val scanner = Scanner(System.`in`) //Cria um objto Scanner para a leitura de entrada do usuário
    var peso: Float //Declaração da variável 'peso' para armazenar o peso informado pelo usuário
    var altura: Float //Deração da variável 'altura' para armazenar a altura informada pelo usuário

    //Interação com o usuário
    print("Qual seu peso? : ")//Exibe uma mensagem para o usuário
    peso = scanner.nextFloat()//Le o valor float da entrada do usuário e atrivui a peso
    print("Qual é a sua altura? : ")//Exibe uma mensagem para o usuário
    altura = scanner.nextFloat()
    var imc = peso / (altura * altura) //Calculo do IMC
    var imcFormatado = String.format("%.2f", imc)

    //Utiliza um bloco 'when' para determinar a categoria IMC e exibir a mensagem correspondente

    val indice = when {
    imc < 18.5 -> "Extrema magreza"
    imc in 18.5..24.9 -> "Peso Normal"
    imc in 25.0..29.9 -> "Excesso de Peso"
    imc in 30.0..34.9 -> "Obesidade Grau I"
    imc in 35.0..39.9 -> "Obesidade Grau II"
    imc >= 40 -> "Obesidade Grau III"
    else -> "Valor de IMC inválido"
}

    //Exibindo
    println("Seu IMC é $imcFormatado, portanto sua característica é $indice")
}