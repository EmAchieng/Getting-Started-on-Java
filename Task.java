public class Task {
	public static void main(String[] args)  {
		for(int i =10; i>= 0; i--) {
			if(i % 2 ==0)  {


				System.out.println("i is even:"  + i);
			} else if(i==0) {
				System.out.println("i is neither even nor odd");
			} 

			else 
			 {
				System.out.println("i is not even:" + i);
			}
		}
	}
}