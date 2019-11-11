fun main()
{
    var num : Float
    var cont = 0

    for (i in 0..5)
    {
        num = readLine()!!.toFloat()
        if (num > 0)
            cont = cont + 1
    }

    println("$cont valores positivos")
}