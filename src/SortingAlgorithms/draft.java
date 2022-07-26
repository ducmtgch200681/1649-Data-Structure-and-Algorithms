package SortingAlgorithms;

import java.io.Console;

public class draft
{
    // Java program for implementation of Heap Sort

        public void sort(int arr[])
        {
            int n = arr.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--){
                heapify(arr, n, i);
            }

            // One by one extract an element from heap
            for (int i = n - 1; i > 0; i--) {
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                printArray(arr);
                // call max heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }

        // To heapify a subtree rooted with node i which is
        // an index in arr[]. n is size of heap
        void heapify(int arr[], int n, int i)
        {
            int largest = i; // Initialize largest as root
            int l = 2 * i + 1; // left = 2*i + 1
            int r = 2 * i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest])
                largest = l;


            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest])
                largest = r;


            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;


                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);

//                printArray(arr);

            }
        }

        /* A utility function to print array of size n */
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String args[])
        {
//            int arr[] = { 9, 8, 2, 6, 4 , 3, 5, 4, 1, 7, 2, 9, 0 };
//            int arr[] = { 2, 7, 3, 1, 4, 6, 5, 8};
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8};
            int n = arr.length;

            for (int x = 0; x < n; ++x)
                System.out.print(arr[x] + " ");
            System.out.println();

            draft ob = new draft();

            ob.sort(arr);

            System.out.println("Sorted array is");
            printArray(arr);

            System.out.println("wwof: " + n);
        }
    }

