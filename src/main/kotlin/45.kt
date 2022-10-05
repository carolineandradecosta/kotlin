
/*44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!

45) O programa acima vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação.*/

fun main(){
    contagem7(3,10,2)
}

fun contagem7(primeiroValor: Int, ultimoValor: Int, incremento: Int){
    if (primeiroValor > ultimoValor){
        println("Erro! O primeiro valor deve ser maior que o último valor")
    } else {
        for(i in primeiroValor..ultimoValor step incremento){
            print("$i ")
        }
        print("Acabou!")
    }
}

//3 5 7 9 Acabou!