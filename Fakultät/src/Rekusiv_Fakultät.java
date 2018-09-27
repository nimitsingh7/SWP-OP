
public class Rekusiv_Fakultät {
	
	public static int faculty(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		
		return n*faculty(n-1);
	}
	
	public static void main(String []args)
	{
		System.out.print(faculty(8));
	}
}