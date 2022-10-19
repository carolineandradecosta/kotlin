
/*
74) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9*/

fun main(){
    println(vetorNumerico4())
}

fun vetorNumerico4(): MutableList<Int>{
    val vetor4 = mutableListOf<Int>()

    val v1 = 5
    val v2 = 3

    for(i in 0..4){
        vetor4.add(v1)
        vetor4.add(v2)
    }
    return vetor4
}


