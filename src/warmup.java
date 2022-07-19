import java.util.Scanner;

// import java.until.Scanner;

 public class warmup {
 public static void main(String[] args) {
 int n;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter n: ");
    n = scanner.nextInt ();
         
    int array[] = new int[n];
         
    System.out.println("Enter content: ");
    
    for (int i = 0; i < n; i++) {
        System.out.print("content no. " + i + ": ");
        array[i] = scanner.nextInt();
    }
         
    System.out.println("\n N are: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
 }
 }