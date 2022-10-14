
/*
61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!*/

fun main(){
    contagem30()
}

fun contagem30(){
    var contador = 0
    do {
        contador += 3
        print("$contador ")
    } while (contador < 30)
}

