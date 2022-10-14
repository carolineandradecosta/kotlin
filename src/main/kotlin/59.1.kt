
/*59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens*/


fun main(){
    //verificaMaiorIdade()

    val sexos = listOf<String>("feminino", "feminino", "masculino", "feminino", "masculino")
    val idadesMulheres = listOf<Int>(30, 19, 26)
    val idadesHomens = listOf<Int>(45, 22)
    val idadesTodas = listOf<Int>(30, 19, 45, 26, 22)

    println(verificaMaiorIdade2(idadesTodas))
    println(qtdHomensCadastrados(sexos))
    println(menorIdadeMulheres(idadesMulheres))
    println(mediaIdadeHomens(idadesHomens))
}

fun verificaMaiorIdade(){
    var maior = Int.MIN_VALUE
    var idade = 0
    var contador = 1

    while (contador <= 4){
        println("digite a idade")
        idade = readLine()!!.toInt()

        if(idade > maior){
            maior = idade
        }

        contador += 1
    }
    println(maior)
}

fun verificaMaiorIdade2(i: List<Int>): Int{
    return i.max()
}

fun qtdHomensCadastrados(s: List<String>): Int{
    return s.filter { it == "masculino" }.size
}

fun menorIdadeMulheres(i: List<Int>): Int{
    return i.min()
}

fun mediaIdadeHomens(i: List<Int>): Double{
    return i.average()
}