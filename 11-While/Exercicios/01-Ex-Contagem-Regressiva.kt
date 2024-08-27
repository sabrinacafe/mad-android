//Contagem regressiva 
fun main(){

    println("Digite um número inteiro positivo: ")
    val input = readLine()//Solicitar e ler o número fornecido pelo o usuário

    if(input != null && input.isNotEmpty()){
        val numero = input.toInt()

        var contador = numero //iniciando o contador com o numero fornecido
        while (contador >= 1){// enquanto o contador for maior ou igual a 1
        println(contador) //imprime o valor atual do contador 
        contador--//Decrementa o contador em 1 a cada iteração
        }
    }
    else{println("Entrada Inválida")}
}