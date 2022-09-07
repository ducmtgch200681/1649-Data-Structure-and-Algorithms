package five;

public class SinglyLinkedList<T>
{
    private class Node
    {
        public T data;
        public Node next;

        public Node(T data)
        {
            this.data = data;
            this.next = null;
        }

    }

    public Node head = null;
    private Node tail = null;

    // Add a new node into the end of LinkedList
    public void add(T data)
    {
        // 1. Create a new node
        Node one = new Node(data);

        // 2. Connect the new node 'one' to the end of LinkedList
        // 2.1. There is currently no node
        if(head == null) {
            head = one;
            tail = one;
        }

        // 2.2. There are currently some nodes in the LinkedList
        else {
            tail.next = one;
            tail = one; // Update the new position for tail
        }
    }

//    public void add(T data)
//    {
//        // 1. Create a new node
//        Node one = new Node(data);
//
//        // 2. Connect the new node 'one' to the end of LinkedList
//        // 2.1. There is currently no node
//        if(head == null) {
//            head = one;
//            tail = one;
//        }
//
//        // 2.2. There are currently some nodes in the LinkedList
//        else {
//            // 2.2.1. Go to the last node
////            Node current = head;
////            while(current.next != null) // O(n)
////            {
////                current = current.next;
////            }
//            // 2.2.2. Connect the last node to the new node 'one'
////            current.next = one;
//
//            tail.next = one;
//            tail = one; // Update the new position for tail
//        }
//    }

    public void addFirst(T data)
    {
        Node one = new Node(data);

        one.next = head;
        head = one;
    }

    public T removeFirst()
    {
        if(head != null)
        {
            Node temp = head;
            T x = temp.data;
            head = head.next;
            temp.next = null;

            return x;
        }
        else return null;
    }

    public T removeLast()
    {
        if(head==null) return null;
        else {
            if(head.next == null)
            {
                T x = head.data;
                head = tail = null;
                return x;
            }
            else
            {
                Node current = head;
                Node temp = head;
                while (current.next != null) {
                    temp = current;
                    current = current.next;
                }
                T x = current.data;
                temp.next = null;
                tail = temp;
                return x;
            }
        }
    }

    public void addMiddle(int index, T data)
    {
        if(index < 0) return;
        else if (index == 0) addFirst(data);
        else {
            // 1. Create a new node
            Node one = new Node(data);
            // 2. Move to the node at position: index-1
            Node current = head;

            int count = 0;
            while (current.next != null && count < index - 1) {
                current = current.next;
                count++;
            }
            if(count == index -1 && current.next != null)
            {
                // 3. Change the connections
                one.next = current.next;
                current.next = one;
            }
            else return;
        }
    }

    public void removeMiddle(int index)
    {
        if(index < 0) return;
        else if (index == 0) removeFirst();
        else {
            Node current = head;
            int count = 0;
            while (current.next != null && count < index - 1) {
                current = current.next;
                count++;
            }
            if(count == index -1 && current.next != null)
            {
                Node temp = current.next;
                current.next = temp.next;
                temp.next = null;
            }
            else return;

        }
    }

    public void print(boolean flag)
    {
        p(head, flag);
        System.out.println();
    }

    public void p (Node current, boolean flag)
    {
        if (current == null) return;
//        if (head.next == null) System.out.print(head.data);
        else
        {
            if(flag) System.out.print(current.data + " ");
            p(current.next, flag);
            if (!flag) System.out.print(current.data + " ");
        }
    }

//    public int length()
//    {
//        int count = 0;
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//            count++;
//        }
//        return count + 1;
//    }
//
//    public int[] toArray(SinglyLinkedList<T> List)
//    {
//        int n = List.length();
//        int[] result = new int[n];
//        int i = 0;
//        Node current = head;
//
//        while (current.next != null)
//        {
//            result[i++] = (int) current.data;
//            current = current.next;
//        }
//        result[i++] = (int) current.data;
//
//        return result;
//    }
//
//
//    // Java program for implementation of Heap Sort
//
//    public void sort(SinglyLinkedList<T> List)
//    {
//        int n = List.length();
//        int[] arr = List.toArray(List);
//
//        // Build heap (rearrange array)
//        for (int i = n / 2 - 1; i >= 0; i--){
//            heapify(arr, n, i);
//        }
//
//        // One by one extract an element from heap
//        for (int i = n - 1; i > 0; i--) {
//            // Move current root to end
//            int temp = arr[0];
//            arr[0] = arr[i];
//            arr[i] = temp;
//            // call max heapify on the reduced heap
//            heapify(arr, i, 0);
//        }
//
//        printArray(arr, List);
//    }
//
//    // To heapify a subtree rooted with node i which is
//    // an index in arr[]. n is size of heap
//    void heapify(int[] arr, int n, int i)
//    {
//        int largest = i; // Initialize largest as root
//        int l = 2 * i + 1; // left = 2*i + 1
//        int r = 2 * i + 2; // right = 2*i + 2
//
//        // If left child is larger than root
//        if (l < n && arr[l] > arr[largest])
//            largest = l;
//
//        // If right child is larger than largest so far
//        if (r < n && arr[r]> arr[largest])
//            largest = r;
//
//        // If largest is not root
//        if (largest != i) {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = swap;
//
//            // Recursively heapify the affected sub-tree
//            heapify(arr, n, largest);
//        }
//    }
//
//    /* A utility function to print array of size n */
//    void printArray(int[] arr, SinglyLinkedList<T> List)
//    {
//        int n = List.length();
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }

    Node sortedMerge(Node a, Node b)
    {
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if ( (int) a.data <= (int) b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }

    Node mergeSort(Node h)
    {
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }

        // get the middle of the list
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;


        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        Node left = mergeSort(h);

        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    // Utility function to get the middle of the linked list
    public Node getMiddle(Node head)
    {
        if (head == null)
            return head;

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
