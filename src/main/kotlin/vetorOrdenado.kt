// ordenar o vetor

fun main(){
    val vetor: IntArray = intArrayOf(5, 9, 0, 6)
    println(ordenaVetor(vetor).contentToString())
}

fun ordenaVetor(vetor1: IntArray): IntArray{
    var aux: Int = 0
    for(i in 0..2){
        for(j in i+1..3){
            if(vetor1[i] > vetor1[j]){
                aux = vetor1[i]
                vetor1[i] = vetor1[j]
                vetor1[j] = aux
            }
        }
    }
    return vetor1
}