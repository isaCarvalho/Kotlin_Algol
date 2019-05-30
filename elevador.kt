import java.util.*

fun selector (n : Int) : Int = n

fun main(args: Array<String>)
{
	val n = readLine()!!.toInt()

	val vet = ArrayList<Int>()
	var aux = Scanner(System.`in`)

	for (i in 0..n-1)
		vet.add(aux.nextInt())

	vet.sortBy({selector(it)})

	if (vet[0] > 8)
	{
		println("N")
		return
	}

	for (i in 1..n-1)
	{
		if ((vet[i] - vet[i-1]) > 8)
		{
			println("N")
			return
		}
	}

	println("S")

}