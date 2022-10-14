import java.math.BigDecimal
import java.math.RoundingMode

/*
60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos*/

fun main(){
    val nomes = listOf<String>("maria", "mel", "gael", "carol", "gustavo")
    val nomesMulheres = listOf<String>("maria", "mel", "carol")
    val nomesHomens = listOf<String>("gael", "gustavo")

    val idadesMulheres = listOf<Int>(22, 30, 17)
    val idadesHomens = listOf<Int>(15, 37)
    val idades = listOf<Int>(22, 30, 15, 17, 37)

    val sexos = listOf<String>("feminino", "feminino", "masculino", "feminino", "masculino")

    println(pessoMaisVelha(idades, nomes))
    println(mulherMaisJovem(idadesMulheres, nomesMulheres))
    println(mediaIdades(idades))
    println(QtdHomesMais30Anos(idadesHomens))
    println(QtdMulheresMenos18Anos(idadesMulheres))
}

fun pessoMaisVelha(idade: List<Int>, nome: List<String>): String{
    idade.indexOf(idade.max())
    return "Nome da pessoa mais velha: ${nome[idade.indexOf(idade.max())]}"
}

fun mulherMaisJovem(idade: List<Int>, nome: List<String>): String{
    idade.indexOf(idade.min())
    return "Nome da mulher mais jovem: ${nome[idade.indexOf(idade.min())]}"
}

fun mediaIdades(idade: List<Int>): String{
    val media: BigDecimal = idade.average().toBigDecimal().setScale(2, RoundingMode.UP)
    return "Média de idade do grupo: $media"
}

fun QtdHomesMais30Anos(idade: List<Int>): String{
    return "Quantidade de homens com mais de 30 anos: ${idade.filter { it > 30 }.size}"
}

fun QtdMulheresMenos18Anos(idade: List<Int>): String{
    return "Quantidade de mulheres com menos de 18 anos: ${idade.filter { it < 18 }.size}"
}
