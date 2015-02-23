import java.util.Scanner;

public class MainC {

	// if statement for maximum and minimum values for final formula
	public static double mm(double x) {
		if (x < 0)
			return 0;
		else if (x > 2.375)
			return 2.375;
		else 
			return x;
	}

	public static void main(String[] args) {

		// Scanner Questions

		Scanner input = new Scanner(System.in); // Create a Scanner object

		System.out.print("Enter touchdowns(TD): ");
		double TD = input.nextDouble();

		System.out.print("Enter total yards (Yards): ");
		double Yards = input.nextDouble();

		System.out.print("Enter Interceptions (INT): ");
		double INT = input.nextDouble();

		System.out.print("Enter completions(comp): ");
		double comp = input.nextDouble();

		System.out.print("Enter passes attempted (ATT): ");
		double ATT = input.nextDouble();

		input.close();

		// Formulas

		double a = (comp / ATT - .3) * 5;
		double b = (Yards / ATT - 3) * .25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - (INT / ATT * 25);

		// Final Formula and output.

		double QBRating = ((mm(a) + mm(b) + mm(c) + mm(d)) / 6) * 100;

		System.out.println("This Quartback (QB) rating is " +  (int)(QBRating * 10.0) / 10.0 + ".");
	}

}
