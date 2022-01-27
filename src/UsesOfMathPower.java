import java.util.Scanner;

public class UsesOfMathPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find square, cube and fourth power of it.");
		int num = sc.nextInt();
		sc.close();
		MathPowerClass Obj = new MathPowerClass();
		Obj.squarePower(num);
		Obj.cubePower(num);
		Obj.fourthPower(num);

	}

}
