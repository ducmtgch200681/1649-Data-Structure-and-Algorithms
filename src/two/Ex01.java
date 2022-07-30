package two;

import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int N =100;
        //C1:
        int result = N * (N + 1) / 2;
        System.out.println("C1 - Result = " + result);

        //C2: Iteration
        c2sum(N);


        //C3: Recursion
        result = c3sum(N);
        System.out.println("C3 - Result = " + result);




        // WORK
        System.out.println("Enter k: ");
        int k = myObj.nextInt();

        System.out.println("Enter o: ");
        int o = myObj.nextInt();

        if (k % 2 != 0) k = k + 1;
        if (o % 2 != 0) o = o - 1;

        //C1:
        int m = ((o - k) / 2 + 1);
        int p1  = m * (k + o) / 2;

        System.out.println("C1 - Result = " + p1);

        //C2:
        M2SUM(k,o);

        //C3:

        int p3 = M3SUM(k,o);
        System.out.println("C3 - Result = " +p3);
    }

    private static void c2sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++)
        {
            result = result + i;
        }
        System.out.println("C2 - Result = " + result);
    }


    //Recursive function
    private static int c3sum(int n)
    {
        if(n==1) return 1;
        else return c3sum(n-1) + n;
    }

    //WORK

    private static void M2SUM(int k, int o) {
        int p2 = 0;

        for (; k <= o; k+=2)
        {
            p2 += k;
        }
        System.out.println("C2 - Result = " + p2);
    }

    private static int M3SUM(int k, int o)
    {
        if (o == k) return k;
        return M3SUM(k , o - 2) + o;
    }
}
