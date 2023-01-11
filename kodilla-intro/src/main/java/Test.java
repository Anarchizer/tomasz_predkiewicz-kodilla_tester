import java.util.Random;

public class Test {
    public static void main(String[] args) {


        int wyswietlMetode = nazwaMetody(2);
        System.out.println(wyswietlMetode);

    }

    public static int nazwaMetody(int number) {
        int result = 0;
        int multiply = 0;
        for (int i = 1; i <= 10; i++) {
            multiply = number * i;
            System.out.println("Mnóż: " + i + " razy: " + number + " Równa się: " + multiply);
        }
        return result;
    }
}

