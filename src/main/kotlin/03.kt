
/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/

fun main (){
    println("Informe o nome do funcionário: ")
    val nome: String? = readLine()
    println("Informe o salário do funcionário: ")
    val salario = readLine()
    println("O funcionário $nome tem um salário de R$$salario em setembro.")



}
/*Dúvida: por que não consigo declarar a variável salário como sendo um double? */

//val salario = readLine()!!.toDouble()
