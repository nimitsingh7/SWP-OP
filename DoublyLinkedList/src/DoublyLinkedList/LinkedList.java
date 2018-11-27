package DoublyLinkedList;
public class LinkedList<T>{

	private Node<T> head = null;
	private Node<T> tail = null;
	
	
	public void add(T a)
	{
		Node<T> neu = new Node<T>(a);
		
		if(head == null)
		{
			head = neu;
			tail = neu;
		}
		
		else
		{
			Node<T> ta = tail;
			ta.setNext(neu);
			neu.setPrevious(ta);
			tail = neu;
		}
	}
	
	public void remove(int index)
	{
			if(index == 0)
			{
				head = head.getNext();
				head.setNext(head.getNext());
			}

			else if(index == this.size()-1)
			{
				Node<T> tmp = head;
				
				for(int i = 0; i<index-1;i++)
				{
					tmp = tmp.getNext();
				}
				
				tmp.setNext(tmp.getNext().getNext());
				
			}
			
			else
			{
				Node<T> tmp = head;
				
				for(int i = 0; i<index-1;i++)
				{
					tmp = tmp.getNext();
				}
				
				Node a = tmp.getNext().getNext();
				tmp.setNext(a);
				a.setPrevious(tmp);
			}
			
	}
	
	public int size()
	{
		Node<T> tmp = head;
		int i = 0; 
		while(tmp !=null)
		{
			tmp = tmp.getNext();
			i++;
		}
		return i;
	}
	
	public T getValueFor(int index)
	{
		Node<T> tmp = head;
		for(int i = 0; i < index; i++)
		{
			if(tmp.getNext() == null)
			{
				throw new IndexOutOfBoundsException();
			}
			else
			{
				tmp = tmp.getNext();
			}
		}
		return tmp.getValue();	
	}
}