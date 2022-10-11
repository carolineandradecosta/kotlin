
/*
54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.*/

fun main(){
    val pesos = listOf<Double>(55.6, 75.2, 102.2, 47.9, 92.0, 69.5, 40.2)
    val alturas = listOf<Double>(1.60, 1.85, 2.0, 1.58, 1.65, 1.90, 1.50)
    println(calculaMediaAlturas(pesos, alturas))
    println(qtdPesamMais90(pesos))
    println(qtsPesamMenos50(pesos, alturas))
    println(qtdPesamMais100(pesos, alturas))
}

fun calculaMediaAlturas(peso: List<Double>, altura: List<Double>): String{
    val mediaPesos = peso.average()
    val mediaAlturas = altura.average()
    return "média pesos: $mediaPesos     média idades: $mediaAlturas"
}

fun qtdPesamMais90(peso: List<Double>): String{
    val pesamMais90 = peso.filter { it > 90.0 }.size
    return "Pesam mais que 90Kg: $pesamMais90"
}

fun qtsPesamMenos50(peso: List<Double>, altura: List<Double>): String{
    val pesamMenos50 = peso.filter { it < 50.0 }.size
    val medemMenos160 = altura.filter { it < 1.60 }.size
    return "Pesam menos que 50Kg: $pesamMenos50     Medem menos que 1.60m: $medemMenos160"
}

fun qtdPesamMais100(peso: List<Double>, altura: List<Double>): String{
    val pesamMais100 = peso.filter { it > 100.0 }.size
    val medemMais190 = altura.filter { it > 1.90 }.size
    return "Pesam mais que 100Kg: $pesamMais100     Medem mais que 1.90m: $medemMais190"
}



