import java.util.Scanner;

public class studentPointManagement {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's Point: ");
        x = scanner.nextInt();
        if (x >= 50 & x <60) {
            System.out.println("Grade D");
        } else if (x >= 60 & x <70) {
            System.out.println("Grade C");
        } else if (x >=70 & x < 80) {
            System.out.println("Grade B");
        } else if (x >=80 & x <100){
            System.out.println("Grade A");
        }
    }
}
