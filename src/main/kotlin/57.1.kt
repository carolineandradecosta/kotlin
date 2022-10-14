
/*
57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.*/

fun main(){
    val Sexos = listOf<String>("feminino", "feminino", "masculino", "feminino", "masculino")
    val salarios = listOf<Double>(3500.0, 5300.0, 3100.0, 7000.0, 2800.0)
    println(salariosHomens(salarios))
    println(salariosMulheres(salarios))
}

fun salariosHomens(s: List<Double>): Double{
    val somaSalarioHomens = s.filter { it < 3500 }.sum()
    return somaSalarioHomens
}

fun salariosMulheres(s: List<Double>): Double{
    val somaSalarioMulheres = s.filter { it > 3500.0 }.sum()
    return somaSalarioMulheres
}

