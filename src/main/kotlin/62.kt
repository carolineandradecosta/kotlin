import java.math.RoundingMode

/*
62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.*/

fun main(){
    cadastroPessoas()
}

fun cadastroPessoas(){
    var opcao = "s"
    val idades = mutableListOf<Int>()

    do {
        println("Informe a idade:")
        idades.add(readLine()!!.toInt())
        println("Deseja continuar? [s- sim/ n- nao]")
        opcao = readLine()!!.toString()
    } while (opcao == "s")
    println("Lista com todas as idades: $idades")

    println("Quantidade de idades cadastradas: ${idades.size}")
    println("Média das idades: ${idades.average().toBigDecimal().setScale(2, RoundingMode.UP)}")
    println("Quantidade de pessoas que tem 21 anos ou mais: ${idades.filter { it >= 21 }.size}")
}