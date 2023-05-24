import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int x;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number");
        x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number " + x + " is even" );
        }else {
            System.out.println("Number " + x + " is odd");
        }
    }
}
