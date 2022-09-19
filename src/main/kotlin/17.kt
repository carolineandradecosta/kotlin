
//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

fun main(){
    println(calculaMulta())
}
fun calculaMulta(){
    println("Informe a velocidade do carro")
    val velocidadeCarro: Double = readLine()!!.toDouble()
    val limiteDeVelocidade: Double = 80.00
    val multaParaCadaKm = 5.0
    if (velocidadeCarro > limiteDeVelocidade){
        val valorMulta:Double = (velocidadeCarro - limiteDeVelocidade) * multaParaCadaKm
        println("Você foi multado, o valor da multa é: R$$valorMulta")
    } else {
        println("Você está dentro do limite de velocidade permitido.")
    }
}

