
/*
41) Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!*/

fun main (){
    contagem4()
}

fun contagem4(){
    for(i in 100 downTo 0 step 5){
        print("$i ")
    }
    print("Acabou!")
}

//100 95 90 85 80 75 70 65 60 55 50 45 40 35 30 25 20 15 10 5 0 Acabou!
