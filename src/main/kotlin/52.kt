
/*
52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida*/

fun main(){
    val idades = listOf(25, 3, 15, 30, 46, 51, 83, 31, 38, 4)
    classificaIdades(idades)
}

fun classificaIdades(idade: List<Int> ){
    val mediaIdades = idade.average()
    val maior18 = idade.filter { it > 18 }.size
    val menor5 = idade.filter { it < 5 }.size
    val menorIdade = idade.min()
    
    println("Média das idades: $mediaIdades")
    println("$maior18 pessoas com mais que 18 anos de idade")
    println("$menor5 pessoas com menos que 5 anos de idade")
    println("$menorIdade é a menor idade registrada")
}