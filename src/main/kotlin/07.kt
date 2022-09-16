
//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

fun main(){
    println(calculaDobro(3.5))

}

fun calculaDobro(n: Double): String{
    val dobro = n*2
    val tercaParte = ((1/3)* n)

    return "O dobro de $n é $dobro e a terça parte é $tercaParte"
}

//Dúvida: Por que o resultado da terça parte está dando 0.0?