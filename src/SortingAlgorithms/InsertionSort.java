package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args)
    {
        int arr[] = {29, 10, 12, 20, 25, 8, 0, 10, 2, 19};

        for (int i = 1; i < arr.length; i++)
        {
            int temp = i;
            for (int j = i - 1; j >= 0; j++)
            {
                if (arr[i] > arr[j])
                {
                    swap(arr,temp,j);
                    temp = j;
                }
                else {                // Dieu kien de dung vong lap som
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + "");
        }
    }


    private static void swap (int[] arr, int i, int j){
        int temp;

    }
}
