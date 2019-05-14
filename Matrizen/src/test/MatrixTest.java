/**
 	@author Nimit
	 * Matrizen
	 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import matrix.FalscheMatrix;
import matrix.Matrix;

public class MatrixTest {

	@Test
	public void skalarTest() throws FalscheMatrix {
		Matrix m=new Matrix(2,4);
		for(int i=0;i<2;i++) {
			for(int j=1;j<=4;j++) {
				m.data[i][j-1]=j;
			}
		}
		m.skalarMultiplikatoin(5);
		Matrix n=new Matrix(2,4);
		for(int i=0;i<2;i++) {
			for(int j=1;j<=4;j++) {
				n.data[i][j-1]=j*5;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=1;j<=3;j++) {
				assertEquals(m.data[i][j],n.data[i][j]);
			}
		}
	}
	
	public void sigmoidfktTest() throws FalscheMatrix
	{
		Matrix m=new Matrix(2,4);
		for(int i=0;i<2;i++) {
			for(int j=1;j<=4;j++) {
				m.data[i][j-1]=j;
			}
		}
		m.data[1][3] = 1000;
		m.SigmoidFunktion();
		assertEquals(m.data[1][3], 1, 0.1);
	}
	
}