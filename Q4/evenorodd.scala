// 19000642
// Question - 04

import scala.io.StdIn.readInt;

object evenorodd extends App{
	def iseven(n:Int):Boolean = 
		if(n==0) true
		else if(n==1) return false
		else if(n<0) iseven(-n)
		else iseven(n-2)
    
    print("Enter the number: ");
    var num = readInt();
    if(iseven(num)) 
        println("Even Number"); 
    else 
        println("Odd Number");      
}