
public class Swap_To_Number {
    public static void main(String[] args) {
        // Swap two numbers without using third object
        int a = 12;
        int b = 10;
        System.out.println("Before swap number of a = "+a + " and " + "b = " +b);
         a = a+b;
         b = a-b;
        System.out.println("After swap of b is:- " +b);
         a = a-b;
        System.out.println("After swap of a is:- " +a);




        // Swap two String without using third object

        String c = "Hello";
        String d = "World";
        System.out.println("Before swap: " + c + " " + d);
        c = c + d;
        d = c.substring(0, c.length() - d.length());
        c = c.substring(d.length());
        System.out.println("After : " + c + " " +d);
    }
}
