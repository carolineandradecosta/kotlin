
//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.

fun main(){
    println(parOuImpar(11))
}

fun parOuImpar (n: Int): String{
    if (n % 2 == 0){
        return "O número $n é par"
    } else {
        return "O numero $n é ímpar"
    }
}