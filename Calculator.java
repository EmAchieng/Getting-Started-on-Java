//import java.util.* means you will get everything from that package
//import java.util.Scanner or whatever library name means you only need that specific thing


import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Calculator {
	public static void main (String[]  args)  {


		List<String> validOperators = Arrays.asList(
			"+", "-", "/", "*");

		Scanner scanner = new Scanner(System.in);

		// number then operator, then the other number then calculator
		
		float firstNumber;
		

		while(true) {

		

		if(!scanner.hasNextFloat()) {
		System.out.println("Enter a number:");
      } else {
		//next methods check for you if the data type is what is required
		firstNumber = scanner.nextFloat();
		System.out.println("user entered:"  + firstNumber);
	    break;
}

}
	    String operator = "";
	    while(!validOperators.contains(operator))  {
        System.out.println("Please enter +, -, * or /:");
        operator = scanner.next();
        System.out.println("user entered:" + operator);
    }

        System.out.println("Enter the second number:");
		float secondNumber = scanner.nextFloat();
		System.out.println("user entered:"  + secondNumber);


        if("+".equals(operator)) {
        	System.out.println("Sum:" + (firstNumber + secondNumber));
             




        }
          else if ("-".equals(operator)) {
 	      System.out.println("Difference:" + (firstNumber - secondNumber));
 }
          else if ("*".equals(operator)) {
          	System.out.println("Product:" + (firstNumber * secondNumber));
          }

          else if("/".equals(operator))  {
          	System.out.println("Quotient:" + (firstNumber / secondNumber));
          } 
   
          
          
	}   
}





/*
Java Class Scanner is the class we are going to use

it is from the standard library

java.util is a package

a package is used to organize things, especially when you have several classes


/*
whenever you make improvements, make sure you check what should be removed.

*/



