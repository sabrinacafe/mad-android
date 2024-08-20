fun main(){

    //criando uma lista mutavel de numeros inteiros vazia
    val numeros = mutableListOf<Int>()

    // Adicionando elementos a lista
    numeros.add(1)
    numeros.add(2)
    numeros.add(3)

    //Exibindo a lista de numeros
    print("Lista de numeros: $numeros")

    //removendo um elemento da lista
    numeros.removeAt(2)

    //Exibindo a lista após a remoção
    println("Lista de numeros após a remoção: $numeros")

}