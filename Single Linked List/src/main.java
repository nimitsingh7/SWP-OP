
public class main {
	public static  void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		for(int i = 0; i < 10; i++)
		{
			ll.add(i);
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(ll.getValueFor(i));
		}
		
	}
}