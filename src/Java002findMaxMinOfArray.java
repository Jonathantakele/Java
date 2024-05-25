import java.util.Arrays;
import java.util.Scanner;

/**
 * this code takes the number of array elements
 * and gives you the maximum and minimum of the array
 */

public class Java002findMaxMinOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int arraySize = input.nextInt();
        // I will check if the input value is right for an array size
        while(arraySize <=0) {
            System.out.println("Please enter a positive integer");
            arraySize = input.nextInt();
        }
        int [] myArray = new int[arraySize];
        arrayFiller(myArray);
        theMinMax(myArray);
        // myArray is created [ x1, x2, x3, x4 , x5, x6]
        //

    }
    public static void arrayFiller (int [] filledArray) {
        Scanner input = new Scanner(System.in);
        //filled array [ x1, x2, x3, x4 , x5, x6]
        for (int i = 0; i < filledArray.length; i++) {
            System.out.println("Tell me the " + i + " member of the array");
            filledArray[i] = input.nextInt();
        }
        System.out.println("The array you entered is " + Arrays.toString(filledArray));
    }
    public static void theMinMax (int[] minMaxArray) {
        int min = minMaxArray[0];
        int max = minMaxArray[0];
        for (int i = 0; i < minMaxArray.length; i++) {
            if (min > minMaxArray[i]) {
                min = minMaxArray[i];
            }
            if(max < minMaxArray[i]) {
                max = minMaxArray [i];
            }
        }
        System.out.println("The maximum value of the array is " + max + " and the minimum value is " + min );

    }
}
