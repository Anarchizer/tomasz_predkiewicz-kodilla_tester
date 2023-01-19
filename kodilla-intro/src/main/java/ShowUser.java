public class ShowUser {
    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int result = 0;
        int mean = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();

        }
        mean = result / users.length;
        System.out.println("Avarage age: " + mean);
        for (int c = 0; c < users.length; c++) {
            if (mean > users[c].getAge()) {
                System.out.println(users[c].getName());
            }
        }
    }
}