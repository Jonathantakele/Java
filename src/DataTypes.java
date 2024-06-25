import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        booleanStat(args);
        scannerWithArithmetic(args);
        concatenateStrings(args);
        scannerInteger(args);
        stringExample(args);
        binaryNumber(args);
        float f1 = 4;
        double d1 =2.5;
        System.out.println(f1-d1);
        System.out.println(d1);
    }

    public static void binaryNumber(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int code1 = 'A';
        int code2 = '\u0041';
        System.out.println(code1);
        System.out.println(code2);
    }
//
    public static void booleanStat(String[] args) {
        boolean isAlive = false;
        if (isAlive)
            System.out.println("alive");
        else
            System.out.println("not alive");
    }

    public static void stringExample(String[] args) {
        String text = "This is some text.";
        text.toUpperCase();
        System.out.println(text.toUpperCase());
        System.out.println((text.toUpperCase()).toLowerCase());
        System.out.println(text.length());
        System.out.println(text.isBlank());
        System.out.println(text.charAt(8));
        System.out.println(text.lastIndexOf('t'));
        System.out.println(text.indexOf('x'));
    }

    public static void concatenateStrings(String[] args) {
        String part1 = "my favorite number is ";
        System.out.println(part1 + 5 + 3);
        System.out.println("neso".concat(" acadami ").concat("5"));
    }

    public static void scannerInteger(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Your name is: " + input.nextLine());
        System.out.print("Enter your age: ");
        System.out.println("Your age is: " + input.nextInt());
    }

    public static void scannerWithArithmetic(String[] args) {
        Scanner input = new Scanner(System.in);
       int f = input.nextInt();
        System.out.println(f + 10);
    }
}

