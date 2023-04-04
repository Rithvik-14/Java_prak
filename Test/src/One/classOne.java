package One;

import java.util.Scanner;

public class classOne {

	public static void main(String[] args) {
		long l =125;
		System.out.println(l); 
		
		
		double  f = 12.5f;
		double b = 12.56;
		
		System.out.println(f); 
		System.out.println(b); 
		
		int x = 10, y=20;
		System.out.println("Sum"+(x+y)); 
		
		
		///	FORMATTED OUTPUTS  ///
		int a =10;
		int z = -10;
		System.out.printf("%d",a);
		System.out.printf("%5d",a);
		System.out.printf("%05d",a);     // THIS WILL ADD ZEROS IN THE SPACES.
		
		float r =123.45f;
		System.out.println(" ");
		System.out.printf("%f",r);
		System.out.println(" ");
		System.out.printf("%6.2f",r);
		
		String str = "Java";
		System.out.printf("%20s",str);


	}

}
