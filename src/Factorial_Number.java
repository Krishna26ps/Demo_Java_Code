import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number;- ");
        int b = sc.nextInt();
        int i;
        int a = 1;

        for (i = 1; i <= b; i++) {
            a = a * i;
        }
        System.out.println("Factorial of " + b + " is: " + a);


    }

}
