// Exercio: Busca Elementos

fun main(){
    
    //Array de strings
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie" // Elemento a ser buscado
    var found = false // variável para verificar se o elemnto foi encontrado

    // Loop para verificar se o elemento está presente
    for(name in names){
        if (name == searchName) {
            found = true
            break
        }
    }

    if (found){
        println("$searchName foi encontrado no array")
    } else {
        println("$searchName não foi encontrado no array")
    }
}