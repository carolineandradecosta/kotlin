import java.math.BigDecimal
import java.math.RoundingMode

/*
81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade*/

fun main(){
    //geraIdades()
    val listaIdades = geraIdades2()
    println(listaIdades)
    println(calculaMediaIdades2(listaIdades))
    posicaoComMais25Anos(listaIdades)
    println(maiorIdade2(listaIdades))
    println(posicaoDaMaiorIdade(listaIdades))
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

// Outra forma de resolver:
fun geraIdades2(): MutableList<Int> {
    val idades = mutableListOf<Int>()
    val intervaloIdades = 1..100

    for (i in 0..7) {
        val aleatorio = intervaloIdades.random()
        idades.add(aleatorio)
    }
    return idades
}

fun calculaMediaIdades2(idade: MutableList<Int>): BigDecimal{
    return idade.average().toBigDecimal().setScale(2, RoundingMode.UP)
}

fun posicaoComMais25Anos(idade: MutableList<Int>){
    for(i in idade.indices){
        if(idade[i] > 25){
            print("$i ")
        }
    }
    println()

    //println(idade.filterIndexed { index, i -> (i > 25) }) // buscar outra solução
}

fun maiorIdade2(idade: MutableList<Int>): Int{
    return idade.max()
}

fun posicaoDaMaiorIdade(idade: MutableList<Int>){
    for(i in idade.indices){
        if(idade[i] == idade.max()){
            print("$i ")
        }
    }
}