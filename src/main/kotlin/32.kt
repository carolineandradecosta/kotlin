
//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
//jogador vai tentar descobrir qual foi o valor sorteado.

fun main(){
    println(descobrirNumero(2))
}

fun descobrirNumero(numeroJogador: Int): String{
    val numeros = listOf(1, 2, 3, 4, 5)
    val numeroSorteado = numeros.random()
    println("Número sorteado: $numeroSorteado")
    println("Número Jogador: $numeroJogador")

    if(numeroJogador == numeroSorteado) return "Você advinhou o número sorteado" else return "Você errou o número sorteado"
}
