import java.util.Scanner;
	public class PoundsToKilo{
	public static void main (String [] args){
	
	Scanner input = new Scanner (System.in);
	
	final double KILOGRAMS_PER_SECONDS = 0.454;
	
	System.out.print("Enter a number for pounds: ");
	double pounds = input.nextDouble();
	
	double kilograms = pounds * KILOGRAMS_PER_SECONDS;
	System.out.println (pounds + " pounds is " + kilograms + " kilograms");
	
		
	}
}
