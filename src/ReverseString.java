import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s1 = sc.next();
        char str[] = s1.toCharArray();
        int s2 = s1.length();

        for (int i = s2-1;i>=0;i--){
            System.out.print(str[i]);
        }

    }
}
