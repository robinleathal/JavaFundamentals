import java.util.Scanner;

public class ArithematicOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number.");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number.");
		int num2 = sc.nextInt();
		sc.close();
		Operations OpObj = new Operations();
		
		OpObj.addOp(num1, num2);
		OpObj.subOp(num1, num2);
		OpObj.mulOp(num1, num2);
		OpObj.modulusOp(num1, num2);
		OpObj.averageOp(num1, num2);

	}

	

}
