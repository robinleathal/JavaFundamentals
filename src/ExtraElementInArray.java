
public class ExtraElementInArray {

	public static void main(String[] args) {
		// Find an extra element in an array
		//THis exa,ple only works when there is only one extra element.
		int arr1[] = {1, 2 , 3, 4, 5};
		//int arr2[] = {5, 6, 7, 1, 2 , 4};
		int arr2[] = {1, 2 , 3, 4, 5, 9};
		
		int sum1=0;
		for (int i=0; i<arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		int sum2=0;
		for (int i=0; i<arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}
		
		int extraElement = sum2 - sum1;
		System.out.println(extraElement);
	}

}
