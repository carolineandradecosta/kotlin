
/*
50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3*/

fun main(){
    sorteiaNumeros()
}

fun sorteiaNumeros(){
    val numeros = listOf(0,1,2,3,4,5,6,7,8,9,10)
    var contador = 1

    var contaAcima5 = 0
    var contaDivisiveis3 = 0

    while(contador <=20){
        val numeroSorteado = numeros.random()
        print("$numeroSorteado ")
        contador += 1

        if(numeroSorteado > 5){
            contaAcima5 += 1
        } else if (numeroSorteado % 3 == 0) {
            contaDivisiveis3 += 1
        }
    }
    println()
    println("$contaAcima5 números estão acima no número 5")
    println("$contaDivisiveis3 números são divisíveis por 3")
}

/*
1 6 4 2 1 6 1 4 10 7 6 4 5 5 4 2 3 4 0 0
5 números estão acima no número 5
3 números são divisíveis por 3 */
