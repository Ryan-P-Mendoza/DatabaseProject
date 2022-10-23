public class Node<E> {
    
	// Set up the linked list node
	E element;
    Node<E> next;

    // set the incoming article to the element of the linked list node
    public Node(E e){
        element = e;
    }
    
    // convert it toString 
    public String toString(){
        return "" + element;
    }
}
