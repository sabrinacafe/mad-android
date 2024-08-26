fun main(){

    print("Digite um númro maior que 2: ")
    var num = readLine()!!.toInt() //definindo o numero que será verificado se é primo ou não
    var isPrime = true // variável como true assumindo inicialmente que é primo

    for (i in 2 until num){
        if (num % i == 0){ //verifica se é um número divisivel por i
            isPrime = false
            break // interromper o loop
        }
    }

    //Após o loop, verificamos o valor de isPrime para determinar se é um primo ou não
    if(isPrime) {
        println("$num é um número primo")//Se isPrime ainda for true, não divide por zero
    }else{
        println("$num não é primo")//Se isPrime for false, não é primo
    }
}