import java.util.Scanner;

public class ArrayDemo1 {
	String str[]= new String[3];
	int arr[] = {100, 200, 8000,300};
	

	public static void main(String[] args) {
		ArrayDemo1 demo = new ArrayDemo1();
		for (int i : demo.arr) {
			System.out.println(i);
		}
		System.out.println("##############");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<demo.str.length; ++i) {
			System.out.println("Enter names");
			String name = sc.next();
			demo.str[i] = name;
		}
		System.out.println("Display names");
		for (String s : demo.str) {
			System.out.println(s);
		}

	}

}
