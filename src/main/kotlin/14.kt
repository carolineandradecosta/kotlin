
//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade
//de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a
//pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

fun main(){
    println(calculaAluguelCarro(150.00, 3))
}

fun calculaAluguelCarro(km: Double, dias: Int): String{
    val precoTotal: Double = (dias * 90)+(km * 0.20)
    return "O preço total a pagar é: R$$precoTotal"
}

// O preço total a pagar é: R$300.0