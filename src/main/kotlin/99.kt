import java.math.BigDecimal
import java.math.RoundingMode

/*
99) Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 5² = 25*/

fun main(){
    println(Potencia(5,2))
}

fun Potencia(base: Int, expoente: Int): BigDecimal{
    return Math.pow(base.toDouble(), expoente.toDouble())!!.toBigDecimal().setScale(2, RoundingMode.UP)
}

