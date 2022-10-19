
/*
71) Faça um programa que preencha automaticamente um vetor numérico com 8
posições, conforme abaixo:
999 999 999 999 999 999 999 999
 0   1   2   3   4   5   6   7*/

fun main(){
    //preencherVetor()
    println(preencherVetor2(999))
}

fun preencherVetor(){
    val vetorNumerico = mutableListOf<Int>()
    val numero = 999

    for(i in 0..7){
        vetorNumerico.add(numero)
    }
    println(vetorNumerico)
}

// outra alternativa:

fun preencherVetor2(numero: Int): MutableList<Int> {
    val vetorNumerico = mutableListOf<Int>()

    for(i in 0 .. 7){
        vetorNumerico.add(numero)
    }
    return vetorNumerico
}
