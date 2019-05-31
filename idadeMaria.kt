import java.util.*

fun max (a : Int, b : Int) : Int
{
	if (a > b)
		return a

	return b
}

fun main(args: Array<String>)
{
	val maria = readLine()!!.toInt()
	val a = readLine()!!.toInt()
	val b = readLine()!!.toInt()

	val c = maria - a - b

	println(max(c, max(a, b)))
}