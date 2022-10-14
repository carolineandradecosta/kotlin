
/*
56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado*/

fun main(){
    val numeros = listOf<Int>(1, 5, 9, 7, 45, 6, 13, 30)
    println(somaNumeros(numeros))
}

fun somaNumeros(n:List<Int>): Int{
    val somatorio = n.sum()
    return somatorio
}

