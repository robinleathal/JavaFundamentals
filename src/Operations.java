
public class Operations {
	
	public void addOp(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Addition of " +num1+ " and " +num2+ " = "+result);
		
	}
	void subOp(int num1, int num2) {
		int result = num1-num2;
		System.out.println("Difference of " +num1+ " and " +num2+ " = "+result);
		
	}
	void mulOp(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("Product of " +num1+ " and " +num2+ " = "+result);
		
	}
	void modulusOp(int num1, int num2) {
		double result = num1 % num2;
		System.out.println("Remainder of " +num1+ " and " +num2+ " = "+result);
	}
	void averageOp(int num1, int num2) {
		double result = (num1+num2) / 2;
		System.out.println("Average of " +num1+ " and " +num2+ " = "+result);
	}

}
