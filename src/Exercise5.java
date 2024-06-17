import org.w3c.dom.ls.LSOutput;

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

        int sum = 0;
        int i;
        for (i = 1; i <= n/2; i++)
            if (n % i == 0)
                sum += i;
        System.out.println(sum + n);

    }
    public static void findPrimeNumber(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();

        int sum = 1;
        int i;
        for ( i = 2; i <= n/2 ;i++)
        if (n % i==0)
            sum += i;

        System.out.println(sum == 1? "prime" : "not prime");

    }

    public static void minMax(String[] args) {
        Scanner s = new Scanner(System.in);
         int  n = s.nextInt();
         int  min = n;
         int  max = n;

        while(true){
          n = s.nextInt();

          if(n < 0)
              break;

          if(n < min)
              min = n;

          if (n > max)
              max = n;

        }
        System.out.println("max: " + max + " min: " + min );

    }
}




