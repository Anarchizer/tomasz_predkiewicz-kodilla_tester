class LeapYear {
    public static void main(String args[]) {
        int myYear = 2020;

        if(myYear%4==0 && myYear%100 !=0){
            System.out.println("To jest Rok przestępny");
        } else if (myYear%400==0) {
            System.out.println("To też jest rok przestępny");
        } else
        { System.out.println("To jest rok zwykły");
        }
    }
}
