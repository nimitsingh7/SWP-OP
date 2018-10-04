
public class EndRekursion_fak {
	
	public static int fak(int zahl, int zahl2)
	{
		if(zahl == 1)
		{
			return zahl2;
		}
		
		return fak(zahl - 1, zahl * zahl2);
	}
	
	public static void main(String args[])
	{
		System.out.println(fak(5, 1));
	}
	
}