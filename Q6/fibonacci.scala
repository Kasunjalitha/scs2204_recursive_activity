// 19000642
// Question - 06

import scala.io.StdIn.readInt;

object fibonacci extends App{
	def fib(n:Int): Int = 
		if(n == 0) 0
		else if(n == 1) 1
		else fib(n-1) + fib(n-2)
  
    print("Enter the number: ");
    var num = readInt();
	var x = 0;
    for( x <- 0 to num ){
   		print(fib(x) + " ");
	}    
}