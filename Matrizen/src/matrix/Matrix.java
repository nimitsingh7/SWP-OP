/**
	 * @author Nimit
*/
package matrix;

public class Matrix {
	public int[][] mat;
	int r;
	int c;

	public Matrix(int r, int c) {
		mat = new int[r][c];
		this.r = r;
		this.c = c;
	}

	public Matrix copy() {
		Matrix copy = new Matrix(this.r, this.c);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				copy.mat[i][j] = this.mat[i][j];
			}
		}
		return copy;
	}

	public void skalarMult(int s) throws FalscheMatrix{
		try {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] *= s;
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new FalscheMatrix();
		}
	}

	public static Matrix skalarMult(int s, Matrix m) throws FalscheMatrix {
		Matrix copy = m.copy();
		copy.skalarMult(s);
		return copy;
	}

	public static int[] vertMult(int[] v, Matrix m) throws falsche�bereinstimmmungderLaenge, FalscheMatrix {
		int[] nv=new int[v.length];
		if(v.length!=m.c) {
			throw new falsche�bereinstimmmungderLaenge();
		}
		try {
		for (int i = 0; i < m.r; i++) {
			int zw = 0;
			for (int j = 0; j < m.c; j++) {
				zw += m.mat[i][j] * v[j];
			}
			nv[i] = zw;
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new FalscheMatrix();
		}
		return nv;
	}

	public static int[] horizonMult(int[] v, Matrix m) throws falsche�bereinstimmmungderLaenge, FalscheMatrix {
		int[] nv=new int[v.length];
		if(v.length!=m.r) {
			throw new falsche�bereinstimmmungderLaenge();
		}
		try {
		for(int i=0;i<m.c;i++) {
			int zw=0;
			for(int j=0;j<m.r;j++) {
				zw+=m.mat[j][i]*v[j];
			}
			nv[i]=zw;
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new FalscheMatrix();
		}
		return nv;
	}
	public static Matrix matMult(Matrix m, Matrix n){
		Matrix e= new Matrix(m.r,m.c);
		for(int i=0;i<m.r;i++){
			for(int j=0;j<m.c;j++){
				e.mat[i][j]=m.mat[i][j]*n.mat[i][j];
			}
		}
		return e;
	}
}