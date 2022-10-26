
/*
91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica.*/

fun main(){
    println(maior(3, 5))
}

fun maior(n1: Int, n2: Int): String{
    if(n1 == n2){
        return "Os numeros sao iguais"
    } else if(n1 > n2){
        return "O numero $n1 é maior que o numero $n2"
    } else {
        return "O numero $n2 é maior que o numero $n1"
    }
}