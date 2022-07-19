import java.util.Scanner;

public class Ex07
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
//        Scanner y = new Scanner(System.in);

        //pow
//        System.out.println("Enter x: ");
//        int x = myObj.nextInt();
//        System.out.println("Enter y: ");
//        int y = myObj.nextInt();
//
//        System.out.print("Result pow: " + Round.my_pow(x,y));
//        System.out.println(Math.pow(x,y));


        //round
        System.out.println("Enter n: ");
        double n = myObj.nextDouble();
        System.out.println("Enter o: ");
        int o = myObj.nextInt();


        System.out.println("Result round: " + Round.my_round(n,o));
    }
}
