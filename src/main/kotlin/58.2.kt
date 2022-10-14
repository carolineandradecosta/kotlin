
/*
58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.*/

fun main(){
    println(calculaMediaIdades())
}

fun calculaMediaIdades(): Double{
    var opcao = 9
    val idades = mutableListOf<Int>()

    while (opcao !== 999){
        println("Digite a idade:")
        val idade = readLine()!!.toInt()
        idades.add(idade)

        println("Deseja continuar? [9- Sim/ 999- Nao]")
        opcao = readLine()!!.toInt()
    }
    return idades.average()
}





