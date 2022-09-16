
//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

fun main(){
    println(calcula(10))
}

fun calcula(n: Int): String{
    val antecessor: Int = n -1
    val sucessor: Int = n +1

    return "O antecessor de $n é $antecessor e o sucessor de $n é $sucessor"
}

// Dúvidas: A função obriga retornar um Int, no entanto, eu quero retornar duas frases (String + Int)
// Fiz uma alteração de Tipo (Int para String) para resolver isso

// É possível retornar dois valores distintos na mesma função?
// ex: return "O antecessor de $n é $antecessor"
//     return "O sucessor de $n é $sucessor"





