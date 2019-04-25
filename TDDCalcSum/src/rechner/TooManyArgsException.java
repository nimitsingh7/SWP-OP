package rechner;

public class TooManyArgsException extends Exception{
	@Override
	public String getMessage()
	{
		return "Too Many Arguments";
	}
}