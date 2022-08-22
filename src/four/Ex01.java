package four;

public class Ex01
{
    public static void main (String[] args)
    {
        int arr[] = {9, 5, 10, 12, 8};

        int n = arr.length;
        // arr.length is total number of elements can be stored in the array 'arr'
        // n is the current number of element in the array

        //Given an index, delete an element in the array
        int idx_d = 1;
        for(int i = idx_d; i < arr.length; i++)
        {
            arr[i] = arr[i + 1];
        }

        n--;

        //Print all elements in the array
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
