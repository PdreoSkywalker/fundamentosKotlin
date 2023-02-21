package fundamentos

/*
* Funções são basicamente receitas de bolo.
* Primeiro damos os ingredientes (Paramentros); Depois como vai ser preparado (Função); E a saída que seria ele pronto.
* em Kotlin: fun nomeDaFuncao(parametro: Tipo,...):Tipo de retorno{}
* fun nomeDaFuncao():Retorno{}
* fun nomeDaFuncao(parametros){}
* fun nomeDaFuncao(){}
* */

fun imprimirSoma(a: Int, b: Int) {
    println(a + b)
}
fun soma(a: Int, b:Int = 1):Int{
    return a+b
}

fun main() {

    imprimirSoma(4, 9)
    println(soma(2,3))
    println(soma(13))
}