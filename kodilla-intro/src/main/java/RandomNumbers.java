import java.util.Random;

public class RandomNumbers{
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int[] tab = new int[1000];
        for(int i = 0; i<tab.length; i++){
            tab[i] = random.nextInt(31);
            System.out.println("Wynik: " + tab[i]);
            sum = sum + tab[i];
            System.out.println("Wynik dodawania losowania: " + sum);


            int max = 30;
            int min = 0;
            if(tab[i]==max){
                System.out.println("Wartość max: " + tab[i]);
                }
            if(tab[i]==min){
                System.out.println("Wartosć min: " + tab[i]);
            }
            if(sum>5000){
                break;
            }
        }
    }
}

