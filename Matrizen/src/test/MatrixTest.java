/**
 	@author Nimit
	 * Matrizen Multiplikation
	 * 
	 * @param m1 Matrix 1
	 * @param m2 Matrix 2
	 * @return Ergebnismatrix
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
				m.mat[i][j-1]=j;
			}
		}
		m.skalarMult(5);
		Matrix n=new Matrix(2,4);
		for(int i=0;i<2;i++) {
			for(int j=1;j<=4;j++) {
				n.mat[i][j-1]=j*5;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=1;j<=3;j++) {
				assertEquals(m.mat[i][j],n.mat[i][j]);
			}
		}
	}

}