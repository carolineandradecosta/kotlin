
/*
69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequência.*/

fun main(){
    //progressaoAritmetica()

    progressaoAritmetica2(6, 3)
}

fun progressaoAritmetica(){
    println("Informe o primeiro termo da PA:")
    var primeiroTermo = readLine()!!.toInt()

    println("Informe a razao da PA")
    val razao = readLine()!!.toInt()

    val pa = mutableListOf<Int>()

    for(i in 1..10){
        primeiroTermo += razao
        pa.add(primeiroTermo)
    }
    println(pa)
    println(pa.sum())
}

// outra alternativa, usando parâmetros:

fun progressaoAritmetica2(primeiroTermo:Int, razao: Int){
    val progressao = mutableListOf<Int>()
    var somaParcial = primeiroTermo

    for(i in 1.. 10){
        progressao.add(somaParcial)
        somaParcial += razao
    }
    println("Os dez primeiros elementos da progressao aritmetica: $progressao")
    println("Somatorio da PA: ${progressao.sum()}")
}
