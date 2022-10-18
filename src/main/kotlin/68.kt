import java.math.RoundingMode

/*
68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens*/

fun main(){
    val pesoHomens = listOf<Double>(59.9, 85.6, 95.7, 67.4)
    val pesoMulheres = listOf<Double>(49.9, 55.6, 63.8, 84.0)

    println(contaMulheres(pesoMulheres))
    println(contaHomens(pesoHomens))
    println(mediaPesosMulheres(pesoMulheres))
    println(maiorPesoHomens(pesoHomens))
}

fun contaMulheres(pm: List<Double>): String{
    return "Quantidade mulheres cadastradas: ${pm.size}"
}

fun contaHomens(ph: List<Double>): String{
    return "Quantidade de homens que pesam mais de 100Kg: ${ ph.filter { it > 100 }.size }"
}

fun mediaPesosMulheres(pm: List<Double>): String{
    return "Media de peso entre as mulheres: ${ pm.average().toBigDecimal().setScale(2, RoundingMode.UP) }"
}

fun maiorPesoHomens(ph: List<Double>): String{
    return "Maior peso entre os homens: ${ ph.max() }"
}


