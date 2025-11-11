// Demonstrates the Collatz conjecture.

// שאלה 5

public class Collatz {
	public static void main(String args[]) {
	    
		int seed = Integer.parseInt(args[0]);	
		String mode = args[1];
		int new_num;
		


		for (int i = 1; i <= seed; i++){

			int counter = 0;
			while (new_num != 1)
			    new_num = i;
				System.out.print(new_num);
				if (new_num % 2 == 0){
					new_num = new_num / 2;
				} 
				else {
					new_num = new_num * 3 + 1;
				}
				counter ++;
			}	
			System.out.print("(" + counter+ ")");
			System.out.println();
		}

		System.out.println()



	}
}
