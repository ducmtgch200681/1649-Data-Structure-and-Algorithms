public class Utility
{
    //return_type function_name (list of parameter)
    public static int findMax(int arr[], int upper_bound)
    {
        //Function findMax() receives an array as its input
        //This function return an integer as its output
        int max = Integer.MIN_VALUE;
//        if (upper_bound == Integer.MAX_VALUE)
//            upper_bound--;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= upper_bound && max < arr[i])
                max = arr[i];
        }
        return max; //returned value
    }
}
