
public class EndRekursion_fb {
	
	public static int fb(int f, int z1, int z2, int c)
	{
		if(f == c+1)
		{
			return z1 + z2;
		}
		
		return fb(f, z2, z1+z2, ++c);
	}
	
	public static int fb(int f)
	{
		return fb(f, 0, 1, 1);
	}
	
	public static void main(String args[])
	{
		System.out.println(fb(17));
	}
}