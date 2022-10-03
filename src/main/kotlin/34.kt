import kotlin.math.pow
import kotlin.math.roundToInt

//34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
//peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
//indivíduo dentro de certas faixas.
//- abaixo de 18.5: Abaixo do peso
//- entre 18.5 e 25: Peso ideal
//- entre 25 e 30: Sobrepeso
//- entre 30 e 40: Obesidade
//- acima de 40: Obseidade mórbida

//Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
//da altura)

fun main(){
    println(calculaImc(54.0, 1.70))
}

fun calculaImc(peso: Double, altura: Double): String{

    val imc = ((peso/altura.pow(2))*100.0 ).roundToInt()/100.0
    println("Seu imc é: $imc")

    if(imc < 18.5){
        return "Abaixo do peso"
    } else if((imc >= 18.5) && (imc < 25.00)){
        return "Peso ideal"
    } else if ((imc >= 25.00) && (imc < 30.00)){
        return "Sobrepeso"
    } else if ((imc >= 30.00) && (imc < 40.00)){
        return "Obesidade"
    } else if (imc >= 40.00){
        return "Obseidade mórbida"
    } else {
        return "0"
    }
}