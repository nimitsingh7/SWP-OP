package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("A");
		a.add("B");
		a.add(3);
		a.add(42);
		a.add(8);
		
		for(int i = 0; i<a.size(); i++)
		{
			System.out.println(a.getValueFor(i));
		}
		
		a.remove(0);
		a.remove(3);
		
		System.out.println();
		
		for(int i = 0; i<a.size(); i++)
		{
			System.out.println(a.getValueFor(i));
		}
	}

}