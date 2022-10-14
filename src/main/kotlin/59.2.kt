
/*
59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens*/

fun main(){
    classificaIdadesESexo()
}

fun classificaIdadesESexo(){
    var opcao = "s"
    var sexo: String
    var idade: Int
    var maiorIdade = Int.MIN_VALUE
    var menorIdadeMulher = Int.MAX_VALUE
    //var sexoMaiorIdade: String
    var contaHomens = 0
    val idadeHomens = mutableListOf<Int>()

    while (opcao == "s"){
        println("Informe o sexo: [f- feminino/ m- masculino]")
        sexo = readLine()!!.toString()
        println("Informe a idade:")
        idade = readLine()!!.toInt()

        println("Deseja continuar? [s - sim/ n- nao]")
        opcao = readLine()!!.toString()

        if(idade > maiorIdade){
            maiorIdade = idade
            //sexoMaiorIdade = sexo
        }

        if(sexo == "m"){
            contaHomens += 1
            idadeHomens.add(idade)
        }

        if((sexo == "f") && (idade < menorIdadeMulher)){
            menorIdadeMulher = idade
        }
    }
    println(maiorIdade)
    println(contaHomens)
    println(menorIdadeMulher)
    println(idadeHomens.average())
}
