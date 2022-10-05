
/*
48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles.*/

fun main(){
    somaInteiros()
}

fun somaInteiros(){
    var contador = 1
    var soma = 0

    while(contador <=7){
        println("Informe o numero $contador: ")
        val numero: Int = readLine()!!.toInt()
        soma += numero
        contador += 1
    }
    println("Soma Total: $soma")
}

/*Informe o numero 1:
2
Informe o numero 2:
8
Informe o numero 3:
5
Informe o numero 4:
6
Informe o numero 5:
1
Informe o numero 6:
4
Informe o numero 7:
6
Soma Total: 32*/
