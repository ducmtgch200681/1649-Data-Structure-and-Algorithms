package three;

public class Ex01
{
    public static void main (String[] args)
    {
        int n = 50;
//        System.out.println("n_th Fibonnaci is: " + fib(n));

        long arr[] = new long [n+1];
//        System.out.println("n_th Fibonnaci is " + fib_mem(n));

        fib_mem(n, arr);

        for (int i = 1; i <= n; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static long fib(int n)
    {
        if (n <= 2) return 1;
        else return fib(n - 1) + fib(n - 2);
    }

    public static long fib_mem(int n, long arr[]) {
        if (n <= 2) return arr[n] = 1;
        else {
            if (arr[n] == 0)
                arr[n] = fib_mem(n - 1, arr) + fib_mem(n - 2, arr);
        }
        return arr[n];
    }

    public  static long fib_iter(int n, long arr[])
    {
        int a, b, c;
        a = b = 1;
        arr[1] = a;
        arr[2] = b;
        for (int i = 3; i <= n; i++)
        {
            c = a + b;
            arr[i] = c;
            a = b;
            b = c;
        }
        return arr[n];
    }
}
