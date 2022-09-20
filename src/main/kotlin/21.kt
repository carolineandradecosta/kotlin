
//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO.

 fun main(){
    println(anoBissexto(1926))
 }

fun anoBissexto(ano: Int): String{
    if((ano % 4 ==0) || (ano % 400 == 0)){
        return "O ano $ano é Bissexto."
    } else {
        return "O ano $ano não é Bissexto."
    }
}

// O ano 1926 não é Bissexto.