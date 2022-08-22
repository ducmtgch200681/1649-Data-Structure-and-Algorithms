package four;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex02
{
    public static void main (String[] args)
    {
        int arr[] = {9, 5, 10, 12, 8};
        ArrayList<Integer> aList = new ArrayList<>();

//        aList.add(9);
//        aList.add(5);
//        aList.add(10);
//        aList.add(12);
//        aList.add(8);

        // Assign elements of arr to aList
        for(int i = 0; i < arr.length; i++)
        {
            aList.add(arr[i]);
        }

        // Alt way to assign
//        aList = (ArrayList)Arrays.asList(arr);
//
//        // Genertate a random numberin [0,25]
//        Random rnd = new Random();
//        for(int i = 0; i < arr.length; i++)
//        {
//            aList.add(rnd.NextInt[26]);
//        }
//

//        System.out.print(aList.get(1));

        System.out.println("Size= " + aList.size());
        aList.remove(1);
        System.out.println("Size= " + aList.size());
        System.out.println(aList.toString());
    }
}
