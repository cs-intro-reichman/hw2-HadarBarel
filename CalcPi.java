// Computes an approximation of PI.
//שאלה 4
public class CalcPi {
	public static void main(String [] args) { 
	

		int n = Integer.parseInt(args[0]);	
		double quarterPi = 1;
		int counter = 1;

		for (int i = 1; i < n; i ++){

			counter += 2;
			quarterPi = quarterPi + (Math.pow(-1, i)/ (counter));
			
		}

		double aproximated = quarterPi * 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:  " + aproximated);
	}
}
