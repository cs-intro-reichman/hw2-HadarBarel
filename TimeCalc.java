public class TimeCalc {
    public static void main(String[] args) {
        //שאלה 1

       
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes_to_add = Integer.parseInt(args[1]);
        

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(minutes_to_add);
        

    }
}
