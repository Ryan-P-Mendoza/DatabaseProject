public class TreeNode<E> {
    protected E element; // The element of the BST Node which is the keyword
    protected TreeNode<E> left; // The left child node of the BST node
    protected TreeNode<E> right; // The right child node of the BST node
    protected Node<Article> head; // The head of the linked list connected to the BST Node

    	
    // Set the incoming element/keyword to the element of the BST node
    public TreeNode(E e){
        element = e;
    }
    
    // Add the article to the head of the linked list connected to the BST node
    public void addFirst(Article a){
        Node<Article> newNode = new Node<>(a); // create the new linked list node
        newNode.next = head; // link this node to where the head is pointing to/next node
        head = newNode; // set the head to this new node
    }
}

