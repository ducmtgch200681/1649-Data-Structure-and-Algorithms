package five;

public class MyLinkedList<T>
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

    private Node head = null;
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
            T x = (T) temp.data;
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
                T x = (T) head.data;
                head = tail = null;
            }
            Node current = head;
            Node temp = head;
            while (current.next != null) {
                temp = current;
                current = current.next;
            }
            T x = (T) current.data;
            temp.next = null;
            tail = temp;
            return x;
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

    public int contains(int data)
    {
        Node current = head;

        if(current.data.equals(data))
        {

        }
        return -1;
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


}
