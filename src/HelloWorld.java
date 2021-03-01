import java.io.OutputStream;
import java.util.*;
import java.math.*;
import java.util.Random;

public class HelloWorld {
    public static void main(String args[]) {

        char mas[] = new char[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 characters in sequence:");
        for (int i = 0; i<=2; i++)
        {
            System.out.println("Char #" + i +": ");
            char ch = scan.next().charAt(0);
            mas[i] = ch;
        }
        System.out.println(mas);
    }
}


