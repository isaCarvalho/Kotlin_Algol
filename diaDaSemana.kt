fun main() {

    var dia : Int

    do {
        println("Digite um numero entre 1 e 5:")
        dia = readLine()!!.toInt()
    } while (dia < 1 || dia > 5)

    when(dia)
    {
        1 -> println("1 - Segunda-feira")
        2 -> println("2 - Terca-feira")
        3 -> println("3 - Quarta-feira")
        4 -> println("4 - Quinta-feira")
        5 -> println("5 - Sexta-feira")
    }
}
