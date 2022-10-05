
/*
47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0*/

fun main(){
    calculaSoma2()
}

fun calculaSoma2(){
    var soma = 0

    for(i in 500 downTo 0 step 50){
        print("$i ")
        soma += i
    }
    println()
    println("Soma Total: $soma")
}

//500 450 400 350 300 250 200 150 100 50 0
//Soma Total: 2750
