/**
 * @author Nimit
 * @version 0.1
 */

package rechner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Rechner {

	public static int sum(String input) throws TooManyArgsException{
		String[] seperatedValues = input.split(",");
		if(seperatedValues.length > 2)
		{
			throw new TooManyArgsException();
		}
		return Integer.parseInt(seperatedValues[0]) + Integer.parseInt(seperatedValues[1]);
	}
	
}