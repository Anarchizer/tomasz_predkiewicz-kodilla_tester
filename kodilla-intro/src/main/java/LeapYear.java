class LeapYear {
    public static void main(String args[]) {

        years(-2000);

    }

    public static int years(int myYear) {
        if (-238 < myYear) {

            if (myYear % 4 == 0 && myYear % 100 != 0) {
                System.out.println("To jest Rok przestępny");
            } else if (myYear % 400 == 0) {
                System.out.println("To też jest rok przestępny");
            } else {
                System.out.println("To jest rok zwykły");
            }
        } else {
            System.out.println("Rok przestepny wprowadzony został od 238 p.n.e roku");
        }
        return myYear;
    }
}