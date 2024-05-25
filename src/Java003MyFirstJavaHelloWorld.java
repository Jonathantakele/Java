import java.net.SocketOption;
import java.util.Scanner;

//public class Java003MyFirstJavaHelloWorld {
//    public static void main (String [] args) {
//        System.out.println("Hello Hora Resort");
//    }
//}
public class Java003MyFirstJavaHelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an your favorite integer:  ");
        int favoriteNumber = input.nextInt();

        System.out.println(favoriteNumber + " it is my favorite integer too!");

    }
}