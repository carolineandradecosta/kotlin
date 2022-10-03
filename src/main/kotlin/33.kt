
//33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.

fun main(){
    println(aprovaEmprestimo(150000.00, 1500.00, 30))
}

fun aprovaEmprestimo(valorCasa: Double, salarioComprador: Double, qtdAnosPagar: Int): String{
    val qtdParcelas = qtdAnosPagar * 12
    val prestacaoMensal = valorCasa/qtdParcelas
    if (prestacaoMensal/salarioComprador *100 <= 30){
        return "Empréstimo Aprovado"
    } else {
        return "Empréstimo Negado"
    }
}