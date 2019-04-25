package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rechner.Rechner;
import rechner.TooManyArgsException;

public class TestRechner {
	@Test
	public void validInput() throws TooManyArgsException
	{
		assertEquals(8, Rechner.sum("3,5"));
	}
	
	@Test(expected = TooManyArgsException.class)
	public void tooManyArgs() throws TooManyArgsException
	{
		Rechner.sum("3,45,5");
	}
}