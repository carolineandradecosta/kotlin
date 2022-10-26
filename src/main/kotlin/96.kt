import java.math.BigDecimal

/*
96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
um aluno e retornar a sua média para o programa principal.*/

fun main(){
    println(Media(7, 9))
}

fun Media(n1: Int, n2: Int): BigDecimal{
    return ((n1 + n2) / 2)!!.toBigDecimal()
}
// 8