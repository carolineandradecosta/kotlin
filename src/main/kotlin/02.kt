
/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/

fun main(){
    println("Qual é o seu nome? ")
    val texto: String? = readLine()
    println("Olá, $texto, é um prazer te conhecer!")
}

