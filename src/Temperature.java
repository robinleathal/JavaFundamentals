import java.util.Scanner;

public class Temperature {
	Double tempInCelcius ;
	
	public void convertTemp(Double tempInFrenheit) {
		
		tempInCelcius = (( 5 *(tempInFrenheit - 32.0)) / 9.0);
		
		System.out.println("Temp in Celcius"+tempInCelcius);
	}

	
}
