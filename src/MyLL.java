
public class MyLL<T> {
    private class Node<E> {
    private E value; 
    public Node<E> next;
    

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }
    
}
private Node<T> head;

public MyLL() {
    head = null;
}

public void printList() {
        Node current = head;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        
    }
     public void addToBack(T toAdd) {
        Node<T>  newNode = new Node<T> (toAdd, null); // NUll is what to add is pointing to 
        
        if (head == null) {
            head = newNode;
            return;
        }
    
        Node<T>  current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
     }

        // System.out.println(head.next.next.value);
    public boolean contains(T toFind) {
      Node<T> current = head;
        while (current != null) {
            if (current.value.equals(toFind)) {
                return true;
            }

            current = current.next;
        }

        return false; 
    }
    // Removes the first node that has toRemove
    public T remove(T toRemove) {
        if(head == null) {
            return null;
        }
        if (head.value == toRemove) {
            head = head.next;
            return toRemove;
        }
        
        Node<T> current = head;

        while (current.next != null) {
            if (current.value.equals(toRemove)) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
            return null;
    }
    
    } 

