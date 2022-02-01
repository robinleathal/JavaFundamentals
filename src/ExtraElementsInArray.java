
public class ExtraElementsInArray {

	public static void main(String[] args) {
		// For multiple extra elements
		int arr1[] = {1,2,3,4,5};
		int[] arr2 = {5, 3, 7, 1, 2,4,89,45};
		
		for (int i =0; i<arr2.length; i++) {
			int x = arr2[i];
			boolean isFound= false;
			for (int j=0; j<arr1.length;j++) {
				if (x==arr1[j]) {
					isFound = true;
					break;
				}
			}
			if(!isFound) {
				System.out.println(x + " is not found.");
			}
		}

	}

}
