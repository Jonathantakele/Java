import java.util.Scanner;

public class Exercise2 {

    public static void main (String[] args) {
        exampleForCasting(args);
        augmentationEg(args);
        evenOdd(args);
        nestedIfCondition(args);
        conditionalOperation(args);
        int i = 1;
        int w = i--;
        int y = i++;
        int x = --i;
        int j = ++i;

        System.out.println("i is " + i);
        System.out.println("j is " + j);
        System.out.println("y is " + y);
        System.out.println("x is " + x);
        System.out.println("w is " + w);
    }

    public static void exampleForCasting(String[] args) {
        double d1 = 3.5 + 4;
        double d2 = 2.4f;
        long l1 = 100L;
        int i1 = (int) 4.5;
        int i2 = (int) 8L;
        float f1 = (float) 4.5;
        double d8 = 1.0 / 2;
        int i4 = (int) (1.0 / 2.0);
        int i5 = 5;
        int i6 = 2;
        double d3 = 2;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(f1);
        System.out.println(d8);
        System.out.println(i4);
        System.out.println(i5 % i6);
        System.out.println(i5 / d3);
    }

    public static void augmentationEg(String[] args) {
        int i1 = 5;
        i1 *= 5 + 2;
        System.out.println(i1);
        System.out.println("this is the number " + 2 + (2 + 2));
    }

    public static void evenOdd(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if ((input.nextInt() % 2 == 0)) {
            System.out.println("even");
        } else  {
            System.out.println("odd");

        }
    }

    public static void conditionalOperation(String[] args) {
        int a = 10;
        int b = 15;
        String name = "yonathan";
        if (a > b) {
            System.out.println("a is greater");
        } else if (b < a) {
            System.out.println("b is smaller");

        } else if (a < b) {
            System.out.println("a is smaller");
        }
        System.out.println(name.isEmpty());
    }

    public static void nestedIfCondition(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner s = new Scanner(System.in);

        int a =s.nextInt();
        if (a > 10){
            System.out.println(a + " is greater than 10");
        } else if(a < 10){
            System.out.println(a + " is less than 10");
        }else{
            System.out.println(a + " is equal to 10");
        }
    }
}
