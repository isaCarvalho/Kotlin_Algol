import java.util.*

fun area(raio :Double): Double = 3.14159 * raio * raio

fun main(args: Array<String>) {

    var r = readLine()!!.toDouble()

    println("A=%.4f".format(area(r)))
}
