
//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.

fun main(){
    println(calculaIdade( 2010))
}

fun calculaIdade(anoNascimento:Int){
    val anoAtual:Int = 2022
    val idade:Int = anoAtual - anoNascimento

    if (idade >= 18){
        println("Você tem $idade anos e portanto, já pode votar.")
    } else {
        println("Você tem $idade anos e portanto, ainda não pode votar.")
    }
}

// Você tem 12 anos e portanto, ainda não pode votar.