// Cálculo do maior divisor comum entre dois numeros com complexidade O(n)

fun main() 
{
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()

    var mdc = 1
    var maior = 0
    var menor = 0


    if (n1 > n2)
    {
        maior = n1
        menor = n2
    } else {
        maior = n2
        menor = n1
    }
    
    for (i in 1..menor)
        if (maior % i == 0 && menor % i == 0)
            mdc = i

    println("O mdc entre $menor e $maior eh $mdc")
}
