import java.util.ArrayList;
import java.util.Collections;

public class Programm {
	
	public static void main(String []args) {
	
	long time = System.currentTimeMillis();
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	for(int i = 0;i < 100;i++)
	{
		list.add((int)((Math.random() *9)+1));
	}
	
	System.out.println("Zu sortierende Liste: ");
	System.out.println(list.toString());
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	while(list.size() != 0)
	{
		int r = 0;
		int a = (int) list.get(0);
		
	for(int i = 0; i < list.size()-1; i++)
	{
		int s = (int) list.get(i);
		
		if(a > s)
		{
			a = s;
			r = i;
		}
		
	}
	
	list.remove(r);
	list2.add(a);
	
	}
	
	System.out.println("Sortierte Liste: ");
	System.out.println(list2);
	long newtime = System.currentTimeMillis() - time;
	System.out.println(newtime);
	}
}