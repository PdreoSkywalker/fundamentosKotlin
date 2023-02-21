package minhasBrincadeiras

import kotlin.math.roundToLong

fun main() {

    /**
     * Poderia ter um contador para ir adicionando às moedas que você achou ou consegui.
     * Ter também a opção de adcionar valores maiores no contador, como R$1,00; R$ 0,50 entre outros.
     * Interessante se o ficasse salvo. Assim seria como registro, da aventura.
     * * */

    val milhao = 1000000
    val centavos = 0.05
    val resultado = milhao / centavos
    var saldo: Double = 0.0
    saldo += 5.5

    fun calculaMoedas(): Double {
        return resultado - centavos
    }

    println("Faltam ${calculaMoedas().toLong()} de moedas de 5 centavos")
    println("Com o seu saldo ${saldo}, faltam ${milhao-saldo} reais")

}
