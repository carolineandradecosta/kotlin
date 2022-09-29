
//27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
//mostrando uma mensagem no final, de acordo com a média atingida:
//- Média até 4.9: REPROVADO
//- Média entre 5.0 e 6.9: RECUPERAÇÃO
//- Média 7.0 ou superior: APROVADO

fun main(){
    println(mediaAluno())
}

fun mediaAluno(): String{
    
    println("Informe a nota 1: ")
    val nota1 = readLine()!!.toDouble()
    println("Informe a nota 2: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2)/2
    println("A média é: $media")

    if(media <= 4.9){
        return "O aluno está reprovado"
    } else if((media >= 5.0) && (media <= 6.9)){
        return "O aluno está de recuperação"
    } else {
        return "O aluno está aprovado"
    }
}

