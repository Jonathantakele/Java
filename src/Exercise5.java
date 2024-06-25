import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        minMax(args);
        findPrimeNumber(args);
        strictDivisor(args);
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("enter a number: ");
            sum += s.nextInt();
            if (sum > 100)
                break;


        }
        System.out.println("Done: " + sum);
    }

    public static void strictDivisor(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = s.nextInt();

//        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
//                sum += i;
                System.out.println(i);

    }

    public static void findPrimeNumber(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        System.out.println(isPrime ? "Prime" : "Not Prime");

    }

    public static void minMax(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = n;
        int max = n;
        if (n >= 0) {
            while (true) {
                n = s.nextInt();

                if (n < 0)
                    break;

                max = n > max ? n : max;
                min = n < min ? n : min;

            }
            System.out.println("max: " + max + " min: " + min);
        } else {
            System.out.println(n + " is invalid");
        }
    }


}










