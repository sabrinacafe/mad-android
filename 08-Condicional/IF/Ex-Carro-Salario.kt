import kotlin.math.*

fun main(){
    var salario: Float = 5000f
    var contas: Float = 5000f

    var carro1: String = "Fusca"
    var carro2: String = "Brasilia"

    if(salario > contas) {
        println("ufa que bom")
    }else {
        print("me lasquei")
    }

    if(salario == contas) {
        println("Igual")
    }else {
        println("diferente")
    }
    if(carro1 == carro2){
        println("Strings iguais")
    }else {
        println("String diferentes")
    }
}