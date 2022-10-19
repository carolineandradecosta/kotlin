
/*
70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
1 1 2 3 5 8 13 21...*/

fun main(){
    sequenciaFibonacci()
}

fun sequenciaFibonacci(){
    val f1 = 1
    val f2 = f1
    var somaParcial = 0

    val sequencia = mutableListOf<Int>()
    sequencia.add(f1)
    sequencia.add(f2)

    for(i in 0..7){
        somaParcial = sequencia.get(i) + sequencia.get(i+1)
        sequencia.add(somaParcial)
    }
    println(sequencia)
}
