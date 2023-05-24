import java.util.Scanner;
	public class BodyMassIndex {
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Input weight in pounds: ");
	double weight = sc.nextDouble();
	System.out.print("Input height in inches: ");
	double height = sc.nextDouble();

double BMI = (weight*0.45359237) / ((height*0.0254) * (height*0.0254));
System.out.printf("The Body Index (BMI) is %.4f pounds/inches2.%n", BMI);


}
}
