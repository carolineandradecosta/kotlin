
//24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas.

fun main(){
    println(calculaPrecoPassagem())
}

fun calculaPrecoPassagem(): String{
    println("Qual a distância que você deseja percorrer?")
    val distancia: Double = readLine()!!.toDouble()

    val taxa1: Double = 0.50
    val taxa2: Double = 0.45

    if(distancia <= 200.00){
        val precoPassagem1: Double = distancia * taxa1
        return "Preço da passagem: R$$precoPassagem1"
    } else {
        val precoPassagem2: Double = distancia * taxa2
        return "Preço da passagem: R$$precoPassagem2"
    }
}