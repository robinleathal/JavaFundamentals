import java.util.Scanner;

public class TestApp {
	
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Fahrenheit temperature");
		Double tempInFrenheit = sc.nextDouble();
		Temperature tempObj = new Temperature();
		tempObj.convertTemp(tempInFrenheit);

	}

}
