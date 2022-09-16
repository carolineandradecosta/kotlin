
/*
8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm*/

fun main(){
    println(transformaMedidas(185.72))
}

fun transformaMedidas(n: Double): String{
    val quilometro = n * 0.001
    val hectometro = n * 0.01
    val decametro = n * 0.1
    val decimetro = n * 10
    val centimetro = n * 100
    val milimetro = n * 1000
    return "$quilometro Km\n $hectometro Hm\n $decametro Dam\n $decimetro dm\n $centimetro cm\n $milimetro mm"
}

//Dúvida: Existe outra forma de retornar esses valor? ( mesma dúvida da questão 06)