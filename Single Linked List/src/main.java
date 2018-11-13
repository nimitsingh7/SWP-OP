
public class main {
	public static  void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		for(int i = 0; i < 10; i++)
		{
			ll.add(i);
		}
		
		ll.remove(3);
		
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.getValueFor(i));
		}
		
	}
}