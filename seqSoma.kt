import java.util.*

fun menor (a: Int, b: Int) : Int
{
    if (a < b)
        return a

    return b
}

fun maior (a: Int, b: Int) : Int
{
    if (a > b)
        return a

    return b
}

fun main(args: Array<String>) {

	var min : Int
    var max : Int
    var soma : Int

    do 
    {
        var (a,b) = readLine()!!.split(' ').map(String::toInt)
        if (a <= 0 || b <= 0)
            break

        min = menor(a, b)
        max = maior(a, b)

        soma = 0
        for (i : Int in min .. max)
        {
            print("$i ")
            soma += i
        }
        println("Sum=$soma")

    } while (true)
	
}