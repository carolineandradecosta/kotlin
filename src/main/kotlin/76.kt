
/*
76) Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela.*/

fun main(){
    println(vetorAleatorio())
}

fun vetorAleatorio(): MutableList<Int>{
    val vetor5 = mutableListOf<Int>()

//    val intervalo = (Int.MIN_VALUE.. Int.MAX_VALUE)
    val intervalo = (0.. 1000)


    for(i in 0..6){
        val aleatorio = intervalo.random()
        vetor5.add(aleatorio)
    }
    return vetor5
}