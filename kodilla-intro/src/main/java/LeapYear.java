public class LeapYear {
    public static void main(String[] args){
        int myYear = 2024;
        boolean leapYear = false;

        if((myYear%4==0) || (myYear%400==0)){
            leapYear = true;
        }
        System.out.println("Year " + myYear + " is Leap Year: " + leapYear);

    }
}
