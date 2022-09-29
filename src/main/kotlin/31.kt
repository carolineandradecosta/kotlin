
//31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

fun main(){
    println(joKenPo())
}
// primeira alternativa

//fun joKenPo(): String{
//    println("Escolha jogador1: 1- Pedra; 2- Papel; 3- Tesoura")
//    val numeroUsuario = readLine()!!.toInt()
//    println("Escolha jogador2: 1- Pedra; 2- Papel; 3- Tesoura")
//    val numeroMaquina = readLine()!!.toInt()
//
//    if (numeroUsuario == numeroMaquina ){
//        return "Empate"
//    } else if(((numeroUsuario == 1 && numeroMaquina == 2)) || ((numeroUsuario == 2 && numeroMaquina == 1))){
//        return "pedra vs papel = papel"
//    } else if (((numeroUsuario == 1 && numeroMaquina == 3)) || ((numeroUsuario == 3 && numeroMaquina == 1))){
//        return "pedra vs tesoura = pedra"
//    } else if(((numeroUsuario == 2 && numeroMaquina == 3)) || ((numeroUsuario == 3 && numeroMaquina == 2))){
//        return "papel vs tesoura = tesoura"
//    } else {
//        return "0"
//    }
//}

// segunda alternativa com melhoramento

fun joKenPo(): String{

    val pedra = "pedra"
    val papel = "papel"
    val tesoura = "tesoura"

    println("Escolha do jogador1: Pedra; Papel; Tesoura")
    val jogadaUsuario1 = readLine()
    println("Escolha do jogador2: Pedra; Papel; Tesoura")
    val jogadaUsuario2 = readLine()

    if (jogadaUsuario1 == jogadaUsuario2 ){
        return "Jogada do jogador1: $jogadaUsuario1 VS Jogada do jogador2: $jogadaUsuario2 = Empate"
    } else if(((jogadaUsuario1 == pedra && jogadaUsuario2 == papel)) || ((jogadaUsuario1 == papel && jogadaUsuario2 == pedra))){
        return "Jogada do jogador1: $jogadaUsuario1 VS Jogada do jogador2: $jogadaUsuario2 = Papel venceu"
    } else if (((jogadaUsuario1 == pedra && jogadaUsuario2 == tesoura)) || ((jogadaUsuario1 == tesoura && jogadaUsuario2 == pedra))){
        return "Jogada do jogador1: $jogadaUsuario1 VS Jogada do jogador2: $jogadaUsuario2 = Pedra venceu"
    } else if(((jogadaUsuario1 == papel && jogadaUsuario2 == tesoura)) || ((jogadaUsuario1 == tesoura && jogadaUsuario2 == papel))){
        return "Jogada do jogador1: $jogadaUsuario1 VS Jogada do jogador2: $jogadaUsuario2 = Tesoura venceu"
    } else {
        return "0"
    }
}


