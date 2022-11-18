// corrige a prova de um aluno tendo como referência um gabarito

fun main() {
    val gabaritos = listOf<String>("c", "d", "a", "b", "c")

    val respAluno1 = listOf<String>("a", "d", "a", "c", "d")
//    val respAluno2 = listOf<String>("b", "d", "a", "b", "c")

    verificaGabarito(respAluno1, gabaritos)
}

fun verificaGabarito(aluno1: List<String>, gabarito: List<String>) {
    var contaRespostasCertas = 0
    for (i in 0..4) {
        if (aluno1[i] == gabarito[i]) {
            contaRespostasCertas += 1
        }
    }
    println(contaRespostasCertas)
}


