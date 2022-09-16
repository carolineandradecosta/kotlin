import kotlin.math.roundToInt

/*
10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

fun main(){
    println(calculaTinta())
}

fun calculaTinta(): String{
    println("Informe a largura da parede")
    val largura = readLine()!!.toDouble()
    println("Informe a altura da parede")
    val altura: Double = readLine()!!.toDouble()
    val area: Double = (largura*altura*100.0).roundToInt()/100.0

    val litrosDeTinta: Double = (area/2*100.0).roundToInt()/100.0

    return "A area a ser pintada eh de $area m² e eh necessario $litrosDeTinta litros de tinta."
}


