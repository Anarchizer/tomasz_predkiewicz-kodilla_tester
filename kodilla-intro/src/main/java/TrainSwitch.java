import java.util.Scanner;

public class TrainSwitch {
    public static char getColor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter color first letter(Available colors: B - Black, G - Green, Y - Yellow, P - Pink): ");
        String newString = input.next().toUpperCase().trim();
        char userChar = newString.charAt(0);
        return userChar;
    }

    public static String getColorSelection() {
        char userSelected = TrainSwitch.getColor();
        while (true) {
            System.out.println("Chosen Color symbol is:");
            char calc = userSelected;
            switch (calc) {
                case 'B':
                    return "Black";
                case 'G':
                    return "Green";
                case 'Y':
                    return "Yellow";
                case 'P':
                    return "Pink";
                default:
                    return "Wrong color.";
            }
        }
    }
}