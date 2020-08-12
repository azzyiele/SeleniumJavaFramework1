package demo;
import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			demo();

		}
		
		catch (Exception e) {
			e.printStackTrace();
			}
	}
		

	private static void demo() throws Exception {


		System.out.println("Hello Liam \n");
		throw new ArithmeticException("not valid operation");
		//int i = 1/0;
		//System.out.println("Completed!");	
		
	}
}	


