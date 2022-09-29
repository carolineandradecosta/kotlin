
//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
//- Até 3 anos de empresa: aumento de 3%
//- entre 3 e 10 anos: aumento de 12.5%
//- 10 anos ou mais: aumento de 20%

fun main(){
    println(salarioReajustado())
}

fun salarioReajustado(): String {

    println("Informe o nome do funcionário")
    val nome:String? = readLine()
    println("Informe o atual salário do funcionário")
    val salarioAtual: Double = readLine()!!.toDouble()
    println("A quantos anos o funcionário trabalha na empresa?")
    val anoEmpresa: Int = readLine()!!.toInt()

    if (anoEmpresa < 3){
        val novoSalario:Double = salarioAtual + (salarioAtual * 0.03)
        return "O novo salário é: R$$novoSalario"
    } else if (anoEmpresa <= 10) {
        val novoSalario:Double = salarioAtual + (salarioAtual * 0.125)
        return "O novo salário é: R$$novoSalario"
    } else {
        val novoSalario:Double = salarioAtual + (salarioAtual * 0.2)
        return "O novo salário é: R$$novoSalario"
    }
}