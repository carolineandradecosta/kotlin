
/*
12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/

fun main(){
    println(calculaDesconto(20.0))
}

fun calculaDesconto(v: Double, d:Double = 0.05): String{
    val precoPromocional = v-(v*d)
    return "O preço promocional, com 5% de desconto eh: R$$precoPromocional"
}

// Dúvida: não consegui declarar o valor inicial de d com uma fração (5/100)