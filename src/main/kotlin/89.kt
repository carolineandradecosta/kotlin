
/*
89) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que o programador possa escolher uma entre três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol Studio
Portugol Studio
Portugol Studio
~~~~~~~~:::::::~~~~~~~*/

fun main(){
    gerador4(1)
}

fun gerador4(opcao: Int){
    if (opcao == 1){
        println("+-------=======-------+")
        for(i in 1..4){
            println("Aprendendo Portugol")
        }
        println("+-------=======-------+")
    }

    if(opcao == 2){
        println("~~~~~~~~:::::::~~~~~~~")
        for(i in 1..4){
            println("Aprendendo Portugol")
        }
        println("~~~~~~~~:::::::~~~~~~~")
    }

    if(opcao == 3){
        println("<<<<<<<<------->>>>>>>")
        for(i in 1..4){
            println("Aprendendo Portugol")
        }
        println("<<<<<<<<------->>>>>>>")
    }
}
