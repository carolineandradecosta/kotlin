
/*57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.*/

fun main(){
    lerSalarioESexo()
}

fun lerSalarioESexo(){
    var opcao = 1
    var somaFeminino = 0.0
    var somaMasculino = 0.0

    while (opcao == 1){
        println("Sexo do funcionário: [f- feminino/ m- masculino]")
        val sexo = readLine()!!.toString()
        println("Salário do funcionário:")
        val salario = readLine()!!.toDouble()

        when (sexo){
            "f" -> somaFeminino += salario
            "m" -> somaMasculino += salario
        }

        println("Deseja continuar? [1- Sim/ 2- Não]")
        opcao = readLine()!!.toInt()
    }
    println("Soma salário das Mulheres: $somaFeminino")
    println("Soma salário dos Homens: $somaMasculino")
}