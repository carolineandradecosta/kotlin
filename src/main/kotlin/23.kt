
//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto

fun main(){
    println(calculaDesconto("carol", "mulher", 250.00))
}

fun calculaDesconto(nome: String, sexo: String, valor: Double): String{
    //val sexo1:String = "mulher"
    //val sexo2:String = "homem"

    if(sexo.equals("mulher")){
        val descontoMulher: Double = valor - (valor * 0.13)
        return "Valor sem o desconto: R$$valor .Valor com desconto: R$$descontoMulher"

    } else if (sexo.equals("homem")) {
        val descontoHomem: Double = valor - (valor * 0.05)
        return "Valor sem desconto: R$$valor .Valor com desconto: R$$descontoHomem"

    } else {
        return "0"
    }
}

// Valor sem o desconto: R$250.0 .Valor com desconto: R$217.5