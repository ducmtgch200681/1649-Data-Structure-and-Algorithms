package five;

public class Test
{
    public static void main (String[] args)
    {
        MyLinkedList<Integer> MyList = new MyLinkedList<>();
        MyList.add(9);
        MyList.add(10);
        MyList.add(5);
        MyList.add(8);
//        MyList.addFirst(7);
//        MyList.removeFirst();
//        MyList.removeLast();
//        MyList.addMiddle(4,11);
//        MyList.removeMiddle(3);
        MyList.print(true);
        MyList.print(false);

//        Node one = new Node(9);
//        Node two = new Node(10);
//        Node three = new Node(5);
//        Node four = new Node(8);

        //link node
//        one.next = two;
//        two.next = three;
//        three.next = four;

        //Test
//        System.out.println(three.data);
//        System.out.println(one.next.next.data);
//        System.out.println("---------");
//        System.out.println("All nodes are: ");


//        Node current = one;
//        while (current != null)
//        {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
    }
}
