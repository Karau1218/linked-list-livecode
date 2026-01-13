public class Practice {
    public static void main(String[] args) {
        // System.out.println("~linked lists practice~");
        Node head = new Node('g', null);
        // System.out.println(head.value);
        // System.out.println(head.next);

        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null);

        head =  head.next;
        printList(head);

    }   
    public static void printList(Node start) {
        Node current = start;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        
    }

        // System.out.println(head.next.next.value);
    } 

 
