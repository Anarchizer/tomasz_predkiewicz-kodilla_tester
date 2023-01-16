import java.util.Random;

public class RandomNumbers {
    int draw;
    int max;
    int min;

    public RandomNumbers() {
        this.min = 0;
        this.max = 0;

    }

    public void getRandom() {
        Random random = new Random();
        int border = 5000;
        int sum = 0;
        while (sum < border) {
            draw = random.nextInt(31);
            System.out.println("wylosowania liczba to: " + draw);

            sum = sum + draw;
            System.out.println("Po dodaniu wynosi: " + sum);
            if (sum >= border) {
                break;
            }

        }
    }
}
