
public class LinkedList {
	private Node head = null;
	
	public void add(int value)
	{
		Node newnode = new Node(value);
		
		// if list is empty point to first element
		if(head == null)
		{
			head = newnode;
		}
		else
		{
			Node tmp = head;
			while(tmp.getnext() != null)
			{
				tmp = tmp.getnext();
			}
			tmp.setnext(newnode);
		}
	}
	
	// geht nicht ganz
	public int getValue(int index)
	{
		Node tmp = head;
		int i = 0;
		while(tmp.getnext() != null)
		{
			if(i == index)
			{
				return tmp.getvalue();
			}
			tmp = tmp.getnext();
			i++;
		}
		return -1;
	}
	
	public int getValueFor(int index)
	{
		Node tmp = head;
		for(int i = 0; i < index; i++)
		{
			if(tmp.getnext() == null)
			{
				throw new IndexOutOfBoundsException();
			}
			else
			{
				tmp = tmp.getnext();
			}
		}
		return tmp.getvalue();
	}
}