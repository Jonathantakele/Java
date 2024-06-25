import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        exerciseII(args);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++){

            for (int j = 1 ; j <=n - i; j++ )
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                    if (i == n)
                        System.out.print("*");
                    else if (j == 1 || j == 2 * i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");


                System.out.println();
            }
    }

    public static void exerciseII(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i=1; i<=n;i++){
            for (int j = 1;j<=n;j++)
                if (i==1||i==n)
                    System.out.print("*");
            else if (j==1||j==n)
                    System.out.print(" ");
            else
                    System.out.print("*");

            System.out.println();
        }
    }
}
