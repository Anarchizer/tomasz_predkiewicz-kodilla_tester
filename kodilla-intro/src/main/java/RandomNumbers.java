import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 5000;
        int result = 0;
        int sum = 0;
        int myMin = 0;
        int myMax = 0;
        while (sum < max) {
            int temp = random.nextInt(31);

            if (myMin < sum) {
                myMin = temp;
            }
            if (myMax > sum) {
                myMax = temp;
            }
            sum = sum + temp;
            result++;
        }
        System.out.println(" Minimalna wartość losowania: " + myMin);
        System.out.println(" Maxymalna wartość losownaia: " + myMax);
    }
}