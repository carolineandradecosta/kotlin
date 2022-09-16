
/*
11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.*/

fun main(){
    println(calculaDelta())
}

fun calculaDelta():String{
    println("Informe o valor de A")
    val a: Double = readLine()!!.toDouble()
    println("Informe o valor de B")
    val b: Double = readLine()!!.toDouble()
    println("Informe o valor de C")
    val c: Double = readLine()!!.toDouble()

    val delta: Double = Math.pow(b.toDouble(), 2.0 )-(4*a*c)
    return "O valor de dela eh: $delta"
}

//Dúvida: Só existe essa forma de escrever potência?