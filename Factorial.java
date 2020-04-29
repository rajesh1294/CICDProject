import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number --> ");
        a = scanner.nextInt();
        scanner.close();
        long fact = 1, i = 1;
        while(i <= a)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of Input Number --> "+fact);
    }
}