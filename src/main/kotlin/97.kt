
/*
97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles.*/

fun main(){
    val numeros = listOf<Int>(6, 8, 3)
    println(Maior(numeros))
}

fun Maior(numero: List<Int>): Int{
    return numero.max()
}
