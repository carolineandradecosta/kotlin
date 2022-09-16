
//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

fun main (){
    println("Digite um valor")
    val numero1: Int = readLine()!!.toInt()
    println("Digite outro valor")
    val numero2 : Int = readLine()!!.toInt()
    val soma: Int = numero1 + numero2
    println("A soma entre $numero1 e $numero2 é igual a $soma")
}