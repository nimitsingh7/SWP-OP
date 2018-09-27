
public class Rekusiv_Palindrom {
	
	public static boolean isPalindrom(String s)
	{
		s = s.toLowerCase();
		
		if(s.length() == 0)
		{
			return true;
		}
		
		if(s.length() == 1)
		{
			return false;
		}
		
		int d = s.length() -1;
		
		if(s.charAt(0) == s.charAt(1))
		{
			String a = s.substring(1, d-1);
			return isPalindrom(a);
		}
		
		else
		{
			return false;
		}
		
	}
	
	public static void main(String []args) {
		System.out.println(isPalindrom("anna"));
	}
}