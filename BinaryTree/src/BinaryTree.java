
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
		
}