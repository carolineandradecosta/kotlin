import java.math.RoundingMode

/*
81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade*/

fun main(){
    geraIdades()

}

fun geraIdades(){
    val idades = mutableListOf<Int>()
    val intervaloIdades = 1..100

    for(i in 0..7){
        val aleatorio = intervaloIdades.random()
        idades.add(aleatorio)
    }

    println("Média de idade: ${idades.average().toBigDecimal().setScale(2, RoundingMode.UP)}")

    println("Todas as idades: $idades")

    print("Posicoes das idades maiores que 25: ")


    for(i in idades.indices){
        if(idades[i] > 25){
            print("$i ")
        }
    }
    println()

    println("Maior idade: ${idades.max()}")

    print("Posicoes da maior idade: ")
    for(i in idades.indices){
        if(idades[i] == idades.max()){
            print("$i ")
        }
    }

}
