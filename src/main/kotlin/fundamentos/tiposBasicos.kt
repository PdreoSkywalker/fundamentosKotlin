package fundamentos

/**
 * Inteiros: Byte/Short/Int/long
 * Números Reais: Float/Double
 * Caractere: Char
 * Boolean: True or false
 * TUDO EM KOTLIN É OBJETO.
 * */
fun main()
{
    val num1: Byte = 127 // 1 Byte
    val num2:Short = 32767 // 2 Bytes
    val num3:Int = 2_147_483_647 // 4 Bytes
    val num4:Long = Long.MAX_VALUE // 8 Bytes

    val num5:Float = 3.14f
    val num6:Double = 3.14

    val num7:Char = '?'

    val bool:Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, num7, bool))
}