
//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5

fun main(){
    println("Digite a nota 1")
    val nota1: Double = readLine()!!.toDouble()
    println("Digite a nota 2")
    val nota2: Double = readLine()!!.toDouble()

    val media: Double = (nota1 + nota2)/ 2
    println("A média entre $nota1 e $nota2 é igual a $media")
}