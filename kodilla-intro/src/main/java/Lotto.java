import java.util.Random;

class Lotto {

    public static void main(String args[]) {

        System.out.println(getCountOfRandomNumber(10));

    }
    public static String getCountOfRandomNumber(int max) {
        Random r = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = r.nextInt(10);
            System.out.println("Suma przed działaniem: " + sum);
            sum = sum + temp;
            System.out.println("Suma po działaniu: " + sum);
            result=result+1;
        }
        return String.valueOf(result);
    }
}

