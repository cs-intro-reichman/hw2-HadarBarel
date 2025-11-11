

// שאלה 3
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
             
             String str = args [0];
	     int n = Integer.parseInt(args[1]);
             
             String need_an = "A E F H I L M N O R S X";

             for (int i = 0; i < str.length(); i ++){

                if (need_an.indexOf(str.charAt(i)) == -1){
                        System.out.println("Give me " + "a  "+ str.charAt(i) + ": "+ str.charAt(i) + "!");
                }
                else {
                        System.out.println("Give me " + "an "+ str.charAt(i) + ": "+ str.charAt(i) + "!");
                }
             }

              System.out.println("What does that spell?");

                for (int k = 0; k < n; k ++){
                        System.out.println(str + "!!!");
                }

        }
}
