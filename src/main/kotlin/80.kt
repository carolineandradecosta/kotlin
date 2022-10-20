
/*
80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
número (chave) e seu programa deve mostrar em que posições essa chave foi
encontrada. Mostre também quantas vezes a chave foi sorteada.*/

fun main(){
    numeroChave()
}

fun numeroChave(){
    val vetor30Posicoes = mutableListOf<Int>()
    val intervalo = 1..15

    for(i in 0 .. 30){
        val aleatorio = intervalo.random()
        vetor30Posicoes.add(aleatorio)
    }

    println("Vetor completo: $vetor30Posicoes")

    val chave = intervalo.random()
    print("Posições em que a chave $chave foi encontrada: ")

    for(i in vetor30Posicoes.indices){
        if(vetor30Posicoes[i] == chave){
            print("$i ")
        }
    }
    println()
    println("Quantidade de vezes que a chave $chave foi sorteada: ${ vetor30Posicoes.filter { it == chave }.size }")
}
