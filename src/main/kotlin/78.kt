
/*
78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10.*/

fun main(){
    val vetorInteiro = listOf<Int>(2, 92, 30, 10, 33, 13, 20, 56, 32, 18, 11, 23, 19, 85, 69)
    classificaVetor(vetorInteiro)
}

fun classificaVetor(n: List<Int>){
    println(n)
    for(i in n.indices){
        if( n[i] % 10 == 0){
            print("$i ")
        }
    }
}


