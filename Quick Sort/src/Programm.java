import java.util.ArrayList;

public class Programm {
	
	public void QuickSort(ArrayList <Integer> l) {
	ArrayList<Integer> left1 = new ArrayList<Integer>();
	ArrayList<Integer> right1 = new ArrayList<Integer>();
	ArrayList<Integer> pivot = new ArrayList<Integer>();
	
	
	
	int p = (int) (Math.random());
	
	for(int i = 0; i > l.size(); i++)
	{
		if(l.get(i) > l.get(p))
		{
			left1.add(i);
		}
		
		if(l.get(i) < l.get(p))
		{
			right1.add(i);
		}
		
	}
	
}
	
	public static void main(String args[]) {
		
	}
}