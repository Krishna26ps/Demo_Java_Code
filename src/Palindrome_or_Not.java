import java.util.Scanner;

public class Palindrome_or_Not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls. Enter the Number:- ");
        int n = sc.nextInt();
        int sum = 0;

        int a;
        a  = n;
        while (n>0){
         int   r = n%10;
         sum =(sum*10)+r;
         n = n/10;
        }
        if(a==sum){
            System.out.println("Yes "+a+" It is  Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}
