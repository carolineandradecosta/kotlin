
/*
75) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
elementos da sequência de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5  6  7  8  9  10 11  12  13  14  15*/

fun main(){
    sequenciaFibonacci2()
}

fun sequenciaFibonacci2(){
    val f1 = 1
    val f2 = f1
    var somaParcial = 0

    val sequencia = mutableListOf<Int>()
    sequencia.add(f1)
    sequencia.add(f2)

    for(i in 0..13){
        somaParcial = sequencia.get(i) + sequencia.get(i+1)
        sequencia.add(somaParcial)
    }
    println(sequencia)
}