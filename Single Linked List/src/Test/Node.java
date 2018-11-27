public class Node<T>{
	private T value;
	private Node next = null;
	
	public Node(T value)
	{
		this.value = value;
	}
	
	public T getvalue()
	{
		return value;
	}
	public void setvalue(T value)
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