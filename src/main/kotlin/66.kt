
/*
66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...*/

fun main(){
    tabuada()
}

fun tabuada(){
    println("Informe o numero que voce deseja ver a tabuada:")
    val numero = readLine()!!.toInt()

    var resultado: Int

    for(i in 1 .. 10){
        resultado = numero * i
        println("$numero x $i = $resultado")
    }
}
