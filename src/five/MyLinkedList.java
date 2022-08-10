package five;

public class MyLinkedList
{
    private Node head = null;
    private Node tail = null;

    // Add a new node into the end of LinkedList
    public void add(int data)
    {
        // 1. Create a new node
        Node one = new Node(data);

        // 2. Connect the new node 'one' to the end of LinkedList
        // 2.1. There is currently to node
        if(head == null) {
            head = one;
            tail = one;
        }

        // 2.2. There are currently come nodes in the LinkedList
        else {
            // 2.2.1. Go to the last node
//            Node current = head;
//            while(current.next != null) // O(n)
//            {
//                current = current.next;
//            }
            // 2.2.2. Connect the last node to the new node 'one'
//            current.next = one;

            tail.next = one;
            tail = one; // Update the new position for tail
        }
    }

    public void addFirst(int data)
    {
        Node one = new Node(data);

        one.next = head;
        head = one;
    }

    public void removeFirst()
    {
        if(head != null)
        {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    public void removeLast()
    {
        Node current = head;
        Node temp = head;
        while(current.next != null)
        {
            temp = current;
            current = current.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void add(int index, int data)
    {

    }

    public void remove(int index, int data)
    {

    }

    public int contains(int data)
    {
        return -1;
    }

    public void print()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
