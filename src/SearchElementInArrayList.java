import java.util.*;

public class SearchElementInArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 5, 5, 32, 4, 9, 7));

        //Search Element in the Array list
        System.out.println(arrayList.get(3));

        //Remove duplicate element in the arraylist
        Set<Integer> HashSet = new HashSet<>(arrayList);
        System.out.println(HashSet);

        //Find the duplicate element in array list
        HashSet.removeAll(arrayList);
        System.out.println(HashSet);

       //  Hash Set Internal working
        Set<String> st = new HashSet<>();
        st.add("krishna");
        st.add("kaushal");
        System.out.println(st);

        // Hash map Internal working
        HashMap<String,Integer>map = new HashMap<>();
        map.put("harsh",100);
        map.put("azad",150);
        System.out.println(map.get("harsh"));
    }
}
