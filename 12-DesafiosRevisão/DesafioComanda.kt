/* Crie um sistema de geração de comanda para lanchonete
Inicie criando variáveis para o controle de preço e quantidade de produtos
Exibir: A quantidade e preço dos produtos, soma, taxa e o total
Use os valores de 3 coxinha e 2 cervejas
Preço Coxinha: R$ 5.00
Preço Cerveja: R$ 15.00
 */

 fun main () {
    
    //Definindo variáveis 
    val coxinha = 5.00
    val cerveja = 15.00

    //Calculando
    val somatoria = (coxinha * 3 + cerveja * 2) * 1.10
    val somatoriaFormatada = String.format("%.2f", somatoria)

    println("----------------------------------------------")
    println("3 coxinhas = R$ 15.00 (5.00 * 3 unidades) \t ")
    println("2 cervejas = R$ 30.00 (15.00 * 2 unidades) \t")
    println("Taxa de serviço = 10% \t")
    println("----------------------------------------------")
    println("Total = $somatoriaFormatada ")
            
 }