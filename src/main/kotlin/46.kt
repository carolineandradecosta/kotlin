
/*
46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.*/

fun main(){
    calculaSoma()
}

fun calculaSoma(){
    var soma = 0

    for(i in 6..100 step 2){
        print("$i ")
        soma += i
    }
    println()
    println("Soma Total: $soma")
}

//6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
//Soma Total: 2544