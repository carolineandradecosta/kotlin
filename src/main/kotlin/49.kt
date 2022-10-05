
/*
49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares.*/

fun main(){
    paresOuImpares()
}

fun paresOuImpares(){
    var contador = 1

    var contaPares = 0
    var contaImpares = 0

    while(contador <= 6){
        println("Informe o numero $contador:")
        val numero = readLine()!!.toInt()

        if(numero % 2 == 0){
            contaPares += 1
        } else {
            contaImpares += 1
        }
    contador += 1
    }

    println("$contaPares números são pares")
    println("$contaImpares números são ímpares")
}

/*
Informe o numero 1:
68
Informe o numero 2:
5
Informe o numero 3:
9
Informe o numero 4:
20
Informe o numero 5:
11
Informe o numero 6:
13
2 números são pares
4 números são ímpares*/
