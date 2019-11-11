import kotlin.io.*
import java.util.*

fun main()
{
    val n  = readLine()!!.toInt()
	val aux : ArrayList<Int> = ArrayList()
	var reader = Scanner(System.`in`)

	for (i : Int in 0..n-1)
	{
		aux.add(reader.nextInt())
		
	}

    var menor : Int = aux[0]
    var pos = 0

    for (i : Int in 0..n-1)
    {
        if (aux[i] < menor)
        {
            menor = aux[i]
            pos = i
        }
    }

    println("Menor valor: $menor")
    println("Posicao: $pos")
}
