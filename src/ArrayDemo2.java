import java.util.Arrays;

public class ArrayDemo2 {
	
	static void max(int arr[]) {
		int max = arr[0];//2
		
		for (int i =0; i < arr.length; ++i) {
//			if (arr[i]> arr[i+1]) {
//				//2>8
//				max = arr[i+1];
//				
//				//perform swap
//			}
			
			if (arr[i]> max) {
				//2>8
				max = arr[i];
				
				//perform swap
			}
			
		}
		System.out.println("Largest element in array = "+max);
		
	}
	
	static void min(int arr[]) {
		int min = arr[0];//2
		
		for (int i =0; i < arr.length; ++i) {

			if (arr[i] < min) {
				//2>8
				min = arr[i];
				
				//perform swap
			}
			
		}
		System.out.println("Smallest element in array = "+min);
		
	}
	
	static int secondLargest(int arr[]) {
		
//		int temp;
//		for (int i=0; i<arr.length; ++i) {
//			for (int j = i+1; j<7; ++j) {
//				//swap
//				if (arr[i]> arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		return arr[arr.length-2];
		//slow performance easy method using arrays class
		
		Arrays.sort(arr);
		return arr[arr.length-2];
		
	}

	public static void main(String[] args) {
		int arr[] = {2, 8, 9, 1, 3, 4, 25};
		max(arr);
		min(arr);

	}

}
