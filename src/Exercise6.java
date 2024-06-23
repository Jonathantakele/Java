import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Palindrome(args);
        readInversely(args);
        spaceBetweenLetter(args);
        fibonacci(args);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        System.out.println("sum " + sum);
    }

    public static void fibonacci(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        int n = s.nextInt();
        int sum =0;
        int v1 = 1;
        int v2 = 1;

        for (int i = 1; i <=n-2 ;i++){
            sum = v1 + v2;
            v1 = v2;
            v2 = sum;
        }
        System.out.println("nth fibonacci number is = " + (sum==0? 1: sum));
    }

    public static void spaceBetweenLetter(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.print("Enter any string: ");
        String n = s.nextLine();


        for (int i = 0; i <=n.length()-1 ; i++)
            System.out.print(n.charAt(i) + " ");

        }

    public static void readInversely(String[] args) {
        String str = "     Some String";
        String reverse = " ";
        for (int i = str.length()-1; i >= 0; i-- )
           reverse += str.charAt(i);
        System.out.print(reverse);
    }

    public static void Palindrome(String[] args) {
       String pal = "12321";

       boolean isPalindrome = true;
       for (int i = 0,j = pal.length()-1 ; i < j; i ++,j--){
           if (pal.charAt(i)==pal.charAt(j))
               continue;
       isPalindrome = false;
       break;
       }
        System.out.println(isPalindrome ? "Palindrome" : "Is Not Palindrome");
    }
}
