
/*
58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.*/

fun main(){
    val idades = listOf<Int>(15, 19, 25, 30, 33, 45)
    println(quantidadeAlunos(idades))
    println(mediaIdadeAlunos(idades))
}

fun quantidadeAlunos(i: List<Int>): Int{
    return i.size
}

fun mediaIdadeAlunos(i: List<Int>): Double{
    return i.average()
}

