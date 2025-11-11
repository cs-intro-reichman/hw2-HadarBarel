// Demonstrates the Collatz conjecture.

// שאלה 5

public class Collatz {
	public static void main(String args[]) {
	    
		int seed = Integer.parseInt(args[0]);	
		String mode = args[1];


		for (int i = 1; i <= seed; i++){

			String output = "";
			int new_num = i;
			int counter = 1;
			output += i + " "; 
			if (new_num == 1){
				new_num = new_num * 3 + 1;
				counter ++;
				output += new_num + " ";
			}
			while (new_num != 1){
					
				if (new_num % 2 == 0){
					new_num = new_num / 2;
				} 
				else {
					new_num = new_num * 3 + 1;
				}
				output += new_num + " ";
				counter ++;

			}
			if (mode.equals("v")){
				System.out.print(output+ "(" + counter + ")");
				System.out.println();
			}
		}	

		System.out.println("Every one of the first " +seed + " hailstone sequences reached 1.");
	}
}
