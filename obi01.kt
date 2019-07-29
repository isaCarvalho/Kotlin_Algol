import java.util.*

fun existe (vet : ArrayList<Int>, ini: Int, fim : Int, elem : Int) : Int
{
	var cont = 0

	for (i in ini..(fim-1))
		if (vet[i] == elem && vet[i] != vet[i+1])
			cont++

	println("\nelem: $elem\ncont: $cont")
	
	if (cont == 2)
		return 2

	return 0
}

fun main(args: Array<String>)
{
	val n = readLine()!!.toInt()

	val vet = ArrayList<Int>()
	val s = Scanner(System.`in`)

	for (i in 0..(n-1))
		vet.add(s.nextInt())

	if (n == 1)
	{
		println(1)
		return
	}

	var soma = 0
	for (i in 0..(n-1))
		soma += existe(vet, i, n-1, vet[i])
	
	println(soma)
}