
/*79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que
posições eles estão armazenados.*/

fun main(){
    val vetorInteiro = listOf<Int>(2, 92, 30, 10, 33, 13, 20, 56, 32, 18)
    classificaVetor2(vetorInteiro)
}

fun classificaVetor2(n: List<Int>) {
    println("Vetor completo: $n")
    print("Posições que estão os números pares: ")
    for (i in n.indices) {
        if (n[i] % 2 == 0) {
            print("$i ")
        }
    }
}

//Vetor completo: [2, 92, 30, 10, 33, 13, 20, 56, 32, 18]
//Posições que estão os números pares: 0 1 2 3 6 7 8 9
