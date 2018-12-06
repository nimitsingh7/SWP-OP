
public class BinaryTree {
	
	Node root;
	
	private Node head(Node current, int value)
	{
		if(current == null)
		{
			return new Node(value);
		}
		
		if(value < current.value)
		{
			current.left = head(current.left, value);
		} else if(value < current.value)
		{
			current.right = head(current.right, value);
		} else
		{
			return current;
		}
		
		return current;
	}
	
	public void add(int value)
	{
		root = head(root, value);
	}
	
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        System.out.printf("Zahl: %d", current.value);
	    	return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
	    BinaryTree bt = createBinaryTree();
	 
	    assertTrue(bt.containsNode(6));
	    assertTrue(bt.containsNode(4));
	  
	    assertFalse(bt.containsNode(1));
	}

	private void assertFalse(boolean containsNode){}

	private void assertTrue(boolean containsNode){}

	private BinaryTree createBinaryTree() {
		
		return null;
	}
	
}