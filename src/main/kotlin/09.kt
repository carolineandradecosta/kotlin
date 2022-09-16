import kotlin.math.roundToInt

//9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

fun main (){
    println(transformaEmDolares(20.00))
}

fun transformaEmDolares(n: Double): String{
    val dolares = n/ 3.45
    val roundoff = (dolares * 100.0).roundToInt() / 100.0
    return "Com R$$n voce pode comprar US$$roundoff"
}

//Dúvida: Existe uma forma mais simples de limitar a quantidade de casas decimais que eu desejo (com arredondamento)?