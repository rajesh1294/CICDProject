import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year --> ");
        a = scanner.nextInt();
        scanner.close();
        if(a%4 == 0 && a%100 == 0 && a%400 == 0)    System.out.println(a+" is a Leap Year.");
        else if(a%4 == 0 && a%100 != 0)     System.out.println(a+" is a Leap Year.");
        else    System.out.println(a+" is Not a Leap Year.");
    }
}