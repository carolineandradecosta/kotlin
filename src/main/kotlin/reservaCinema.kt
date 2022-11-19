fun main() {
    val filab: MutableList<String> = populaCadeiras()
    reservaCadeira(filab)
}

fun populaCadeiras(): MutableList<String> {
    val fila = mutableListOf<String>()
    for (i in 0..10) {
        fila.add("b$i")
    }
    println(fila)
    return fila
}
fun reservaCadeira(fila: MutableList<String>) {
    var resp = "s"

    while (resp == "s") {
        println("Escolha a cadeira:")
        val escolha: String = readLine().toString()

        val i = escolha.substringAfter("b").toInt()

        if (fila[i] == escolha) {
            fila[i] = "--"
            println("Cadeira Reservada")
        }else if (fila[i] == "--") {
            println("ERRO! Lugar ocupado!")
        }

        println(fila)
        println("Quer reservar outra cadeira? [n]- nao [s]- sim")
        resp = readLine().toString()
    }
}
