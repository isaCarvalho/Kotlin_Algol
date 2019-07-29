import java.util.*;

fun main(args: Array<String>)
{
    val n1 = readLine()!!.toDouble()
    val n2 = readLine()!!.toDouble()
    val n3 = readLine()!!.toDouble()

    println("MEDIA = %.1f".format((2*n1+3*n2+5*n3)/10))
}