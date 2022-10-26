import java.math.BigDecimal
import java.math.RoundingMode

/*
82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece*/

fun main(){
    val notas: List<Double> = listOf<Double>(9.8, 8.4, 7.0, 5.3, 4.2 )
    println(lerNotasAlunos(notas))
    println(mediaTurma(notas))
    println(qtdAlunosAcimaMedia(notas))
    println(maiorNotaDigitada(notas))
    println(posicaoMaiorNota(notas))
}

fun lerNotasAlunos(nota: List<Double>): List<Double>{
    return nota
}

fun mediaTurma(nota: List<Double>): BigDecimal{
    return nota.average().toBigDecimal().setScale(2, RoundingMode.UP)
}

fun qtdAlunosAcimaMedia(nota: List<Double>): Int{
    return nota.filter { it > 7.0 }.size
}

fun maiorNotaDigitada(nota: List<Double>): Double{
    return nota.max()
}

fun posicaoMaiorNota(nota: List<Double>){
    for(i in nota.indices){
        if(nota[i] == nota.max()){
            print("$i ")
        }
    }
}