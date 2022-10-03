
/*
37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 até 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%
- Homens
- menos de 20 anos de empresa: +3%
- de 20 até 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%     */

fun main(){
    println(reajustaSalario(2800.0, "mulher", 10))
}

fun reajustaSalario(salarioAtual:Double, genero: String, anosNaEmpresa: Int): String{
    when (genero){
        "mulher" -> if (anosNaEmpresa < 15){
            val novoSalario = salarioAtual + (0.05 * salarioAtual)
            return "Seu novo salário é: R$$novoSalario"
        } else if (anosNaEmpresa < 20){
            val novoSalario = salarioAtual + (0.12 * salarioAtual)
            return "Seu novo salário é: R$$novoSalario"
        } else {
            val novoSalario = salarioAtual + (0.23 * salarioAtual)
            return "Seu novo salário é: R$$novoSalario"
        }
        "homem" -> if (anosNaEmpresa < 20){
            val novoSalario = salarioAtual + (0.03 * salarioAtual)
            return "Seu novo salário é: R$$novoSalario"
        } else if (anosNaEmpresa < 30){
            val novoSalario = salarioAtual + (0.13 * salarioAtual)
            return "Seu novo salário é: R$$novoSalario"
        } else {
            val novoSalario = salarioAtual + (0.25 * salarioAtual)
            return "Seu novo salário é: R$$novoSalario"
        }
        else -> {
            return "dados inválidos"
        }
    }
}

// Seu novo salário é: R$2940.0