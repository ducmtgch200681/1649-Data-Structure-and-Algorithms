package one;

import java.util.Scanner;

public class Ex03
{
	public static void main (String[] args) 
	{
		int N1, reversed = 0;
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Enter number: ");
	    N1 = scanner.nextInt ();
	    
	    while (N1!=0) {
	    	int digit = N1 % 10;
	    	reversed = reversed * 10 + digit;
	    	
	    	N1 /= 10;
	    }
		System.out.println("The sqrt of reseved number is: ");
//		System.out.println(Math.sqrt(reversed));
		
		double sqrt;
		
		System.out.println(SQRT(reversed));
		
	}
	
	public static double SQRT(int N1) {
		double t;
		double sqrt = N1/2;
		
		do {
			t = sqrt;
			sqrt = (t + (N1 / t)) / 2;
		}
		while ((t - sqrt) != 0);
		
		return sqrt;
	}
}