import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number --> ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number --> ");
        b = scanner.nextInt();
        scanner.close();
        while (a != b) {
        	if(a > b)   a = a - b;
            else    b = b - a;
        }
        System.out.println("GCD(Greatest Common Divisor) of Input Numbers --> "+b);
    }
}