package three;

import java.util.Arrays;
import java.util.Collections;

public class Ex02
{
    public static void main(String[] args)
    {
        Integer[] arr = {9, 6, 2, 9, 7, 2, 1, 6, 9, 0, 2};

        // ----------------------process
//        int max = Collections.max(Arrays.asList(arr));
//        int count[] = new int[max + 1];
//
//        for (int i = 0; i < arr.length; i++){
//            count[arr[i]] ++;
//        }
//
//        int n = 0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            if (count[arr[i]] != 0)
//            {
//                System.out.print(arr[i] + " ");
//                n++;
//                count[arr[i]] = 0;
//            }
//        }


        //-----------------Output
        //Shrink an array
//        Integer brr[] = new Integer[n];
//        for (int i = 0; i < n; i++)
//        {
//            brr[i] = arr[i];
//        }

//        Integer brr[] = Arrays.copyOf(arr, n);
//        brr[n] = arr[n];
//
//        for(int i = 0; i < n; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }




        // ----------------------process
        int n =0;
        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length - 1; i++)
        {
            if(!flag[i]) {
                n++;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        flag[j] = true;
                    }
                }
            }
        }



        //-----------------Output
        //Shrink an array
        Integer[] brr = new Integer[n];
        int x = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(!flag[i]){
                brr[x] = arr[i];
                x++;
            }
        }
        for(int i = 0; i < x; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
