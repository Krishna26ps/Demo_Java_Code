

public class StringCharWithDuplicate {

    public static void main(String[] args) {
        String s1 = "KrishnaKaushal";
        System.out.println("Total number of character in string : "+s1.length());

      int count;
      char string[] = s1.toCharArray();
        System.out.println("Duplicate character in given String :- ");

        for (int i = 0;i<s1.length();i++){
            count = 1;
            for (int j = i+1;j<s1.length();j++){
                if (string[i]==string[j]){
                    count++;
                    string[j] = 0;
                }
            }

            if (count> 1){
                System.out.println(string[i]);
            }
        }
    }
}
