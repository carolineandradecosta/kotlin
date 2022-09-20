
//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.

fun main(){
    println(alistamentoMilitar(2002))
}

fun alistamentoMilitar(anoNascimento: Int):String{
    val anoAtual: Int = 2022
    val idadeAtual: Int = anoAtual - anoNascimento
    if (idadeAtual < 18){
        val anosAindaFalta: Int = 18 - idadeAtual
        return "Ainda faltam $anosAindaFalta anos para o seu alistamento militar"
    } else {
        val anosQuePassaram: Int = idadeAtual - 18
        return "Já se passaram $anosQuePassaram anos desde o seu alistamento militar"
    }
}