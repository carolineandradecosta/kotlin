
/*
56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado*/

fun main(){
    println(somaNumeros())
}

fun somaNumeros(): String{
    var opcao = 1
    var soma = 0
    while(opcao !== 111){

        println("Informe um numero")
        val numero = readLine()!!.toInt()
        soma += numero

        println("Deseja continuar? [1- continuar/ 111 - parar]")
        opcao = readLine()!!.toInt()
    }
    return "Somatorio: $soma"
}