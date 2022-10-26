import java.math.BigDecimal

/*
100) Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media().*/


fun main(){
    val mediaAluno = Media2(2, 3)
    println(Situacao(mediaAluno))
}

fun Media2(n1: Int, n2: Int): Double {
    return ((n1 + n2) / 2)!!.toDouble()
}

fun Situacao(media: Double): String{

    if(media <= 4.9){
        return "O aluno está reprovado"
    } else if((media >= 5.0) && (media <= 6.9)){
        return "O aluno está de recuperação"
    } else {
        return "O aluno está aprovado"
    }
}

// O aluno está reprovado