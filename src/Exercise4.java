import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        nestedForLoop(args);
        forLoopQuiz(args);
        doWhileLoop(args);
        whileLoop(args);
        forLoop(args);
        System.out.println("Enter a four digit number: ");
        Scanner s = new Scanner (System.in);
        int duk = s.nextInt();
        if ((duk<1000 && duk >9999)){
            System.out.println("duk is not a four-digit number");
        }else {
            int digit = duk % 10;
            int digit2 = (duk/10)%10;
            int digit3 =(duk/100)%10;
            int digit4 =(duk/1000)%10;
                if (digit + digit2 == digit3 + digit4){
                    System.out.println("duk is a lucky number.");
                    }
                else{
                    System.out.println("duk is not lucky number.");
                    }
             }
    }

    public static void doWhileLoop(String[] args) {
        Scanner s =new Scanner(System.in);

        int i;
        do {
            System.out.println("enter a number between 1 and 10: ");
            i = s.nextInt();
        }
        while(i < 1 || i > 10);
        System.out.println("is between 1 and 10. Thanks!");

    }

    public static void whileLoop(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 10: ");

        int i = s.nextInt();
        while(i<1||i>10){
            System.out.println("Enter an integer between 1 and 10: ");
            i=s.nextInt();
        }
        System.out.println(i + " is between 1 and 10. Thanks!");
    }

    public static void forLoop(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int i;
        for (i = 1; i <= 10; i++) {
            i = s.nextInt();
            if (i > 1 && i < 10) {
                System.out.print("is a number between 1 and 10. Thanks!!");

            } else{
                System.out.println(" is not between 1 and 10. Please try again: ");
                i= s.nextInt();
            }
        }
    }

    public static void nestedForLoop(String[] args) {
        int i;
        int j;

        for (i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }

    public static void forLoopQuiz(String[] args) {
        int i;
        for (i=1;i<=10;i++){
            if (i%2==0)
                System.out.print(i + " ");
        }
    }
}


