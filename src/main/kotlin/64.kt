
/*
64) Desenvolva um programa usando a estrutura “para” que mostre na tela a
seguinte contagem:
0 5 10 15 20 25 30 35 40 Acabou!*/

fun main(){
    contagem40()
}

fun contagem40(){
    for(i in 0 .. 40 step 5 ){
        print("$i ")
    }
}