
public class JaggedArrayDemo {

	public static void main(String[] args) {
		// one row having different no of column = jagged array
		int ar[][] = new int[3][];
		ar[0] = new int [3];
		ar[1] = new int [2];
		ar[2] = new int [1];
		
		for (int i=0; i<ar.length; i++) {
			for (int j=0; j< ar[i].length; j++) {
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
