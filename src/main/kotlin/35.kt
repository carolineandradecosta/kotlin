
//35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
//tabela a seguir:
//- Carros populares (aluguel de R$90 por dia)
//- Até 100Km percorridos: R$0,20 por Km
//- Acima de 100Km percorridos: R$0,10 por Km
//- Carros de luxo (aluguel de R$150 por dia)
//- Até 200Km percorridos: R$0,30 por Km
//- Acima de 200Km percorridos: R$0,25 por Km

fun main(){
    println(calculaAluguel("luxo", 3, 150.0))
}

// resolução utilizando a função "when"
fun calculaAluguel (tipoCarro: String, diasAluguel: Int, quilometros: Double): String {

    // valor das diárias
    val diariaPopular: Double = 90.0
    val diariaLuxo: Double = 150.0

    // taxas por Km carro popular
    val taxaPopular1: Double = 0.20
    val taxaPopular2: Double = 0.10

    //taxas por Km carro luxo
    val taxaLuxo1: Double = 0.30
    val taxaLuxo2: Double = 0.25

    when (tipoCarro){
        "popular" -> if(quilometros < 100){
            val totalAluguel: Double = ((diariaPopular * diasAluguel) +(taxaPopular1 * quilometros))
            return "Valor a ser pago: R$$totalAluguel"
        } else{
            val totalAluguel: Double = ((diariaPopular * diasAluguel) +(taxaPopular2 * quilometros))
            return "Valor a ser pago: R$$totalAluguel"
        }
        "luxo" -> if (quilometros < 200){
            val totalAluguel: Double = ((diariaLuxo * diasAluguel) +(taxaLuxo1 * quilometros))
            return "Valor a ser pago: R$$totalAluguel"
        } else{
            val totalAluguel: Double = ((diariaLuxo * diasAluguel) +(taxaLuxo2 * quilometros))
            return "Valor a ser pago: R$$totalAluguel"
        }
        else -> {
            return "opção inválida"
        }
    }
}

// resolução utilizando apenas o "if"

fun calculaAluguel2(){

}


