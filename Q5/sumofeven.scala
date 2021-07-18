// 19000642
// Question - 05

import scala.io.StdIn.readInt;

object sumofeven extends App{
	def iseven(n:Int):Boolean = 
		if(n==0) true
		else if(n==1) return false
		else if(n<0) iseven(-n)
		else iseven(n-2)

	def sum(n:Int):Int = 
		if(n==2) 2
		else n + sum(n-2)
   
    print("Enter the number: ");
    var num = readInt();
    if(num <= 1)
    	println(0)
    else if(iseven(num)) 
       	println(sum(num));
    else 
        println(sum(num-1))      
}