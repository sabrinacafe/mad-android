//Exercicio Detran
// Criar um programa que verifica se o usuário possui carteira de motorista ou não

fun main(){
    val idade = 25
    val possuiCarteiraDeMotorista = true //Ele possui

    //Verificar se a pessoa é maior de idade e se possui CNH

    if (idade >= 18 && possuiCarteiraDeMotorista){
        println("Voce pode dirigir legalmete")

    }else {
        println("Voce nao poderia dirigir legalmente")
    }

    val temIngresso = false
    val estaComCamisaDoTime = true
    //Verifica se a pessoa tem ingresso ou esta com a camisa do time
    if (tem ingresso || estaComCamisaDoTime){
        println("Voce pode entrar no stadio")
    }else {
        println("Voce nao pode entrar no estadio")
    }
}