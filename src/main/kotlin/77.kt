
/*
77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.*/

fun main(){
    val nomes = listOf<String>("Carol", "Mel", "Gael", "Celiane","Marcos")
    println(listaNomesInversa(nomes))

}
fun listaNomesInversa(n:List<String>): List<String>{
    return n.reversed()
}