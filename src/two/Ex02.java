package two;

import java.util.Scanner;

public class Ex02
{
    public static void main (String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int arr[] = {9, 7, 10,
//                Integer.MAX_VALUE,
                9, 2, 8, 2, 10, 5
//                , Integer.MIN_VALUE
        };
        int max = Integer.MIN_VALUE;
        int end = arr.length - 1;
        int start = 0;

        max = Max(max, arr);
        System.out.println("The Maximum value is: " + max);

        max = f(arr, start, end, max);
        System.out.println("The Maximum value is: " + max);

        System.out.println("Enter X: ");
        int x = myObj.nextInt();
        System.out.println("Enter Y: ");
        int y = myObj.nextInt();

        long pow = Pow(x,y);
        System.out.println("Pow: " + pow);

    }

    private static int f(int[] arr, int start, int end, int max) {
        if (end == start)
            return arr[start];
        else{
//            if(max <= arr[end]) max = arr[end];
//            return f(arr, start, end - 1, max);

            max = f(arr, start, end - 1, max);
            if (max < arr[end]) max = arr[end];
            return max;
        }


    }

    private static int Max (int max, int arr[])
    {
        int bound = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= bound && max < arr[i])
                max = arr[i];
        }
        return max;
    }

    private static int Pow(int x, int y)
    {
        if (y < 1) return 1;
        return Pow(x, y - 1) * x;
    }
}
