
/*
88) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
+-------=======------+*/

fun main(){
    gerador3()
}

fun gerador3(){
    println("+-------=======-------+")
    for(i in 1..4){
        println("Aprendendo Portugol")
    }
    println("+-------=======-------+")
}


