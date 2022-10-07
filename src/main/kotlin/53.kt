
/*
53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos*/

fun main(){
    classificaIdadeSexo()
}

fun classificaIdadeSexo(){

    var contador: Int = 0

    val sexos: MutableList<String> = mutableListOf<String>()
    val idadesMulheres = mutableListOf<Int>()
    val idadesHomens = mutableListOf<Int>()
    val idadeTodas = mutableListOf<Int>()

    while (contador <= 2){
        println("Informe o seu sexo: ")
        val sexo:String = readLine()!!.toString()
        println("Informe a sua idade: ")
        val idade = readLine()!!.toInt()
        idadeTodas.add(idade)

        when(sexo){
            "feminino" -> {
                idadesMulheres.add(idade)
                sexos.add(sexo)
            }
            "masculino" -> {
                idadesHomens.add(idade)
                sexos.add(sexo)
            }
        }
    contador += 1
    }
    println("Idades mulheres: $idadesMulheres")
    println("Idades homens: $idadesHomens")
    println("Lista de sexos: $sexos")
    println("Todas as idades: $idadeTodas")
    println()

    val qtdHomens = sexos.filter { it == "masculino" }.size
    println("Quantidade de homens cadastrados $qtdHomens")
    val qtdMulheres = sexos.filter { it == "feminino" }.size
    println("Quantidade de mulheres cadastradas $qtdMulheres")

    val mediaGrupo = idadeTodas.average()
    println("Média de idade do grupo: $mediaGrupo")

    val mediaHomens = idadesHomens.average()
    println("Média de idade dos homens: $mediaHomens")

    val mulheresMais20 = idadesMulheres.filter { it > 20 }.size
    println("Quantidade de mulheres com mais de 20 anos: $mulheresMais20")
}
