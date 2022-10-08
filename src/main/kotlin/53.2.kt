
/*
53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos*/

fun main(){
    val sexos = listOf<String>("feminino", "masculino", "feminino", "masculino", "feminino")
    val idadesTodas = listOf<Int>(30, 45, 28, 35, 32)
    val idadesMulheres = listOf<Int>(30, 28, 32)
    val idadesHomens = listOf<Int>(45, 35)

    println(contaHomensCadastrados(sexos))
    println(contaMulheresCadastradas(sexos))
    println(calculaMediaTodasIdades(idadesTodas))
    println(calculaMediaIdadesMulheres(idadesMulheres))
    println(calculaMediaIdadesHomens(idadesHomens))

}

fun contaHomensCadastrados(sexo: List<String>): Int{
    return sexo.filter { it == "masculino" }.size
}

fun contaMulheresCadastradas(sexo: List<String>): Int{
    return sexo.filter { it == "feminino" }.size
}

fun calculaMediaTodasIdades(idadeTodas: List<Int>): Double{
    return idadeTodas.average()
}

fun calculaMediaIdadesMulheres(idadeMulheres: List<Int>): Double{
    return idadeMulheres.average()
}

fun calculaMediaIdadesHomens(idadeHomens: List<Int>): Double {
    return idadeHomens.average()
}