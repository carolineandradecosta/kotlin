
/*
85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.*/

fun main(){
    val nomes = listOf<String>("Caroline", "Celiane", "Marcos", "Matheus", "Helen")
    val sexos = listOf<String>("feminino", "feminino", "Masculino", "Masculino", "feminino")
    val salarios = listOf<Double>(5200.00, 6100.00, 4900.00, 3950.00, 5360.00)

    mulheresMais5k(nomes, sexos, salarios)
}

fun mulheresMais5k(nome: List<String>, sexo: List<String> ,salario: List<Double>){
    for(i in 0..4){
        if((salario[i] > 5000) && (sexo[i] == "feminino")){
            println("${nome[i]} : ${salario[i]} ")
        }
    }
}
