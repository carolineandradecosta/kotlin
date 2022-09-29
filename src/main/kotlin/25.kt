
//25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois.

fun main (){
    println(formaTriangulo())
}

fun formaTriangulo(): String{

    println("Informe o lado 1")
    val lado1: Int = readLine()!!.toInt()
    println("Informe o lado 2")
    val lado2: Int = readLine()!!.toInt()
    println("Informe o lado 3")
    val lado3: Int = readLine()!!.toInt()

    if((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)){
        return "Não forma um triângulo"
    } else {
        return "Forma um triângulo"
    }

}