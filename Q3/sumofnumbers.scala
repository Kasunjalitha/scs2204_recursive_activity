// 19000642
// Question - 03

import scala.io.StdIn.readInt;

object sumofnumbers extends App{	
	def sum(n:Int):Int = 
		if(n==1) 1
		else n + sum(n-1)

	print("Enter the number: ");
	var num = readInt();
	if(num == 0) println("0")
	else println(sum(num))
}