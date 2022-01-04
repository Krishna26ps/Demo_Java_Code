

public class FindFrequency {

    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1,5,6,8,7,3};

        int [] fr = new int [arr.length];
        int a = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = a;
                }
            }
            if(fr[i] != a)
                fr[i] = count;
        }
        System.out.println(" Element | Frequency");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != a)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }

    }
}
