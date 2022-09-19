
//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.

fun main(){
    println(tempoDeVidaDeUmFumante())
}

fun tempoDeVidaDeUmFumante(): String{
    println("Informe a quantidade de cigarros que você fuma por dia")
    val qtdCigarrosDia: Double = readLine()!!.toDouble()
    println("Informe a quantos anos você fuma")
    val qtdAnosFumando: Double = readLine()!!.toDouble() * 365
    val tempoPerdidoPorUmCigarro: Double = 10.00
    val diasDeVidaPerdidos:Double = qtdCigarrosDia * qtdAnosFumando * tempoPerdidoPorUmCigarro
    return "Você perdeu $diasDeVidaPerdidos dias de vida."
}

