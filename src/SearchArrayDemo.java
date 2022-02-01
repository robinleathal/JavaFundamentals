import java.util.Scanner;
//search an element inside an array
public class SearchArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {85, 3, 4, 21, 98, 7, 3, 6, 2, 9, 46};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key");
		int x = sc.nextInt();
		int index = -1; // value not found at any index as index starts at 0;
		for (int i =0; i< arr.length; i++) {
			if (x==arr[i]) {
				index = i;
				break;
				
			} 
			
		}
		if (index == -1) {
			System.out.println("Array element not found");
		} else {
			System.out.println("Array element found at index "+index);
		}
		sc.close();

	}

}
