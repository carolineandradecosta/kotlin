
//30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de triângulo será formado:
//- EQUILÁTERO: todos os lados iguais
//- ISÓSCELES: dois lados iguais
//- ESCALENO: todos os lados diferentes

fun main(){
    println(formaTriangulo())
}

fun TipoTriangulo(): String{

    println("Informe o lado 1")
    val lado1: Int = readLine()!!.toInt()
    println("Informe o lado 2")
    val lado2: Int = readLine()!!.toInt()
    println("Informe o lado 3")
    val lado3: Int = readLine()!!.toInt()

    if((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)){
        return "Não forma um triângulo"
    } else if ((lado1 == lado2) && (lado2 == lado3)){
        return "É um triângulo equilátero"
    } else if ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)){
        return "É um triângulo Isósceles"
    } else {
        return "É um triângulo Escaleno"
    }
}