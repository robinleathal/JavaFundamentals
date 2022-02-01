
public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int [3][3];
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[0][2]);
		System.out.println();
		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.print(arr[1][2]);
		System.out.println();
		System.out.print(arr[2][0]);
		System.out.print(arr[2][1]);
		System.out.print(arr[2][2]);
		System.out.println();
		for (int i=0; i<arr.length; i++ ) {
			for (int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
