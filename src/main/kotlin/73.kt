
/*
73) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9*/

fun main(){
    println(vetorNumerico3())
}

fun vetorNumerico3(): MutableList<Int>{
    val vetor3 = mutableListOf<Int>()

    for(i in 9 downTo 0){
        vetor3.add(i)
    }
    return vetor3
}