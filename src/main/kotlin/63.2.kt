import java.math.BigDecimal
import java.math.RoundingMode

/*
63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares*/

fun main(){
    val numeros = listOf<Int>(3, 13, 30, 51, 25, 19, 28)
    println(calculaSomatorio(numeros))
    println(menorValor(numeros))
    println(mediaValores(numeros))
    println(valoresPares(numeros))
}

fun calculaSomatorio(n: List<Int>): String{
    return "Somatorio entre todos os valores: ${n.sum()}"
}

fun menorValor(n: List<Int>): String{
    return "Menor valor digitado: ${n.min()}"
}

fun mediaValores(n: List<Int>): String{
    return "Media entre todos os valores: ${n.average().toBigDecimal().setScale(2, RoundingMode.UP)}"
}

fun valoresPares(n: List<Int>): String{
    return "Quantidade valores pares: ${n.filter { it % 2 == 0 }.size}"
}