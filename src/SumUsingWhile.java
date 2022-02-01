
public class SumUsingWhile {

	public static void main(String[] args) {
		int i = 1, sum=0;
//		while (i<= 10) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("Sum = "+sum);
		
		do {
			//runs at least once regardless of the condition
			sum+=i;
			i++;
		} while (i<=10);
		System.out.println("Sum = "+sum);
		

	}

}
