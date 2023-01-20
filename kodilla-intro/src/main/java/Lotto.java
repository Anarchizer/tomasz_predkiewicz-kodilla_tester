import java.util.Random;

class Lotto {

    public static void main(String args[]) {

        System.out.println(getCountOfRandomNumber(20));

    }

    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            System.out.print("Losowana liczba: " + temp + " ");
            sum = sum + temp;
            System.out.println("Wynik dodawania:" + sum);
            result++;
        }
        System.out.print(" Ostatni wynik losowania: ");
        return result;
    }
}

