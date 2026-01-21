public class Practice {
    public static void main(String[] args) {
        // System.out.println("~linked lists practice~");
        // Node head = new Node('g', null);
        // System.out.println(head.value);
        // System.out.println(head.next);

        // Node ryan = new Node('s', null);
        // head.next = ryan;
        // ryan.next = new Node('t', null);
        // ryan.next.next = new Node('x', null);

        // head =  head.next;
        // printList(head);
        // Prints out true
        // System.out.println(contains(head, 'x'));
        // // Prints out false
        // System.out.println(contains(head, 'e'));

        //     remove(head, 't'); 
MyLL <Character> list = new MyLL<>();
        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');
        
        list.printList();

        MyLL <Integer> intList = new MyLL<>();
        intList.addToBack(5);
        intList.addToBack(-3);
        intList.addToBack(49);
        intList.addToBack(2);




    }
      
    
    public static void printList(Node start) {
        Node current = start;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        
    }

   
        // System.out.println(head.next.next.value);
    public static boolean contains(Node start, char toFind) {
        Node head = start;
        while (head != null) {
            if (head.equals(toFind)) {
                return true;
            }

            head = head.next;
        }

        return false; 
    }
    // Removes the first node that has toRemove
    public static char remove(Node head, char toRemove) {
        Node current = head;

        while (current.next != null) {
            if (current.equals(toRemove)) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
            return '\0';
    }
    } 

 
// Print backwards REMOVE RHIS
/*
 while (current.PREV != null) {
            if (current.value.equals(toRemove)) {
                current.prev = current.prev.prev;
                return toRemove;
            }
            current = current.prev;
        }
            return prev;
    }

    */