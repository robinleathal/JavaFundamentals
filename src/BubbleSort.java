
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {2,8,9,1,3,4,25};
		int arr2[] = {2,8,9,1,3,4,25};
		int temp =0;
		System.out.println("Ascending ");
		for (int i=0; i <arr.length; ++i) {
			for (int j = i+1; j < 7; ++j) {
				//swap
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println(" ");
		System.out.println("Decending ");
		for (int i=0; i < arr2.length; ++i) {
			for (int j = i+1; j < 7; ++j) {
				//swap
				if (arr2[i] < arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
			System.out.println(arr2[i]);
		}

	}

}
