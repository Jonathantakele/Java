import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        NameAndAge(args);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite integer: ");
        String s = " is my favorite integer too.";
        System.out.println(input.nextInt() + s);

    }

    public static void NameAndAge(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Your name is: " + input.nextLine());
        System.out.print("Enter your age: ");
        System.out.println("Your age is: " + input.nextInt());
    }
}
