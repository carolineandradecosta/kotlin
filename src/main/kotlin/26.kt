
//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais

fun main(){
    println(calculaMaiorNumero())
}

fun calculaMaiorNumero(): String{
    println("Informe o primeiro número")
    val numero1: Int = readLine()!!.toInt()
    println("Informe o segundo número")
    val numero2: Int = readLine()!!.toInt()

    if (numero1 > numero2){
        return "O número $numero1 é maior que o número $numero2"
    } else if (numero2 > numero1) {
        return "O numero $numero2 é maior que o número $numero1"
    } else {
        return "O número $numero1 e número $numero2 são iguais"
    }
}