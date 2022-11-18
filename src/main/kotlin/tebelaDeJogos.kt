// ler o nome de três times e exibe uma tabela de todos os jogos possíveis.

fun main(){
    val times = listOf<String>("Vasco", "Flamengo", "Botafogo")
    formaTabela(times)
}

fun formaTabela(time: List<String>){
    println("          TABELA DE PARTIDAS")

    for(i in 0..2){
        for(j in 0..2){
            if(i != j){
                println("${time[i]}          [ ]  x  [ ]          ${time[j]}")
            }
        }
    }
}

