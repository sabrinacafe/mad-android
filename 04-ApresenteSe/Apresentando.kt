fun main(){

    // Declaração de variáveis
    var idade = 21 // idade do indivíduo
    var altura = 1.58f // Altura do indivíduo (usando 'f' para indicar um float)
    var inicial = 'S' // Inicial do nome do indivíduo

    // Impressão das informações do indivíduo usando interpolação de strings
    println("Minha inicial é $inicial, tenho $idade anos e minha altura é %.2f".format(altura))
}