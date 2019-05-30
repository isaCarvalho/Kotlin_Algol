fun fatorial (n : Int) : Int
{
    if (n == 1)
        return 1;

    return n*fatorial(n-1)
}

fun main()
{
    var n : Int = readLine()!!.toInt()

    println(fatorial(n))
}
