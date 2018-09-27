import java.util.Scanner;

public class prg_pal {
	
	public static void main(String []args) {
	
	String s, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Bitte geben sie einen String ein zur überprüfung: ");
    s = in.nextLine();

    int length = s.length();
    

    if (s.equals(reverse))
       System.out.println("Es ist ein Palindrom");
    else
       System.out.println("Es ist kein Palindrom");
    
	}
}