
/*
40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!*/

fun main(){
    contagem3()
}

fun contagem3(){
    for (i in 0 ..18 step 3){
        print("$i ")
    }
    print("Acabou!")
}

//0 3 6 9 12 15 18 Acabou!