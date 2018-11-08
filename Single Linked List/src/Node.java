public class Node {
	private int value;
	private Node next = null;
	
	public Node(int value)
	{
		this.value = value;
	}
	
	public int getvalue()
	{
		return value;
	}
	public void setvalue(int value)
	{
		this.value = value;
	}
	public Node getnext()
	{
		return next;
	}
	public void setnext(Node next)
	{
		this.next = next;
	}
}