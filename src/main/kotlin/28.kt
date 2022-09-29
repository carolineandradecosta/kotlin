
//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m² = TERRENO POPULAR
//- Entre 100m² e 500m² = TERRENO MASTER
//- Acima de 500m² = TERRENO VIP

fun main(){
    println(calculaTerreno())
}

fun calculaTerreno(): String{

    println("Informe a largura do terreno em metros")
    val largura: Double = readLine()!!.toDouble()
    println("Informe a comprimento do terreno em metros")
    val comprimento: Double = readLine()!!.toDouble()

    val area: Double = largura * comprimento
    println("Área do terreno: $area m²")


    if (area < 100.0){
        return "Terreno popular"
    } else if ((area >= 100.00) && (area <= 500.00)){
        return "Terreno Master"
    } else {
        return "Terreno vip"
    }
}