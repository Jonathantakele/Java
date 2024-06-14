import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
             evenOddWithSwitch(args);
             createACalculator(args);

            Scanner c = new Scanner(System.in);
            System.out.print("please enter num1 op num2(5 * 3): ");
            double d1 = c.nextInt();
            char op = c.next().charAt(0);
            double d2 = c.nextInt();
            if (op =='+')
                System.out.println((int)(d1 + d2));

            else if (op =='-')
                System.out.println((int) (d1 - d2));

            else if (op =='*')
                System.out.println((int)(d1 * d2));

            else if(op =='/')
                System.out.println((d1 / d2));

        }


    public static void evenOddWithSwitch(String[] ignoredArgs) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        switch (n%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("NaN");

        }
    }
    public static void createACalculator(String[] ignoredArgs) {
        int n =15;
        switch (n){
            case 5:
                System.out.println("=10");
                break;
            case 10:
                System.out.println("=90");
                break;
            case 15:
                System.out.println("=-3");
                break;
            default:
                System.out.println("non of the above");
        }
    }
    }


