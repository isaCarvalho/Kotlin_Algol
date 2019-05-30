import java.util.*
import java.util.zip.DeflaterOutputStream
import kotlin.math.sqrt

fun baskhara(a : Double, b : Double, c : Double) : Unit
{
    fun rdelta (a: Double, b: Double, c: Double) : Double {

        var delta = b * b - (4 * a * c)
        if (delta < 0 || a == 0.0)
            return -1.0

        return sqrt(delta);
    }

    var x = rdelta(a, b, c)

    if (x == -1.0)
    {
        println("Impossivel calcular")
        return
    }

    var x1 = ((-b + x)/2*a)
    var x2 = ((-b - x)/2*a)

    println("R1 = %.5f".format(x1/100))
    println("R2 = %.5f".format(x2/100))
}

fun main(args: Array<String>) {

    var (a, b, c) = readLine()!!.split(' ').map(String::toDouble)

    baskhara(a, b, c)
}
