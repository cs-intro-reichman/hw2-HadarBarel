

// שאלה 3
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
             
             String original_String = args [0];
	     int n = Integer.parseInt(args[1]);
             String need_an = "A E F H I L M N O R S X";
             String new_String = original_String.toUpperCase();   

             for (int i = 0; i < new_String.length(); i ++){

                if (need_an.indexOf(new_String.charAt(i)) == -1){
                        System.out.println("Give me " + "a  "+ new_String.charAt(i) + ": "+ new_String.charAt(i) + "!");
                }
                else {
                        System.out.println("Give me " + "an "+ new_String.charAt(i) + ": "+ new_String.charAt(i) + "!");
                }
             }

              System.out.println("What does that spell?");

                for (int k = 0; k < n; k ++){
                        System.out.println(new_String + "!!!");
                }

        }
}
