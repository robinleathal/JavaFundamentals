
public class AreArraysEqual {

	public static void main(String[] args) {
		// if 2 arrays are equal or not
		int arr1[] = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5,6};
		//int[] arr2 = {5, 3, 7, 1, 2,4,89,45};
		if (arr1.length != arr2.length) {
			System.out.println("Arrays are not equal");
			return;
		}
		
		for (int i =0; i<arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("Arrays are not equal");
				return;
			}
		}
		System.out.println("Arrays are equal");
	}

}
