public class Loops {
    public static void main(String args[]){

        int [] numbers = new int [3];

        numbers [0] = 11;
        numbers [1] = 24;
        numbers [2] = 36;

        System.out.println(sumNumbers(numbers));
    }
    public static int sumNumbers(int[] numbers){
        int result = 0;
        for(int i =0; i < numbers.length; i++){
            result = result + numbers[i];
        System.out.println("Wynik dodawania po każdym obrocie pętli to: " + result);
    }
        System.out.print("Ostateczny wynik dodawania elementów tablicy to: ");
        return result;
    }
    }

