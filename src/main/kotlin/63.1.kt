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
    lerNumeros()
}

fun lerNumeros(){
    var opcao = "s"
    val numeros = mutableListOf<Int>()

    do {
        println("Informe um numero: ")
        numeros.add(readLine()!!.toInt())
        println("Deseja continuar? [s- sim/ n-nao]")
        opcao = readLine()!!.toString()

    } while (opcao == "s")
    println("Lista com os numeros informados: $numeros")
    println("Somatório entre todos os valores: ${numeros.sum()}")
    println("Menor valor digitado: ${numeros.min()}")
    println("Media entre todos os valores: ${numeros.average().toBigDecimal().setScale(2, RoundingMode.UP)}")
    println("Quantidade de valores pares: ${numeros.filter { it % 2 == 0 }.size}")
}
