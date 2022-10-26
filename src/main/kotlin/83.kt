
/*
83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.*/

fun main(){
    val vetorPolulado = populaVetor()
    println(mostraVetor(vetorPolulado))
    println(ordenaVeor(vetorPolulado))
}

fun populaVetor(): MutableList<Int> {
    val intervalo = 0..99
    val vetor = mutableListOf<Int>()

    for(i in 0..19){
        vetor.add(intervalo.random())
    }
    return vetor
}

fun mostraVetor(v: MutableList<Int>): MutableList<Int>{
    return v
}

fun ordenaVeor(v: MutableList<Int>): List<Int>{
    return v.sorted()
}