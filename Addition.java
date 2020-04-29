import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        int a, b, s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number --> ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number --> ");
        b = scanner.nextInt();
        scanner.close();
        s = a + b;
        System.out.println("Summation of Input Numbers --> "+s);
    }
}