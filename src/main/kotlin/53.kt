
/*
53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos*/

fun main(){
//    val idades = listOf(85, 50, 4, 25, 30)
//    val sexos = listOf("feminino", "masculino", "masculino", "feminino", "feminino")
    classificaIdadeSexo()
}

// solução incompleta

fun classificaIdadeSexo(){
//    println(sexo.filter { it == "masculino" }.size)
//    println(sexo.filter { it == "feminino" }.size)
//    println(idade.average())

    var contador: Int = 0
    val sexos: MutableList<String> = mutableListOf<String>()
    //val sexos: Array<String>  = arrayOf()
    val idadesMulheres = mutableListOf<Int>()
    val idadesHomens = mutableListOf<Int>()


    while (contador <= 2){
        println("Informe o seu sexo: ")
        val sexo:String = readLine()!!.toString()
        println("Informe a sua idade: ")
        val idade = readLine()!!.toInt()

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



//    for (i in 0 .. 2 ){
//
//        println("Informe o seu sexo: ")
//        val sexo:String = readLine()!!.toString()
//
//        when (sexo){
//            "feminino" -> {
//                println("Informe a sua idade: ")
//                idadesMulheres[i]= readLine()!!.toInt()
//                //sexos[i] = sexo
//            }
//            "masculino" ->{
//                println("Informe a sua idade: ")
//                idadesHomens[i] = readLine()!!.toInt()
//                //sexos[i] = sexo
//            }
//        }
//
//    }
    println(idadesMulheres)
    println(idadesHomens)
    println(sexos)
}
