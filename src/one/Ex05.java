package one;

import java.util.Scanner;

public class Ex05
{
	public static void main (String[] args)
	{
		//C1:
		int arr[] = {9, 7, 10, 9, 2, 8, 9, 10, 5};
		System.out.println("The length of arr: " + arr.length);

		//C2:


		//C3:
		int crr[];
		crr = new int[9];
		System.out.println("The length of crr: " + crr.length);

		int x;
		x = 5;
		System.out.println("x = " + x);
		x = 7;

		//C4:
//		int drr[] = arr;  //Issue -> drr and arr point
			// They are the same address value
			// They are as the one

		//-------
//		int drr[] = new int[arr.length];
//		for (int i = 0; i < arr.length; i++){
//			drr[i] = arr[i];
//		}
		int drr[] = arr.clone();
		//-------

		arr[0] = 100;

		System.out.println("drr[] = ");
		for(int i = 0; i < drr.length; i++){
			System.out.println(drr[i] + " ");
		}


		//Work
		int zrr[] = {9, 7, 10, 9, 2, 8, 9, 10, 5};

		int n = zrr.length;
		int max = Integer.MIN_VALUE;

		Scanner myObj = new Scanner(System.in);
		int k = myObj.nextInt();

		for(int i = 0; i < zrr.length; i++){

		}
	}
}