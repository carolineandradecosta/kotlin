
/*
51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados.*/

fun main(){
    mostraMaiorEMenor()
}

fun mostraMaiorEMenor(){
    var menorValor = 99999
    var maiorValor = 0

    var contador = 1

    while(contador <= 8){
        println("Informe o preço do produto $contador")
        val valorInformado = readLine()!!.toInt()

        if(valorInformado < menorValor){
            menorValor = valorInformado
        } else if (valorInformado > maiorValor){
            maiorValor = valorInformado
        }
        contador += 1
    }
    println("menor valor: $menorValor")
    println("maior valor: $maiorValor")
}

/*
Informe o preço do produto 1
586
Informe o preço do produto 2
530
Informe o preço do produto 3
3
Informe o preço do produto 4
7
Informe o preço do produto 5
13
Informe o preço do produto 6
33
Informe o preço do produto 7
31
Informe o preço do produto 8
8952
menor valor: 3
maior valor: 8952          */
