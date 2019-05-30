fun main()
{
    val ddd = HashMap<Int, String>()

    ddd.put(61, "Brasilia")
    ddd.put(71, "Salvador")
    ddd.put(11, "Sao Paulo")
    ddd.put(21, "Rio de Janeiro")
    ddd.put(32, "Juiz de Fora")
    ddd.put(19, "Campinas")
    ddd.put(27, "Vitoria")
    ddd.put(31, "Belo Horizonte")

    val n = readLine()!!.toInt()
    
    if (ddd[n] != null)
        println(ddd[n])
    else
        println("DDD nao cadastrado")
}