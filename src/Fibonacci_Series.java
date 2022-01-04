import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int count = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int i;
        System.out.print(a+" "+b);
         for (i = 2; i<count;i++) {
             c = a + b;
             System.out.print(" " + c);
             a = b;
             b = c;

         }
    }
}
