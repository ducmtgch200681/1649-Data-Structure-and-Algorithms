package five;

public class DoublyLinkedList<T>
{
    private class Node
    {
        public T data;
        public Node previous;
        public Node next;

        public Node(T data)
        {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    private DoublyLinkedList.Node head = null;
    private DoublyLinkedList.Node tail = null;

    //add a node to the list
    public void addNode(T data)
    {
        //Create a new node
        Node newNode = new Node(data);

        //if list is empty, head and tail points to newNode
        if(head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        }
        else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    public T removeLast()
    {
        if(tail != null)
        {
            if(tail.previous == null)
            {
                T x = (T) tail.data;
                head = tail = null;
                return x;
            }
            Node temp = tail;
            T x = (T) temp.data;
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;

            return x;
        }
        else return null;
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

