public class prg_fak {
	
	public static int Fakult�t(int zahlf)
	{
		int a = zahlf;
		int i = 1;
		while(a>0)
		{
			i = i* a;
			a-- ;
		}
		return i;
	}
	
	public static void main(String []args)
	{
		System.out.println(Fakult�t(10));
	}	
}