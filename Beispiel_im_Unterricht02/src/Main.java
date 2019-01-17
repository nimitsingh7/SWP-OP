import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]) {
	ArrayList<Person> l = new ArrayList<>();
	l.add(new Person("Martin", "Schoepf", 18));
	l.add(new Person("Seppel", "Huber", 70));
		
	if(l.get(0).isBiggerthan(l.get(1)))
		{
		System.out.println("is bigger");
		}
	
	if(l.get(0).isSmallerthan(l.get(1)))
		{
		System.out.println("is smaller");
		}
	}
}