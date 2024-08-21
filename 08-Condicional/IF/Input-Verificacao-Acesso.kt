fun main(){
    //Solicita ao usuário para digitar o nome de usuário
    print("Digite o nome do usuário: ")
    val usuarioInput = readLine()

    //Solicita ao usuário para digitar a senha
    print("Digite a senha: ")
    val senhaInput = readLine()

    //Credenciais 
    val usuario = "vinny"
    val senha = "123456"

    //Verifica se o nome de usuário e senha fornecidos 
    if (usuarioInput == usuario && senhaInput == senha){
        println("Acesso permitido")
    }else {
        println("Acesso negado")
    }

}