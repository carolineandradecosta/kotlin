
/*
39) Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!*/

fun main(){
    contagem2()
}

fun contagem2(){
    for( i in 10 downTo  3){
        print("$i ")
    }
    print("Acabou!")
}

//10 9 8 7 6 5 4 3 Acabou!