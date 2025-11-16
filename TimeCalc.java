public class TimeCalc {
    public static void main(String[] args) {
        //שאלה 1

       
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes_to_add = Integer.parseInt(args[1]);
        
        int total_minutes = hours * 60 + minutes + minutes_to_add;
        int new_hours = (total_minutes / 60) % 24; 
        int new_minutes = total_minutes % 60;

        if (new_hours < 10){
            System.out.print("0" + new_hours + ":");
        }
        else{
            System.out.print(new_hours + ":");
        }

        if (new_minutes < 10){
            System.out.print("0" + new_minutes);
        }
        else{
            System.out.print(new_minutes);
        }
    }
}
