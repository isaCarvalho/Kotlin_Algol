import java.util.*

fun main(args: Array<String>)
{
    var n = readLine()!!.toInt()

    val lista = ArrayList<Int>()
    val lista2 = ArrayList<Int>()
    val p = ArrayList<Int>()

    for (i in 0..(n-1))
    {
        var x = readLine()!!.toInt()
        lista.add(x)
    }

    val m = readLine()!!.toInt()

    for (elem in lista)
    {
        lista2.add(m-elem)
    }

    for (elem in lista)
    {
        var x = lista2.indexOf(elem)
        if (x != -1)
            p.add(x)
    }

    val x1 = lista.get(p.get(1))
    val x2 = lista.get(p.get(0))
    println(x1.toString() + " "  + x2)
}