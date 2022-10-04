
/*
38) Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!    */

fun main(){
    contagem()
}

fun contagem(){
    for (i in 6 .. 11 ){
        print("$i ")
    }
    print("Acabou!")
}

//6 7 8 9 10 11 Acabou!