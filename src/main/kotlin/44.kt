
/*
44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!*/

fun main(){
    contagem6(3,10,2)
}

fun contagem6(primeiroValor: Int, ultimoValor: Int, incremento: Int){
    for(i in primeiroValor..ultimoValor step incremento){
        print("$i ")
    }
    print("Acabou!")
}

//3 5 7 9 Acabou!
