
/*
55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.*/

fun main(){
    for(i in 1..4){
        val numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val numeroSorteado = numeros.random()
        val numeroPalpite = numeros.random()
        println(adivinhaNumeroSorteado(numeroPalpite, numeroSorteado))
    }
}

fun adivinhaNumeroSorteado(nPalpite: Int, nSorteado: Int): String {
    if(nPalpite == nSorteado) return "vc acertou" else return "vc errou"
}
