import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args)
    {
        int arr[] ={9, 7, 10, Integer.MAX_VALUE, 9, 2, 8, 2, 10, 5, Integer.MIN_VALUE};

//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < Integer.MAX_VALUE && max < arr[i])
//                max = arr[i];
//        }
//
//        int sec_max = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < Integer.MAX_VALUE && sec_max < arr[i])
//                sec_max = arr[i];
//        }



//        int max = Utility.findMax(arr, Integer.MAX_VALUE);
//        int sec_max = Utility.findMax(arr, max);
//        int thi_max = Utility.findMax(arr, sec_max);
//
//        System.out.println("woof woof: " + thi_max);


        Scanner myObj = new Scanner(System.in);
        int k = myObj.nextInt();

        int bound = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++){
            max = Utility.findMax(arr, bound);
            if(max == Integer.MIN_VALUE)
                break;
            bound = max-1;
        }

        System.out.println("The k_th lagest value is: " + max);
    }
}
