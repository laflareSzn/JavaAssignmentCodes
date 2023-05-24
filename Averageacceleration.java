import java.util.Scanner;
public class Averageacceleration{

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("v1; v0; t;");
	
	double startingVelocity = input.nextDouble();
	double endingVelocity = input.nextDouble();
	double time = input.nextDouble();
	
	double average = (endingVelocity - startingVelocity) / time;

	System.out.printf("average of %f", average );
}


}
