public class AgeAndHeightChecker {
    String name;
    double age;
    double height;

    public AgeAndHeightChecker(String name, double height, double age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void displayAgeAndHeight() {
        if (name != null)
            if (age > 30 && height > 160) {
                System.out.print("User is older than 30 and taller than 160cm");
            } else {
                System.out.print("User is 30 (or younger) or 160cm (or shorter)");
            }
    }
}