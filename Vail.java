import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Vail {

    public static int[] rotateLeft(int[] arr, int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be a positive integer");
        }
        number = number % arr.length;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(i + number) % arr.length];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        for (int i = 0; i < 6; i++) {
            int n = (int) (Math.random() * 9 + 1);
            randomNumbers[i] = n;
        }
        int[] array = {1,2,3,4,5,6,7};
        System.out.println("Random numbers: " + Arrays.toString(array)); //randomNumbers
                                                          // here you can use random numbers as well instead of 'array'
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many times you want to rotate array to the left: ");
        int number = sc.nextInt();
        int[] rotated = rotateLeft(array, number); //randomNumbers
                                                  //if you want to use random numbers then put 'randomNumbers' instead of 'array'
        System.out.println(Arrays.toString(rotated));

    }
}