
/*
94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
termos da sequência serão mostrados na tela. O seu procedimento deve receber
esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM*/

fun main(){
    fibonacci(13)
}

fun fibonacci(qtdTermos: Int){
    val f1 = 1
    val f2 = f1
    var somaParcial = 0

    val sequencia = mutableListOf<Int>()
    sequencia.add(f1)
    sequencia.add(f2)

    for(i in 0..(qtdTermos - 3)){
        somaParcial = sequencia.get(i) + sequencia.get(i+1)
        sequencia.add(somaParcial)
    }
    println(sequencia)
}

// [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233]