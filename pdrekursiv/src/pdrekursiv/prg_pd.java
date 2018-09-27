package pdrekursiv;

public class prg_pd {
	
	public static int PD(int b, int a)
	{
		
		if(a == 0)
		{
			return 1;
		}
		
		if(b == a)
		{
			return 1;
		}
		
		else
		{
			return PD(b-1, a-1) + PD(b-1, a);
		}
	}
	
	public static void main(String []args)
	{
		System.out.println(PD(2, 2));
	}
	
}