
//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

fun main(){
    println(calculaSalario(1250.00))

}

fun calculaSalario (s: Double):String {
    val salarioNovo = (s* 0.15)+ s
    return "O novo salário é de: R$$salarioNovo"
}

