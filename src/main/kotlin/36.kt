
/*
36) Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.*/

fun main(){
    println(calculaPontos(20))
}

fun calculaPontos(horasAtividade: Int): String{

    val valorPorCadaPonto: Double = 0.05

    val pontuacaoNivel1: Int= 2
    val pontuacaoNivel2: Int= 5
    val pontuacaoNivel3: Int= 10

    if(horasAtividade < 10){
        val totalPontos = horasAtividade * pontuacaoNivel1
        val valorGanho = totalPontos * valorPorCadaPonto
        return "Você conseguiu $totalPontos pontos e R$$valorGanho"
    } else if (horasAtividade < 20){
        val totalPontos = horasAtividade * pontuacaoNivel2
        val valorGanho = totalPontos * valorPorCadaPonto
        return "Você conseguiu $totalPontos pontos e R$$valorGanho"
    } else {
        val totalPontos = horasAtividade * pontuacaoNivel3
        val valorGanho = totalPontos * valorPorCadaPonto
        return "Você conseguiu $totalPontos pontos e R$$valorGanho"
    }
}

// Você conseguiu 200 pontos e R$10.0