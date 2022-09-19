
//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).

fun main(){
    println(calculaMedia())
}

fun calculaMedia(){
    println("Informe o seu nome")
    val nome = readLine()
    println("Informe sua primeira nota")
    val nota1: Double = readLine()!!.toDouble()
    println("Informe sua segunda nota")
    val nota2: Double = readLine()!!.toDouble()

    val media: Double = (nota1 + nota2)/2
    println("Sua média é: $media")

    if(media >= 7.0){
        println("Você está aprovado!")
    } else {
        println("Você está reprovado")
    }
}