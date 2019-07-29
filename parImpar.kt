fun main(args: Array<String>) 
{
	val	x = readLine()!!.toInt()

	for (i : Int in 1..x)
	{
		var n = readLine()!!.toInt()
		if (n == 0)
		println("NULL");
		else if (n < 0)
		{
			if (n % 2 == 0)
				println("EVEN NEGATIVE");
			else
				println("ODD NEGATIVE");
		}
		else
		{
			if (n % 2 != 0)
				println("ODD POSITIVE");
			else
				println("EVEN POSITIVE");
		}
	}

	
}