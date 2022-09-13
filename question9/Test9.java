package JavaCollectionAssignment2.question9;

import java.util.*;
public class Test9 {
    public static void checkAnagram(String st,List<String> list) {
        boolean flag = true;
        st = st.toLowerCase();
        char arr2[] = st.toCharArray();
        Arrays.sort(arr2);
        // System.out.println("main string"+arr2);


        for (int i = 0; i < list.size(); i++) {
            String newStr = list.get(i);
            newStr = newStr.toLowerCase();
            char arr[] = newStr.toCharArray();
            Arrays.sort(arr);
            boolean result = Arrays.equals(arr2, arr);
            if (result) {
                System.out.println(list.get(i));
            }

        }

    }
    public static void main(String[] args) {
        String st = "listen";
        List<String> names = List.of("Enlists","google","inlets","banana");
         checkAnagram(st,names);
    }
}
