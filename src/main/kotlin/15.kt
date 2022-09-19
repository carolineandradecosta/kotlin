
//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//por hora trabalhada.

fun main(){
    println(calculaSalario(22))
}

fun calculaSalario(dias: Int): String{
    val horasDeTrabalho: Int = 8
    val valorPorHoraDeTrabalho: Double = 25.00
    val salarioFuncionario = horasDeTrabalho * valorPorHoraDeTrabalho * dias
    return "O salário do funcionário é de: R$$salarioFuncionario"
}

// O salário do funcionário é de: R$4400.0


