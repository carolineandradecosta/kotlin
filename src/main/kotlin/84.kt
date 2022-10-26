
/*
84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade.*/

fun main(){
    val nomes = listOf<String>("Caroline", "Miguel", "Celiane", "Mel")
    val idades = listOf<Int>(30, 5, 53, 17)
    println(apenasMenores18(nomes, idades))
}

fun apenasMenores18(nome: List<String>, idade: List<Int>){
    for(i in idade.indices){
        if(idade[i] < 18){
            println("${nome[i]} : ${idade[i]}")
        }
    }
}

//Miguel : 5
//Mel : 17
