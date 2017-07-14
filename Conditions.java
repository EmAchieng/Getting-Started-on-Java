public class Conditions {
	public static void main(String[] args) {

		// t is a small t in java language

		boolean isTrue = true;
		if(isTrue) {
			System.out.println("True is true");
		}

		if (10>5) {
			System.out.println("10 is greater than 5");
		}

     if(returnTrue()) {
     	System.out.println("returnTrue is true");
     
    

   }

   if(!returnTrue())  {
   	System.out.println("NOT returnTrue is false");
   } else {
   	System.out.println("NOT return was not true");
   }

   if(5>10)  {
   	System.out.println("This will not print");

   }

   else if (10 >5) {
   	System.out.println ("This will print");

   }
   else {
   	System.out.println("This will not print");
   }

   if(true) {
   	if(10>5) {
   		System.out.println("true is true and " + "ten is greater than 5");
   	}

   	else {
   		System.out.println("this won't print");
   	}
   }

   int myNumber =10;
   switch(myNumber) {
   	case 1:
   	System.out.println("10 is 1");
   	break;
   	case 5:
   	System.out.println("10 is 5");
   	break;

   	//is my number equal to ten, yes
   	case 10:
   	System.out.println("10 is 10");
   	break;
   	default:
   	System.out.println("myNumber was not"  + "1. 5, or 10");
   }

   
   
   
   if(5==5) {
   	System.out.println("This is true");
   }
	}

	public static boolean returnTrue() {
		return true;
	}
}