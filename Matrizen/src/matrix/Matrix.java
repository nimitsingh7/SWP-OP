/**
	 * @author Nimit
*/
package matrix;

public class Matrix {
	public int[][] data;
	int r;
	int c;

	public Matrix(int r, int c) {
		data = new int[r][c];
		this.r = r;
		this.c = c;
	}

	public Matrix copy() {
		Matrix copy = new Matrix(this.r, this.c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				copy.data[i][j] = this.data[i][j];
			}
		}
		return copy;
	}

	public void SigmoidFunktion() throws FalscheMatrix
	{
			for(int i = 0; i<r; i++)
			{
				for(int j = 0; j<c; i++)
				{
					data[i][j] =  (int) (1/(Math.exp(-data[i][j])+1));
				}
			}
	}
	
	public static Matrix skalarMult(int s, Matrix m) throws FalscheMatrix {
		Matrix copy = m.copy();
		copy.skalarMultiplikatoin(s);
		return copy;
	}
	
	public void skalarMultiplikatoin(int s) throws FalscheMatrix{
		try {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] *= s;
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new FalscheMatrix();
		}
	}

	public static int[] vertMult(int[] v, Matrix m) throws falscheÜbereinstimmmungderLaenge, FalscheMatrix {
		int[] nv=new int[v.length];
		if(v.length!=m.c) {
			throw new falscheÜbereinstimmmungderLaenge();
		}
		try {
		for (int i = 0; i < m.r; i++) {
			int zw = 0;
			for (int j = 0; j < m.c; j++) {
				zw += m.data[i][j] * v[j];
			}
			nv[i] = zw;
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new FalscheMatrix();
		}
		return nv;
	}

	public static int[] horizonMultiplikation(int[] v, Matrix m) throws falscheÜbereinstimmmungderLaenge, FalscheMatrix {
		int[] nv=new int[v.length];
		if(v.length!=m.r) {
			throw new falscheÜbereinstimmmungderLaenge();
		}
		try {
		for(int i=0;i<m.c;i++) {
			int zw=0;
			for(int j=0;j<m.r;j++) {
				zw+=m.data[j][i]*v[j];
			}
			nv[i]=zw;
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new FalscheMatrix();
		}
		return nv;
	}
	public static Matrix MatrixMultiplikation(Matrix m, Matrix n){
		Matrix e= new Matrix(m.r,m.c);
		for(int i=0;i<m.r;i++){
			for(int j=0;j<m.c;j++){
				e.data[i][j]=m.data[i][j]*n.data[i][j];
			}
		}
		return e;
	}
	
	public boolean equals(Matrix b)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				if(this.data[i][j] != b.data[i][j])
				{
					return false;
				}
			}
		}
		return true;
	}
	
}