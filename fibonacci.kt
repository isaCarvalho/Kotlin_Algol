fun fibonacci (n : Int) : Int
{
    if (n == 1 || n == 2)
        return 1

    return fibonacci(n-1) + fibonacci(n-2)
}

fun main()
{
    var n : Int = readLine()!!.toInt()

    println(fibonacci(n))
}
