
/*
92) Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR.*/

fun main(){
    val numeros = listOf<Int>(15, 8)
    ParOuImpar(numeros)
}

fun ParOuImpar(numero: List<Int>){
    for( i in 0.. (numero.size) -1){
        if(numero[i] % 2 == 0){
            println("O numero ${numero[i]} é par")
        } else {
            println("O numero ${numero[i]} é impar")
        }
    }
}

//O numero 15 é impar
//O numero 8 é par