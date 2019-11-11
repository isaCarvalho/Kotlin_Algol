fun main()
{
    var num : Float
    var cont = 0
    var media = 0.0

    for (i in 0..5)
    {
        num = readLine()!!.toFloat()
        if (num > 0) 
        {
            cont = cont + 1
            media = media + num
        }
    }

    println("$cont valores positivos")
    println(media/4)
}